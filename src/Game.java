

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
        this.gameType = gameType;
    }

    public String getGameID(){
        return gameID;
    }

    public String getGameType() {
        return gameType;
    }

    @Override
    public String toString() {
        return "gameID:" + gameID + "\tgameType:" +gameType;
    }



}
