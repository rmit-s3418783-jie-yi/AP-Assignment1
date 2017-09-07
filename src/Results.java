import java.util.ArrayList;

public class Results {
    private String firstPlace; // athlete ID
    private String secondPlace;
    private String thirdPlace;
    private Official official;
    private Game game;



    public Results(Game game, String firstPlace, String secondPlace, String thirdPlace, Official official) {
        this.game = game;
        this.firstPlace = firstPlace;
        this.secondPlace = secondPlace;
        this.thirdPlace = thirdPlace;
        this.official = official;
    }

    public void setWinners(ArrayList<ProcessResults> finalResult){
        firstPlace = finalResult.get(0).getAthID();
        secondPlace = finalResult.get(1).getAthID();
        thirdPlace = finalResult.get(2).getAthID();
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

    public void setGame(Game game) {
        this.game = game;
    }

    public void setOfficial(Official official){
        this.official = official;
    }

    public void cleanResult(){
        firstPlace = "";
        secondPlace = "";
        thirdPlace = "";
    }

    @Override
    public String toString() {
        return  game.toString()+
                "\nReference: " + official.toString() +
                "\nFirstPlace: " + firstPlace +
                "\nSecondPlace: " + secondPlace +
                "\nThirdPlace: " + thirdPlace;

    }

}