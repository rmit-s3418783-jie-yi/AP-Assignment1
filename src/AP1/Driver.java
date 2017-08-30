package AP1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Driver {
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
                // todo select a game
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
        gameMenuText();
        int subMenuOption = 0;
        subMenuOption = subOption();
        gameSwitch(subMenuOption);
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
            case 1:
                // todo
                athleteChoose();
                // link to Swimming game
                break;
            case 2:
                // todo
                // link to Cycling game
                break;
            case 3:
                // todo
                // link to Running game
                break;
            case 4:
                // todo
                // back to main menu
                break;
        }
    }

    public void athleteChoose() {
        System.out.println("1\tadd athletes by yourself? (less than 8 athletes)\n" +
                "2\tadd athletes automatically (full fill)");
        int athleteChoose = athleteSwitch();
        switch (athleteChoose){
            case 1:
                //todo
                // list all the Swimming athletes
                // temple ArrayList or sth to store this data
                break;
            case 2:
                // todo
                // full fill in athletes by 8 if any.
                // temple ArrayList or sth to store this data
                break;
        }
    }


    // system go in to predict a athlete
    public void predictAthlete (){
        // list athletes from temple database
        System.out.println("Select a athlete above to predict.");
        // todo
        //
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
