/**********************************************************************************************************************
 * Author: JIE YI (Jay)
 * Purpose: This is the control class that can hold most function and method to run a game.
 * Create Date: 28/07/2017
 * Version: 2.13
 * Update Date: 09/09/2017
 **********************************************************************************************************************/

package NewVersion;

import java.util.*;
import java.util.concurrent.TimeUnit;

public class Driver {
    private final int THIRDPLACEPOINT = 1;
    private final int SECONDPLACEPOINT = 2;
    private final int FIRSTPLACEPOINT = 5;
    private Participant participant;
    private Game game;
    private Results results;
    private String gameType = "";
//    private int athleteNum = 0;
    private Prediction prediction = new Prediction("");
    private ProcessResults processResults;
    int swimmingCount = 1;
    int runningCount = 1;
    int cyclingCount = 1;
    // private Official official;

    ArrayList<Results> resultsArrayList = new ArrayList<>();
    ArrayList<Athlete> participantArrayList = new ArrayList<>();
    ArrayList<Official> officialArrayList = new ArrayList<>();
    ArrayList<ProcessResults> processResultsArrayList = new ArrayList<>();

    public void start(ArrayList<Participant> participants) throws Exception {
        splitArrayList(participants);
        menu(participants);
    }

    private void menu(ArrayList<Participant> participants) throws Exception {
        String menuLoop = "";
        int mainMenuOption = 0;
        boolean bMainOption = false;

        do {
            menuText();
            do {
                mainMenuOption = intException(); // exception
                bMainOption = bMainOptionTest(mainMenuOption); // test mainMenuOption in the range
            } while (!bMainOption);
            bMainOption = false;
            switch (mainMenuOption){
                case 1:
                    selectGame(participants);
                    selectAthlete(participants);
                    System.out.println("Athlete are ready for the game");
                    break;
                case 2:
                    // prediction = new Prediction("");
                    predictAthlete();
                    break;
                case 3:
                    if (runGame()){
                        setGame(gameType);
                        if (startGame(participantArrayList,game)){
                            processGame();
                            setFinalResult(processResultsArrayList,setOfficial());
                            setPoint(participantArrayList,results);
                        }
                    }
                    break;
                case 4:
                    displayResult();
                    break;
                case 5:
                    displayPoint(participants);
                    break;
                case 6:
                    menuLoop = "Exit";
                    break;
            }
        }while (menuLoop != "Exit");
    }

    private void displayResult() {
        if (resultsArrayList.size() != 0){
            for (int i = 0; i <resultsArrayList.size();i++){
                System.out.println(resultsArrayList.get(i).toString());
            }
        }else {
            System.out.println("No game had hold before, please run a game first.");
        }



    }

    public boolean startGame(ArrayList<Athlete> participantArrayList, Game game) throws Exception {
        if (participantArrayList.size() < 4) {
            // cancel the game
            System.out.println("Sorry, the athlete numbers is less than 4, this game can not be accessed!");
            participantArrayList.clear();
            System.out.println("This game had canceled, please start again.");
            return false;
        } else {
            processResults = new ProcessResults("",0);
            // processGame(); // the process text
            processResultsArrayList = processResults.processResultsArrayList(participantArrayList,game);
            for (int i = 0; i < processResultsArrayList.size(); i++) {
                System.out.println(processResultsArrayList.get(i).toString());
            }
            return true;
        }
    }

    private void setFinalResult(ArrayList processResultsArrayList, Official official) throws Exception{
        results = new Results(game,"","","",official);
        results.setWinners(processResultsArrayList);
        results.setOfficial(official);
        results.setGame(game);
        resultsArrayList.add(results);

        // prediction.prediciton(results.getFirstID());
        System.out.println(prediction.match(results.getFirstID()));
        processResults.cleanArrayList();
        // TODO: 2017/9/9 check here
        prediction.setPredicationID("");
    }

