package AP1;

import java.util.*;

public class ParticipationList {

    private Game game;
    private Swimmer swimmer;
    private Runner runner;
    private Cyclist cyclist;
    private Athlete athelete;
    private SuperAthlete superAthlete;
    private double results;
    private String athleteName;
    private String athleteID;
    private int athleteNum; //Number of atheletes competing in the game
    // private String gameType = game.getSelectedGameType(); //Game type object to be passed from Game
    private int numOfParticipants; //number of participants the user input

    public ParticipationList(String athleteID, String athleteName, double results) {
        this.athleteID = athleteID;
        this.athleteName = athleteName;
        this.results = 0;
    }

//    public void displayPlayers(ArrayList<Athlete> athleteArrayList) {
//        for (int i = 0; i < athleteArrayList.size(); i++) {
//            if (game.getGameType().equalsIgnoreCase("Swimming")) {
//                if (athleteArrayList.get(i) instanceof Swimmer) {
//                    //display swimmer + SA + display ID so user can choose later
//                }
//
//            } else if (game.getGameType().equalsIgnoreCase("Running")) {
//                if (athleteArrayList.get(i) instanceof Runner) {
//                    //display runners + SA + display ID so user can choose later
//                }
//            } else if (game.getGameType().equalsIgnoreCase("Cycling")) {
//                if (athleteArrayList.get(i) instanceof Cyclist) {
//                    //display cyclists + SA + display ID so user can choose later
//                }
//            }
//        }
//    }

    public void listPlayers(String gameType, ArrayList<Athlete> athleteArrayList) {
    }

    {
        if (gameType.compareToIgnoreCase("Swimming")) {
            for (int i = 0; i < athleteArrayList.size(); i++) {


                swimmer.printAthlete();
                superAthlete.printAthlete();
            }


        } else if (s.compareToIgnoreCase("Running")) {
            for (int i = 0; i < athleteArrayList.size(); i++) {
                runner.printAthlete();
                superAthlete.printAthlete();

            }
        else if (s.compareToIgnoreCase("Cycling")) {
                for (int i = 0; i < athleteArrayList.size(); i++) {
                    cyclist.printAthlete();
                    superAthlete.printAthlete();
                }
            }


        }
    }
}