package main;

public class CyclingGame extends Game{
    private String gameType = "Cycling Game";

    public CyclingGame(String gameID, String firstPlace, String secondPlace, String thirdPlace, String gameOfficial, String gameType){
        super(gameID,firstPlace,secondPlace,thirdPlace,gameOfficial);
        this.gameType = gameType;
    }

    public String getGameType() {
        return gameType;
    }

    public void setGameType(String gameType) {
        this.gameType = gameType;
    }
}
