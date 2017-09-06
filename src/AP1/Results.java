package AP1;

import com.sun.org.apache.xerces.internal.impl.xpath.XPath;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Results {
    private String firstPlace; // athlete ID
    private String secondPlace;
    private String thirdPlace;
    private String athleteName1; // athlete Name
    private String athleteName2;
    private String athleteName3;
    private String gameOfficial;
    private String gameOfficialName;

    private int firstPlacePoints = 5;
    private int secondPlacePoints = 2;
    private int thirdPlacePoints = 1;

    private String gameID;
    private String gameType;
    private Game game;


    public Results(Game game, String firstPlace, String athleteName1, String secondPlace, String athleteName2,
                   String thirdPlace, String athleteName3, String gameOfficial, String gameOfficialName) {
        this.gameID = gameID; // get game ID
        this.gameType = gameType; // get game type //Todo
        this.firstPlace = firstPlace;
        this.athleteName1 = athleteName1;
        this.secondPlace = secondPlace;
        this.athleteName2 = athleteName2;
        this.thirdPlace = thirdPlace;
        this.athleteName3 = athleteName3;
        this.gameOfficial = gameOfficial;
        this.gameOfficialName = gameOfficialName;
    }

    public void findWinner(ArrayList<ProcessResults> processResultsArrayList){

        int firstPlaceResult = 999;
        int secondPlaceResult = 888;
        int thirdPlaceResult = 800;
        for (int i = 0; i < processResultsArrayList.size(); i++){
            if(processResultsArrayList.get(i).getAthResults() < firstPlaceResult){


            }
            else if(){

            }
            else if(){

            }
        }
    }

    public String getFirstPlace(){
        return firstPlace;
    }

    public String getSecondPlace() {
        return secondPlace;
    }

    public String getThirdPlace(){
        return thirdPlace;
    }

    public void setFirstPlace(String firstPlace){
        this.firstPlace = firstPlace;
    }

    public void setSecondPlace(String secondPlace){
        this.secondPlace = secondPlace;
    }

    public void setThirdPlace(String thirdPlace){
        this.thirdPlace = thirdPlace;
    }

    public void setAthleteName1(String athleteName1){
        this.athleteName1 = athleteName1;
    }

    public void setAthleteNamr2 (String athleteName2){
        this.athleteName2 = athleteName2;
    }

    public void setAthleteName3 (String athleteName3){
        this.athleteName3 = athleteName3;
    }

    public void setGameOfficoalName(String gameOfficialName){
        this.gameOfficialName = gameOfficialName;
    }

    public void setGameOfficial(String gameOfficial) {
        this.gameOfficial = gameOfficial;
    }

    public String getGameOfficial() {
        return gameOfficial;
    }



    public int getFirstPlacePoints(){
        return firstPlacePoints;
    }

    public int getSecondPlacePoints(){
        return secondPlacePoints;
    }

    public int getThirdPlacePoints(){
        return thirdPlacePoints;
    }

    @Override
    public String toString() {
        return "Reference: " + gameOfficial + "\tOfficial Name: " + gameOfficialName+
                "\nFirstPlace: " + firstPlace + "\tAthlete Name: "+ athleteName1 + "\tPoint: " + firstPlacePoints +
                "\nSecondPlace: " + secondPlace + "\tAthlete Name: "+ athleteName2 +"\tPoint" + secondPlacePoints +
                "\nThirdPlace: " + thirdPlace + "\tAthlete Name: "+ athleteName3 +"\tPoint" + thirdPlace;

    }
}