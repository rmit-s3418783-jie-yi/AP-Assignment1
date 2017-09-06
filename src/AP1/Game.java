package AP1;

public class Game {


    private int times = 1; // TODO: 2017/9/4 increase the num automatically if the gametype selected.()
    private String gameID;
    private String gameType;

    public Game (String gameID, String gameType){
        // this.gameID = gameID;
        this.gameType = gameType;
    }




    public void setGameID(){

        if (gameType == "Swimming"){
            int i = 1;
            gameID = "S" + i;
            i++;
        }
        else if (gameType == "Running"){
            int i = 1;
            gameID = "R" + i;
            i ++;
        } else if (gameType == "Cycling"){
            int i = 1;
            gameID = "C" + i;
            i ++;
        }
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