    private void setPoint(ArrayList<Athlete> athleteArrayList, Results results){
        for (int i =0; i< athleteArrayList.size();i++){
            if (results.getFirstID().equalsIgnoreCase(athleteArrayList.get(i).getParticipantID())){
                Athlete athlete = athleteArrayList.get(i);
                athlete.setLastPoint(FIRSTPLACEPOINT);
            }
            if (results.getSecondID().equalsIgnoreCase(athleteArrayList.get(i).getParticipantID())){
                Athlete athlete = athleteArrayList.get(i);
                athlete.setLastPoint(SECONDPLACEPOINT);
            }
            if (results.getThirdID().equalsIgnoreCase(athleteArrayList.get(i).getParticipantID())){
                Athlete athlete = athleteArrayList.get(i);
                athlete.setLastPoint(THIRDPLACEPOINT);
            }
        }
    }

    private void displayPoint(ArrayList<Participant> participants) {
        for (int i =0; i<participants.size()-4; i++)
            System.out.println(participants.get(i).toString());
    }

    private void selectAthlete(ArrayList<Participant> participants) {
        System.out.println("1\tadd athletes by yourself? (less than 8 athletes)\n"
                            +"2\tadd athletes automatically (full fill)");
        int athleteNum;
        int athleteChoose;
        boolean bAthleteChoose;
        do {
            athleteChoose = intException(); // exception
            if (athleteChoose == 1 || athleteChoose == 2) {
                bAthleteChoose = true;
            }else {
                bAthleteChoose = false;
                System.out.println("\n\tYour option is invalid, please enter number 1 or 2.");
            }
        } while (!bAthleteChoose);
        switch (athleteChoose){
            case 1:
                athleteNum =  athleteNo();
                addParticipationList(participants, athleteNum);
                break;
            case 2:
                fullFillParticipationList(participants, 8);
                break;
        }

    }

    private void fullFillParticipationList(ArrayList<Participant> participants, int AthleteNo) {
        for (int i = 0; i <AthleteNo; i++){
            boolean bCheckExist;// = false;
            boolean bGameType;// = false;
            do {
                bGameType = false;
                Random random = new Random();
                int index = random.nextInt(participants.size()- 4);
                Athlete athlete = (Athlete) participants.get(index);
                bCheckExist = checkExist(athlete.getParticipantID());
                if (bCheckExist){
                    // bCheckExist = true && bGameType = false
                    bGameType = checkGameType(athlete);
                    if (bGameType) {
                        // bCheckExist = true && bGameType = true
                        // if game type is right then add to list.
                        participantArrayList.add(athlete);
                    }
                }
            } while (!bCheckExist || !bGameType);
        }
        displayAthlete(participantArrayList);
    }

    private void addParticipationList(ArrayList<Participant> participants, int athleteNum) {
        Scanner input = new Scanner(System.in);
        for (int i =0; i < athleteNum; i++){
            listPlayers(participants);
            System.out.println("Please enter athlete's ID to add athlete to play game.");
            System.out.println("Please add（" +(i+1)+" of "+athleteNum+"） athlete: ");
            String addParticipant = "";
            boolean bAddParticipant;// = false;
            boolean bCheckExist;// = false;
            boolean bGameType;// = false;
            do {
                bAddParticipant = false;
                bCheckExist = false;
                bGameType = false;
                addParticipant = input.next();
                for (int j=0; j< participants.size(); j++){
                    bAddParticipant = addParticipant.equalsIgnoreCase(participants.get(j).getParticipantID());
                    if (bAddParticipant) {
                        // bAddParticipant = true && bCheckExist = false && bGameType = false
                        Athlete athlete = (Athlete) participants.get(j);
                        bCheckExist = checkExist(athlete.getParticipantID());
                        if (bCheckExist){
                            // bAddParticipant = true && bCheckExist = true && bGameType = false
                            bGameType = checkGameType(athlete);
                            if (bGameType) {
                                // bAddParticipant = true && bCheckExist = false && bGameType = true
                                participantArrayList.add(athlete);
                                break;
                            }else
                                // bAddParticipant = true && bCheckExist = true && bGameType = false
                                break;
                        }else{
                            // bAddParticipant = true && bCheckExist = false && bGameType = false
                            bGameType = true;
                            break;
                        }
                    }else {
                        // bAddParticipant = false && bCheckExist = false && bGameType = false
                        bCheckExist = true;
                        bGameType = true;
                    }
                }
                warning(bAddParticipant,bCheckExist,bGameType,participants);
            } while (!bAddParticipant || !bGameType || !bCheckExist);
        }
        displayAthlete(participantArrayList);
        // System.out.println("Athlete are ready for the game");

    }

