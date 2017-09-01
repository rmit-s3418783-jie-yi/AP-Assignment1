package AP1;

import java.util.*;

public class ParticipationList {

    public void listPlayers(String gameType, ArrayList<Athlete> athleteArrayList) {
        if (gameType.equalsIgnoreCase("Swimming")) {
            for (int i = 0; i < athleteArrayList.size(); i++) {
                if (athleteArrayList.get(i) instanceof Swimmer){
                    System.out.println(athleteArrayList.get(i).printAthlete());
                }
            }
        } else if (gameType.equalsIgnoreCase("Running")) {
            for (int i = 0; i < athleteArrayList.size(); i++) {
                if (athleteArrayList.get(i) instanceof Runner){
                    System.out.println(athleteArrayList.get(i).printAthlete());
                }
            }
        }else if ((gameType.equalsIgnoreCase("Cycling"))){
            for (int i = 0; i < athleteArrayList.size(); i++) {
                if (athleteArrayList.get(i) instanceof Cyclist){
                    System.out.println(athleteArrayList.get(i).printAthlete());
                }
            }
        }
    }
}
