package AP1;

import java.util.*;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Driver {
    private Game game;
    // main menu
    public void mainMenu() {
        int mainMenuOption = 0;
        while (mainMenuOption != 6){
            menuText();
            mainMenuOption = mainOption();
            mainSwitch(mainMenuOption);
            // return a value to break loop.

        }
    }

    public void menuText(){
        System.out.print("\tOlympic Game\t\n=============================\n" +
                "1.\tSelect a game to run\n" +
                "2.\tPredict the winner of the game\n" +
                "3.\tStart the game\n" +
                "4.\tDisplay the final results of all games\n" +
                "5.\tDisplay the points of all athletes\n" +
                "6.\tExit\n\n" +
                "Enter an option: ");
    }

    public void mainSwitch (int mainMenuOption){
        switch (mainMenuOption){
            case 1:
                gameMenu();
                break;
            case 2:
                predictAthlete();
                // todo
                break;
            case 3:
                startGame();

        }
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
    public void gameMenu(){
        int subMenuOption = 0 ;
//        while (subMenuOption != 4){
            gameMenuText();
            subMenuOption = subOption();
            gameSwitch(subMenuOption);
//        }
    }


    public void gameMenuText(){
        System.out.print("\tOlympic Game\t\n=============================\n" +
                "1.\tSwimming\n" +
                "2.\tCycling\n" +
                "3.\tRunning\n" +
                "4.\tBack to main menu without save game\n\n" +
                "Enter an option: ");
    }

    public void gameSwitch(int subMenuOption) {
        switch (subMenuOption){
            case 1: //Swimming
                game.setGameType("Swimming");
                System.out.println(game.getGameID());
                // TODO: 2017/8/30
                // should sth inside?
                athleteChoose("Swimming");
                // link to Swimming game
                break;
            case 2:
                game.getGameID();
                System.out.println(game.getGameID());
                // call a method that can record game type.
                // TODO: 2017/8/30
                athleteChoose("Cycling");
                // link to Cycling game
                break;
            case 3:
                game.getGameID();
                System.out.println(game.getGameID());
                // call a method that can record game type.
                // TODO: 2017/8/30
                athleteChoose("Running");
                // link to Cycling game
                break;
            case 4:
                // todo
                // back to main menu
                break;
        }
    }

    public void athleteChoose(String gametype) {
        System.out.println("1\tadd athletes by yourself? (less than 8 athletes)\n" +
                "2\tadd athletes automatically (full fill)");

        int athleteChoose = athleteSwitch();
        switch (athleteChoose){
            case 1:
                int athleteNum = athleteNum(); // how many athletes you want
                for (int i =0; i < athleteNum; i++){
                    // TODO: 2017/8/31 the loop ask user to add athletes
                }
                //game.displayPlayers();

                // list all the Swimming athletes
                // temple ArrayList or sth to store this data
                break;
            case 2:
                for (int i=0; i <8; i++){
                    // TODO: 2017/8/31 automatically add 8 athletes from participation list

                }
                // full fill in athletes by gametype
                //fillin(gametype);
                // temple ArrayList or sth to store this data
                break;
        }
    }

    public int athleteNum() {
        Scanner input = new Scanner(System.in);
        int inputInt = 0;
        try {
            inputInt = input.nextInt();
            if (inputInt >= 1 && inputInt <= 8);
            else System.out.println("\n\tYour option is invalid, please enter number 1 or 8.");
        } catch (InputMismatchException imp){
            System.out.println("\n\tYour option is invalid, please enter number\n\n");
        }
        return inputInt;
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



    public int mainOption(){
        Scanner input = new Scanner(System.in);
        int inputInt = 0;
        try {
            inputInt = input.nextInt();
            if (inputInt >= 1 && inputInt <= 6);
            else System.out.println("\n\tYour option is invalid, please enter number between 1 to 6.");
        } catch (InputMismatchException imp){
            System.out.println("\n\tYour option is invalid, please enter number\n\n");
        }
        return inputInt;
    }

    public int subOption(){
        Scanner input = new Scanner(System.in);
        int inputInt = 0;
        try {
            inputInt = input.nextInt();
            if (inputInt >= 1 && inputInt <= 4);
            else System.out.println("\n\tYour option is invalid, please enter number between 1 to 4.");
        } catch (InputMismatchException imp){
            System.out.println("\n\tYour option is invalid, please enter number\n\n");
        }
        return inputInt;
    }

    public int athleteSwitch(){
        Scanner input = new Scanner(System.in);
        int inputInt = 0;
        try {
            inputInt = input.nextInt();
            if (inputInt >= 1 && inputInt <= 2);
            else System.out.println("\n\tYour option is invalid, please enter number 1 or 2.");
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




}