    private void warning(boolean bAddParticipant, boolean bCheckExist, boolean bGameType, ArrayList participants) {
        if (!bAddParticipant)
            System.out.println("We don't have this athlete, please enter the existing athleteID.");
        if (!bCheckExist)
            System.out.println("This athlete already the add to list, please select again.");
        if (!bGameType){
            listPlayers(participants);
            System.out.println("This athlete is not suitable for " + gameType +", please enter the ID above: ");
        }
    }

    private int athleteNo() {
        int athleteNum;
        boolean bAthleteNum;
        System.out.println("How many athletes your want to add?");
        do {
            athleteNum = intException(); // how many athletes you want
            if (athleteNum >= 1 && athleteNum <= 8) bAthleteNum = true;
            else {
                bAthleteNum = false;
                System.out.println("\n\tYour option is invalid, please enter number 1 or 8.");
            }
        } while (!bAthleteNum);
        return athleteNum;
    }

    // Select a game to run
    private void selectGame(ArrayList<Participant> participants) {
        int gameMenuOption = 0 ;
        boolean bGameMenuOption = false;
        gameMenuText();
        do {
            gameMenuOption = intException(); // exception
            bGameMenuOption = bGameMenuOptionTest(gameMenuOption); //test mainMenuOption in the range
        } while (!bGameMenuOption);
        switch (gameMenuOption){
            case 1:
                gameType = "Swimming";
                break;
            case 2:
                gameType ="Cycling";
                break;
            case 3:
                gameType = "Running";
                break;
            case 4:
                break;
        }
    }

    private boolean bGameMenuOptionTest(int gameMenuOption) {
        if (gameMenuOption >= 1 && gameMenuOption <= 4)
            return true;
        else {
            System.out.println("\tYour option is invalid, please enter number between 1 to 4.");
            return false;
        }
    }

    private boolean bMainOptionTest(int mainMenuOption) {
        if (mainMenuOption >= 1 && mainMenuOption <= 6)
            return true;
        else {
            System.out.println("\tYour option is invalid, please enter number between 1 to 6.");
            return false;
        }
    }

    private void splitArrayList(ArrayList<Participant> participants) {
       for (int i =0; i < participants.size();i++){
           Participant participant = participants.get(i);
           if (participant instanceof Official) {
               Official official = (Official) participant;
               officialArrayList.add(official);
           }
       }
    }

    private Official setOfficial(){
        Random random = new Random();
        int index = random.nextInt(officialArrayList.size()-1);
        Official official = officialArrayList.get(index);
        return official;
    }

    private void setGame(String gameType){
        // call from start a game (option3)

        String gameID = "";
        game = new Game("","");
        if (gameType == "Swimming"){
            gameID = "S"+swimmingCount;
            swimmingCount++;
        }
        if (gameType == "Running"){
            gameID = "R"+runningCount;
            runningCount++;
        }
        if (gameType == "Cycling"){
            gameID = "C" +cyclingCount;
            cyclingCount++;
        }
        game.setGameID(gameID);
        game.setGameType(gameType);
    }

    private int intException(){
        Scanner input = new Scanner(System.in);
        int inputInt = 0;
        try {
            inputInt = input.nextInt();
        } catch (Exception e){
            System.out.println("\n\tYour option is invalid, please enter number\n\n");
        }
        return inputInt;
    }

    private void processGame() throws Exception {
        System.out.println("Athletes are ready to compete, wait a second.");
        TimeUnit.SECONDS.sleep(1);
        System.out.println("**********\t3\t***********");
        TimeUnit.SECONDS.sleep(1);
        System.out.println("**********\t22\t***********");
        TimeUnit.SECONDS.sleep(1);
        System.out.println("**********\t1\t***********");
        TimeUnit.SECONDS.sleep(1);
        System.out.println("/******************************************************\n" +
                "*\n" +
                "* \tResult competed, will be list blow\n" +
                "*\n" +
                "*******************************************************/");
        TimeUnit.SECONDS.sleep(1);
    }

