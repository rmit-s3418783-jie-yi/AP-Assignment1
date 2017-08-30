package AP1;

import java.util.*;

public class ParticipationList {

    private Game game;
    private double results;
    private String athleteName;
    private String athleteID;
    private int athleteNum; //Number of atheletes competing in the game
    private String gameType = game.getSelectedGameType(); //Game type object to be passed from Game
    private int numOfParticipants; //number of participants the user input

    public ParticipationList (String athleteID, String athleteName, double results){
        this.athleteID = athleteID;
        this.athleteName = athleteName;
        this.results = 0;
    }

    public void displayPlayers(ArrayList<Athlete> athleteArrayList){
        for (int i = 0; i < athleteArrayList.size(); i ++){
            if (gameType.equalsIgnoreCase("Swimming")){
                if (athleteArrayList.get(i) instanceof Swimmer){
                    //display swimmer + SA + display ID so user can choose later
                }

            }
            else if (gameType.equalsIgnoreCase("Running")){
                if (athleteArrayList.get(i) instanceof Runner){
                    //display runners + SA + display ID so user can choose later
                }
            }
            else if (gameType.equalsIgnoreCase("Cycling")){
                if(athleteArrayList.get(i) instanceof Cyclist){
                    //display cyclists + SA + display ID so user can choose later
                }
            }
        }
    }




}
