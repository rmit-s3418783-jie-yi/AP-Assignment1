package AP1;

import java.util.*;

public class ParticipationList {

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
}
