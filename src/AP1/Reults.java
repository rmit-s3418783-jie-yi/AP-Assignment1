package AP1;

public class Reults {
    private String firstPlace;
    private String secondPlace;
    private String thirdPlace;
    private int firstPlacePoints = 5;
    private int secondPlacePoints = 2;
    private int thirdPlacePoints = 1;
    private String gameID;
    private String gameOfficial;
    private String gameType;
    private Game game;


    public Reults (Game game, String firstPlace, String secondPlace, String thirdPlace, String gameOfficial) {
        this.gameID = gameID; // get game ID
        this.gameType = gameType; // get game type //Todo
        this.firstPlace = firstPlace;
        this.secondPlace = secondPlace;
        this.thirdPlace = thirdPlace;
        this.gameOfficial = gameOfficial;
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

    public int getFirstPlacePoints(){
        return firstPlacePoints;
    }

    public int getSecondPlacePoints(){
        return secondPlacePoints;
    }

    public int getThirdPlacePoints(){
        return thirdPlacePoints;
    }

    public String getGameOfficial() {
        return gameOfficial;
    }

    public void setGameOfficial(String gameOfficial) {
        this.gameOfficial = gameOfficial;
    }

}
