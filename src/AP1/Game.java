package AP1;

public abstract class Game {

    private String firstPlace;
    private String secondPlace;
    private String thirdPlace;
    private int firstPlacePoints = 5;
    private int secondPlacePoints = 2;
    private int thirdPlacePoints = 1;
    private String gameOfficial;
    private String gameID;
    private String selectedGameType;

    public Game (String gameID, String firstPlace, String secondPlace, String thirdPlace, String gameOfficial){
        this.gameID = gameID;
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
        return getSecondPlacePoints();
    }

    public int getThirdPlacePoints(){
        return thirdPlacePoints;
    }

    public void setFirstPlace(String firstPlace) {
        this.firstPlace = firstPlace;
    }

    public void setSecondPlace(String secondPlace) {
        this.secondPlace = secondPlace;
    }

    public void setThirdPlace(String thirdPlace) {
        this.thirdPlace = thirdPlace;
    }

    public void setFirstPlacePoints(int firstPlacePoints) {
        this.firstPlacePoints = firstPlacePoints;
    }

    public void setSecondPlacePoints(int secondPlacePoints) {
        this.secondPlacePoints = secondPlacePoints;
    }

    public void setThirdPlacePoints(int thirdPlacePoints) {
        this.thirdPlacePoints = thirdPlacePoints;
    }

    public String getGameOfficial() {
        return gameOfficial;
    }

    public void setGameOfficial(String gameOfficial) {
        this.gameOfficial = gameOfficial;
    }

    public String getSelectedGameType(){
        return selectedGameType;
    }

    public void setSelectedGameType(String selectedGameType) {
        this.selectedGameType = selectedGameType;
    }

    public void swimmingSelected(){
        setSelectedGameType("Swimming");
    }

    public void runningSelected(){
        setSelectedGameType("Running");
    }

    public void cyclingSelected(){
        setSelectedGameType("Cycling");
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
