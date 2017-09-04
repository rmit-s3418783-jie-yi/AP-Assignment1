package AP1;

public class Game {
    private String gameID;
    private String gameType;

    public Game (String gameID, String gameType){
        this.gameID = gameID;
        this.gameType = gameType;
    }

    public void setGameID(String gameID){
        this.gameID = gameID;
    }

    public void setGameType(String gameType){
        this.gameID = gameType;
    }

    public String getGameID(){
        return gameID;
    }

    public String getGameType() {
        return gameType;
    }

    @Override
    public String toString() {
        return "gameID:" + gameID + "gameType:" +gameType;
    }

    public void calculateWinners(){
        // Todo
//
//        if(){
//            //TODO
//            //Athlete's name with highest result set to first place
//            //Immediately add points to winner
//        }
//        else if{
//
//        }
//        else

    }
}
