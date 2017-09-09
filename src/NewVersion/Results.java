package NewVersion;

import java.util.ArrayList;

public class Results {
    private String firstID; //variable to hold first place ID
    private String secondID; //variable to hold second place ID
    private String thirdID; //variable to hold third place ID
    private Official official;//Passing the official object
    private Game game;//Passing the game object



    public Results(Game game, String firstID, String secondID, String thirdID, Official official) { //This constructor will be used to store the winners data
        this.game = game;
        this.firstID = firstID;
        this.secondID = secondID;
        this.thirdID = thirdID;
        this.official = official;
    }

    public void setWinners(ArrayList<ProcessResults> finalResult){
        firstID = finalResult.get(0).getAthID();
        secondID = finalResult.get(1).getAthID();
        thirdID = finalResult.get(2).getAthID();
    }

    public String getFirstID() {
        return firstID;
    }

    public String getSecondID() {
        return secondID;
    }

    public String getThirdID() {
        return thirdID;
    }

    public void setGame(Game game) {
        this.game = game;
    }

    public void setOfficial(Official official){
        this.official = official;
    }

    public void cleanResult(){
        firstID = "";
        secondID = "";
        thirdID = "";
    }

    @Override
    public String toString() {
        return  game.toString()+
                "\nReference: \n" + official.printParticipant() +
                "\nFirstPlace: " + firstID +
                "\nSecondPlace: " + secondID +
                "\nThirdPlace: " + thirdID;

    }
}
