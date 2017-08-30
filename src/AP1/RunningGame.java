package AP1;

public class RunningGame extends Game {

    private String gameType = "Running Game";

    public RunningGame(String gameID, String firstPlace, String secondPlace, String thirdPlace, String gameOfficial, String gameType){
        super(gameID, firstPlace, secondPlace, thirdPlace, gameOfficial);
        this.gameType = gameType;
    }

    public String getGameType() {
        return gameType;
    }

    public void setGameType(String gameType) {
        this.gameType = gameType;
    }
}
