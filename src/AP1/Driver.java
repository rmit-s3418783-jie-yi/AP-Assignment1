/**********************************************************************************************************************
 * Author: JIE YI (Jay)
 * Purpose: This is the control class that can hold most function and method to run a game.
 * Create Date: 28/07/2017
 * Version: 1.15
 * Update Date: 04/09/2017
 **********************************************************************************************************************/
package AP1;

import com.sun.org.apache.bcel.internal.generic.NEW;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Driver {


    private final int FIRSTPLACEPOINT = 5;
    private final int SECONDPLACEPOINT = 2;
    private final int THIRDPLACEPOINT = 1;

    private ArrayList<Athlete> participantArrayList = new ArrayList<>();
    private ArrayList<Results> resultsArrayList = new ArrayList<>();
    private ArrayList <ProcessResults> processResults = new ArrayList<ProcessResults>();
    private Prediction prediction = new Prediction("",""); // to store data prediction
    //public Results results = new Results(); //= new Results("","","");
    private Game game = new Game("","");
    // main menu

    /****************************************************************************************************************
     *
     * This is the main menu part
     *
     ****************************************************************************************************************/
    public void mainMenu(ArrayList<Athlete> athleteArrayList,ArrayList<Game> gameArrayList, ArrayList<Official> officialArrayList) throws InterruptedException {
        int mainMenuOption = 0;
        boolean bMainOption = false;
        while (mainMenuOption != 6){
            menuText();
            do {
                mainMenuOption = intTest(); // exception
                bMainOption = bMainOptionTest(mainMenuOption); // test mainMenuOption in the range
            } while (!bMainOption);
            bMainOption = false;
            switch (mainMenuOption){
                case 1:
                    gameMenu(athleteArrayList, gameArrayList);
                    break;
                case 2:
                    predictAthlete();
                    // todo
                    break;
                case 3:
                    startGame(participantArrayList,game);

                    // give game id here
                    break;
                case 4:
                    displayResult();
                    break;
                case 5:
                    displayPoin(athleteArrayList,results);
                    break;
                case 6:
                    break;
            }
            // return a value to break loop.

        }
    }




    private boolean bMainOptionTest(int mainMenuOption) {
        if (mainMenuOption >= 1 && mainMenuOption <= 6)
            return true;
        else {
            System.out.println("\n\tYour option is invalid, please enter number between 1 to 6.");
            return false;
        }
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

    /****************************************************************************************************************\
     *
     * This is the select a game menu part
     *
     ****************************************************************************************************************/
    private void gameMenu(ArrayList<Athlete> athleteArrayList, ArrayList<Game> gameArrayList){
        int gameMenuOption = 0 ;
        boolean bGameMenuOption = false;
            gameMenuText();
        do {
            gameMenuOption = intTest(); // exception
            bGameMenuOption = bGameMenuOptionTest(gameMenuOption); //test mainMenuOption in the range
        } while (!bGameMenuOption);
        bGameMenuOption = true;

        switch (gameMenuOption){
            case 1: //Swimming
                // TODO: 2017/9/1 test gaming type
                // link to Swimming game
                game.setGameType("Swimming");
                game.setGameID();
                athleteChoose(game.getGameType(), athleteArrayList);
                // do sth about increase gameID's number.


                break;
            case 2:
                // TODO: 2017/8/30
                game.setGameType("Cycling");
                game.setGameID();
                athleteChoose(game.getGameType(),athleteArrayList);
                // link to Cycling game


                break;
            case 3:
                // TODO: 2017/8/30
                game.setGameType("Running");
                game.setGameID();
                athleteChoose(game.getGameType(),athleteArrayList);
                // link to Cycling game


                break;
            case 4:
                // todo
                // back to main menu
                break;
        }
//        }
    }

    private boolean bGameMenuOptionTest(int gameMenuOption) {
        if (gameMenuOption >= 1 && gameMenuOption <= 4)
            return true;
        else {
            System.out.println("\n\tYour option is invalid, please enter number between 1 to 4.");
            return false;
        }
    }

    private void gameMenuText(){
        System.out.print("\tOlympic Game\t\n=============================\n" +
                "1.\tSwimming\n" +
                "2.\tCycling\n" +
                "3.\tRunning\n" +
                "4.\tBack to main menu without save game\n\n" +
                "Enter an option: ");
    }

    /****************************************************************************************************************
     *
     * Select athlete to run a game will as a sub part of select a game menu
     *
     ****************************************************************************************************************/
    private void athleteChoose(String gameType, ArrayList<Athlete> athleteArrayList) {
        System.out.println("1\tadd athletes by yourself? (less than 8 athletes)\n" +
                "2\tadd athletes automatically (full fill)");
        int athleteNum = 0;
        int athleteChoose = 0;
        boolean bAthleteChoose = false;
        do {
            athleteChoose = intTest(); // exception
            bAthleteChoose = bAthleteChooseTest(athleteChoose); //test mainMenuOption in the range
        } while (!bAthleteChoose);
        bAthleteChoose = true;
        switch (athleteChoose){
            case 1:
                athleteNum =  athleteNo();
                addParticipationList(gameType, athleteArrayList, athleteNum);
                break;
            case 2:
                fullFillParticipationList(gameType, athleteArrayList, 8);
                break;
        }
    }

    private boolean bAthleteChooseTest(int athleteChoose) {
        if (athleteChoose >= 1 && athleteChoose <= 2) return true;
        else {
            System.out.println("\n\tYour option is invalid, please enter number 1 or 2.");
            return false;
        }
    }

    /****************************************************************************************************************
     *
     * Add athlete by user
     *
     ****************************************************************************************************************/
    private int athleteNo() {
        int athleteNum =0;
        boolean bAthleteNum = false;
        System.out.println("How many athletes your want to add?");
        do {
            athleteNum = intTest(); // how many athletes you want
            bAthleteNum = bAthleteNumTest(athleteNum); //test mainMenuOption in the range
        } while (!bAthleteNum);
        return athleteNum;
    }

    private boolean bAthleteNumTest(int athleteNum) {
        if (athleteNum >= 1 && athleteNum <= 8) return true;
        else {
            System.out.println("\n\tYour option is invalid, please enter number 1 or 8.");
            return false;
        }
    }

    public void listPlayers(String gameType, ArrayList<Athlete> athleteArrayList) {
        for (int j = 0; j < athleteArrayList.size();j ++){
            if(athleteArrayList.get(j) instanceof SuperAthlete){
                System.out.println(athleteArrayList.get(j).printAthlete());
            } else if (gameType.equalsIgnoreCase("Swimming") && athleteArrayList.get(j) instanceof Swimmer){
                System.out.println(athleteArrayList.get(j).printAthlete());
            } else if (gameType.equalsIgnoreCase("Running") && athleteArrayList.get(j) instanceof Runner){
                System.out.println(athleteArrayList.get(j).printAthlete());
            } else if (gameType.equalsIgnoreCase("Cycling") && athleteArrayList.get(j) instanceof Cyclist){
                System.out.println(athleteArrayList.get(j).printAthlete());
            }
        }
    }

    private void addParticipationList(String gameType, ArrayList<Athlete> athleteArrayList, int athleteNum) {
        Scanner input = new Scanner(System.in);
        for (int i =0; i < athleteNum; i++){
            listPlayers(gameType, athleteArrayList);
            System.out.println("Please enter athlete's ID to add athlete to play game.");
            System.out.println("Please add（" +(i+1)+" of "+athleteNum+"） athlete: ");
            String addParticipant = "";
            boolean bAddParticipant = false;
            boolean bCheckExist = false;
            boolean bGameType = false;
            do {
                bAddParticipant = false;
                bCheckExist = false;
                bGameType = false;
                addParticipant = input.next();
                for (int j=0; j< athleteArrayList.size(); j++){
                    bAddParticipant = addParticipant.equalsIgnoreCase(athleteArrayList.get(j).getParticipantID());
                    if (bAddParticipant) {
                        // bAddParticipant = true && bCheckExist = false && bGameType = false
                        Athlete athlete = athleteArrayList.get(j);
                        bCheckExist = checkExist(athlete.getParticipantID());
                        if (bCheckExist){
                            // bAddParticipant = true && bCheckExist = true && bGameType = false
                            bGameType = checkGameType(gameType,athlete);
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
                if (!bAddParticipant)
                    System.out.println("We don't have this athlete, please enter the existing athleteID.");
                if (!bCheckExist)
                    System.out.println("This athlete already the add to list, please select again.");
                if (!bGameType){
                    listPlayers(gameType, athleteArrayList);
                    System.out.println("This athlete is not suitable for " + gameType +", please enter the ID above: ");
                }
            } while (!bAddParticipant || !bGameType || !bCheckExist);
            System.out.println(participantArrayList.size());
        }
        for (int i = 0; i < participantArrayList.size();i++){
            System.out.println(participantArrayList.get(i).printAthlete());
        }
    }

    /****************************************************************************************************************
     *
     * Add athlete by system
     *
     ****************************************************************************************************************/
    private void fullFillParticipationList(String gameType, ArrayList<Athlete> athleteArrayList, int athleteNum) {

        for (int i = 0; i <athleteNum; i++){
            boolean bCheckExist = false;
            boolean bGameType = false;
            do {
                bCheckExist = false;
                bGameType = false;
                Random random = new Random();
                int index = random.nextInt(athleteArrayList.size()-1);
                Athlete athlete = athleteArrayList.get(index);
                bCheckExist = checkExist(athlete.getParticipantID());
                if (bCheckExist){
                    // bCheckExist = true && bGameType = false
                    // if true means this athlete not exist in participantArrayList
                    // then go to check if the athlete is the same gametype we need.
                    bGameType = checkGameType(gameType, athlete);
                    if (bGameType) {
                        // bCheckExist = true && bGameType = true
                        // if game type is right then add to list.
                        participantArrayList.add(athlete);
                    }
                }
            } while (!bCheckExist || !bGameType);
        }
        for (int i = 0; i < participantArrayList.size();i++){
            System.out.println(participantArrayList.get(i).printAthlete());
        }
    }

    /****************************************************************************************************************
     *
     * Identify add athlete in the right way
     *
     ****************************************************************************************************************/
    private boolean checkGameType(String gameType, Athlete athlete) {
        boolean bGameType = false;
        if (gameType.equalsIgnoreCase("Swimming")) {
            if (athlete instanceof Swimmer || athlete instanceof SuperAthlete) {
                bGameType = true;
            }else bGameType = false;
        } else if (gameType.equalsIgnoreCase("Running")) {
            if (athlete instanceof Runner || athlete instanceof SuperAthlete) {
                bGameType = true;
            }else bGameType = false;
        } else if (gameType.equalsIgnoreCase("Cycling")) {
            if (athlete instanceof Cyclist || athlete instanceof SuperAthlete) {
                bGameType = true;
            }else bGameType = false;
        }
        return bGameType;
    }

    private boolean checkExist(String addParticipant) {
        boolean exist = false;
        if (participantArrayList.size() == 0) return true; // ez to do that if this is not null then to do sth
        else { // if not null then check in the participantArrayList have this athlete or not
            for (int i = 0; i < participantArrayList.size(); i++){
                if (addParticipant.equalsIgnoreCase(participantArrayList.get(i).getParticipantID())) {
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
    }

    /****************************************************************************************************************
     *
     * Predict athlete part
     *
     ****************************************************************************************************************/
    public void predictAthlete (){
        // after run a game, here should clean.
        Scanner input = new Scanner(System.in);
        boolean bCheckExist = false;
        for (int i = 0; i < participantArrayList.size();i++){
            System.out.println(participantArrayList.get(i).printAthlete());
        }
        System.out.println("Select a athlete above to predict.\nPlease enter athlete ID");
        do {
            String athleteID = input.next();
            for (int i = 0; i < participantArrayList.size();i++) {
                bCheckExist = athleteID.equalsIgnoreCase(participantArrayList.get(i).getParticipantID());
                if (bCheckExist) {
                    Athlete athlete = participantArrayList.get(i);
                    prediction.setPredicationID(athlete.getParticipantID());
                    prediction.setGetPredicationName(athlete.getParticipantName());
                    break;
                }
            }
            if (!bCheckExist)
                System.out.println("This athlete is not ready for this game, pleas select from above.");
        }while (!bCheckExist);




    }

    /****************************************************************************************************************
     *
     * Start game part
     *
     ****************************************************************************************************************/
    public void startGame(ArrayList<Athlete> participantArrayList,Game game) throws InterruptedException {
        System.out.println(game.toString());
        if(participantArrayList.size()<4){
            // cancel the game
            System.out.println("Sorry, the athlete numbers is less than 4, this game can not be accessed!");
            participantArrayList.clear();
            System.out.println("This game had canceled, please start again.");
        }else {
            System.out.println("Athletes are ready to compete, wait a second.");
            TimeUnit.SECONDS.sleep(3);

            System.out.println("Result competed, please fo to display result part");
            // TODO: 2017/9/6  Reword.


        }




    }

    /****************************************************************************************************************
     *
     * Display the result
     *
     ****************************************************************************************************************/
    private void displayResult() {
        processResults.releaseResult(participantArrayList, game);
        Results finalResult = new Results(results.getFirstPlace(),results.getSecondPlace(),results.getThirdPlace());
        String firstPlace = results.getFirstPlace();
        if (prediction.compareAthlete(firstPlace))
            System.out.println("\t||★,:*:‧\\(￣▽￣)/‧:*‧°★*\t||" +
                    "\n\t||\t\t\t\t\t\t||"+
                    "\n\t||\t you predict\t\t|| " +
                    "\n\t||\tright athlete!\t\t||"+
                    "\n\t||\t\t\t\t\t\t||"+
                    "\n\t||★,:*:‧\\(￣▽￣)/‧:*‧°★*\t||");
    }



    /****************************************************************************************************************
     *
     * Display the point
     *
     ****************************************************************************************************************/

    private void displayPoin(ArrayList<Athlete> athleteArrayList, Results results) {
        for (int i =0; i< athleteArrayList.size();i++){
            if (results.getFirstPlace().equalsIgnoreCase(athleteArrayList.get(i).getParticipantID())){
                Athlete athlete = athleteArrayList.get(i);
                athlete.setLastPoint(FIRSTPLACEPOINT);
            }
            if (results.getSecondPlace().equalsIgnoreCase(athleteArrayList.get(i).getParticipantID())){
                Athlete athlete = athleteArrayList.get(i);
                athlete.setLastPoint(SECONDPLACEPOINT);
            }
            if (results.getThirdPlace().equalsIgnoreCase(athleteArrayList.get(i).getParticipantID())){
                Athlete athlete = athleteArrayList.get(i);
                athlete.setLastPoint(THIRDPLACEPOINT);
            }
        }
        for (int i =0; i<athleteArrayList.size(); i++)
            System.out.println(athleteArrayList.get(i).toString());
    }



    /****************************************************************************************************************
     *
     * Input exception part
     *
     ****************************************************************************************************************/
    private int intTest(){
        Scanner input = new Scanner(System.in);
        int inputInt = 0;
            try {
                inputInt = input.nextInt();
            } catch (Exception e){
                System.out.println("\n\tYour option is invalid, please enter number\n\n");
            }
        return inputInt;
    }




}
