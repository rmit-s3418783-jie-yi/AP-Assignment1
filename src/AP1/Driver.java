package AP1;


import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Driver {

    ArrayList<Athlete> participantArrayList = new ArrayList<>(); // temple ArrayList for add athletes to play game // TODO  ????????
    ArrayList<Results> resultsArrayList = new ArrayList<>();

    ParticipationList participationList = new ParticipationList(); // why use this?
    // main menu
    public void mainMenu(ArrayList<Athlete> athleteArrayList,ArrayList<Game> gameArrayList, ArrayList<Official> officialArrayList) {
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
                    startGame();

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

    public void startGame() {
        // todo
        // print game type and
        // ask how many athletes your want
        // do you want to add self or automatically
        // add self todo
        // automatically add todo

    }

    // system go in to select a game.
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
                athleteChoose("Swimming", athleteArrayList);
                break;
            case 2:
                // TODO: 2017/8/30
                athleteChoose("Cycling",athleteArrayList);
                // link to Cycling game
                break;
            case 3:
                // TODO: 2017/8/30
                athleteChoose("Running",athleteArrayList);
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

    private void athleteChoose(String gametype, ArrayList<Athlete> athleteArrayList) {
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
                addParticipationList(gametype, athleteArrayList, athleteNum);
                break;
            case 2:
                addParticipationList(gametype, athleteArrayList, 8);
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

    private int athleteNo() {
        int athleteNum =0;
        boolean bAthleteNum = false;
        System.out.println("How many athletes your want to add?");
        do {
            athleteNum = intTest(); // how many athletes you want
            bAthleteNum = bAthleteNumTest(athleteNum); //test mainMenuOption in the range
        } while (!bAthleteNum);
        bAthleteNum = true;
        return athleteNum;
    }

    private void addParticipationList(String gametype, ArrayList<Athlete> athleteArrayList, int athleteNum) {
        for (int i =0; i < athleteNum; i++){
            participationList.listPlayers(gametype, athleteArrayList);
            System.out.println("Please enter athlete's ID to add athlete to play game.");
            System.out.println("Please add（" +(i+1)+" of "+athleteNum+"） athlete: ");


            // TODO: 2017/9/3 something wrong with pass participants list


            Athlete participantArrayList = new Participants("","","", 28);





            // addAthlete();
        }



    }

    private boolean bAthleteNumTest(int athleteNum) {
        if (athleteNum >= 1 && athleteNum <= 8) return true;
        else {
            System.out.println("\n\tYour option is invalid, please enter number 1 or 8.");
            return false;
        }
    }

    // system go in to predict a athlete
    public void predictAthlete (){
        Scanner input = new Scanner(System.in);
        // TODO: 2017/8/30
        // list athletes from athleteChoose(String gametype)
        System.out.println("Select a athlete above to predict.\nPlease enter athlete ID");
        // input
        String athleteID = input.next(); // input sth but not right
        // TODO: 2017/8/30 compare athleteID with ArrayList which from athleteChoose(String gametype)
        // this is sth thing to learn how push and pull
    }

    private int intTest(){
        Scanner input = new Scanner(System.in);
        int inputInt = 0;
            try {
                inputInt = input.nextInt();
            } catch (InputMismatchException imp){
                System.out.println("\n\tYour option is invalid, please enter number\n\n");
            }
        return inputInt;
    }


//        try{
//
//            mainMenuOption = input.nextInt();
//            if (mainMenuOption < 1 || mainMenuOption > 6)
//                System.out.println("\n\tYour option is invalid, please enter number between 1 to 6.");
//        }catch(InputMismatchException ime){
//
//            System.out.println("\n\tYour option is invalid, please enter number\n\n");
//
//
//        }


//    public void listPlayers(String gameType, ArrayList<Athlete> athleteArrayList) {
//
//        if (gameType.equalsIgnoreCase("Swimming")) {
//            for (int i = 0; i < athleteArrayList.size(); i++) {
//                if (athleteArrayList.get(i) instanceof Swimmer){
//                    System.out.println(athleteArrayList.get(i).printAthlete(););
//                }
////                swimmer.printAthlete();
////                superAthlete.printAthlete();
//            }
//
//
//        } else if (gameType.equalsIgnoreCase("Running")) {
//            for (int i = 0; i < athleteArrayList.size(); i++) {
////                runner.printAthlete();
////                superAthlete.printAthlete();
//
//            }
//        }else if ((gameType.equalsIgnoreCase("Cycling"))){
//            for (int i = 0; i < athleteArrayList.size(); i++) {
////                cyclist.printAthlete();
////                superAthlete.printAthlete();
//            }
//
//        }
//
//
//    }

}