    private void menuText(){
        System.out.print("\tOlympic Game\t\n=============================\n" +
                "1.\tSelect a game to run\n" +
                "2.\tPredict the winner of the game\n" +
                "3.\tStart the game\n" +
                "4.\tDisplay the final results of all games\n" +
                "5.\tDisplay the points of all athletes\n" +
                "6.\tExit\n\n" +
                "Enter an option: ");
    }

    private void gameMenuText(){
        System.out.print("\tOlympic Game\t\n=============================\n" +
                "1.\tSwimming\n" +
                "2.\tCycling\n" +
                "3.\tRunning\n" +
                "4.\tBack to main menu without save game\n\n" +
                "Enter an option: ");
    }

    public void listPlayers(ArrayList<Participant> participants) {
        for (int i = 0; i < participants.size();i ++){
            if(participants.get(i) instanceof SuperAthlete){
                System.out.println(participants.get(i).printParticipant());
            } else if (gameType =="Swimming" && participants.get(i) instanceof Swimmer){
                System.out.println(participants.get(i).printParticipant());
            } else if (gameType == "Running" && participants.get(i) instanceof Runner){
                System.out.println(participants.get(i).printParticipant());
            } else if (gameType == "Cycling" && participants.get(i) instanceof Cyclist){
                System.out.println(participants.get(i).printParticipant());
            }
        }
    }

    private boolean checkExist(String addingAthlete) {
        boolean exist = false;
        if (participantArrayList.size() != 0) {
            // if not null then check in the participantArrayList have this athlete or not
            for (int i = 0; i < participantArrayList.size(); i++) {
                if (addingAthlete.equalsIgnoreCase(participantArrayList.get(i).getParticipantID())) {
                    // if yes then re turn false to stop system add this athlete in.
                    exist = false;
                    // even find the same ID then break the loop and return exist
                    break;
                } else
                    //if not, then turn to true to ask system add this athlete in.
                    exist = true;
            }
            return exist;
        }
        else
            return true;
    }

    public boolean checkGameType(Athlete athlete) {
        boolean bGameType = false;
        if (gameType == "Swimming") {
            if (athlete instanceof Swimmer || athlete instanceof SuperAthlete) {
                bGameType = true;
            }else bGameType = false;
        } else if (gameType == "Running") {
            if (athlete instanceof Runner || athlete instanceof SuperAthlete) {
                bGameType = true;
            }else bGameType = false;
        } else if (gameType == "Cycling") {
            if (athlete instanceof Cyclist || athlete instanceof SuperAthlete) {
                bGameType = true;
            }else bGameType = false;
        }
        return bGameType;
    }

    public void displayAthlete(ArrayList<Athlete> participantArrayList){

        for (int i = 0; i < participantArrayList.size();i++){
            System.out.println(participantArrayList.get(i).printParticipant());
        }
    }

    public void predictAthlete (){
        // after run a game, here should clean.
        Scanner input = new Scanner(System.in);
        boolean bCheckExist = false;
        if (participantArrayList.size() !=0){
            for (int i = 0; i < participantArrayList.size();i++){
                System.out.println(participantArrayList.get(i).printParticipant());
            }
            System.out.println("Select a athlete above to predict.\nPlease enter athlete ID");
            do {
                String athleteID = input.next();
                for (int i = 0; i < participantArrayList.size();i++) {
                    bCheckExist = athleteID.equalsIgnoreCase(participantArrayList.get(i).getParticipantID());
                    if (bCheckExist) {
                        Athlete athlete = participantArrayList.get(i);
                        prediction.setPredicationID(athlete.getParticipantID());
                        break;
                    }
                }
                if (!bCheckExist)
                    System.out.println("This athlete is not ready for this game, pleas select from above.");
            }while (!bCheckExist);
        }else {
            System.out.println("Game is not ready, please select a game to run.");
        }
    }

    public boolean runGame(){
        if (participantArrayList.size() !=0)
            return true;
        else {
            System.out.println("Please select a game to run");
            return false;
        }
    }

}
