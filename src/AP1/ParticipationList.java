package main;

public class ParticipationList {

    private double results;
    private String athleteName;
    private String athleteID;
    private int athleteNum; //Number of atheletes competing in the game
    private String gameType //Game type object to be passed from Game

    public ParticipationList (String athleteID, String athleteName, double results){
        this.athleteID = athleteID;
        this.athleteName = athleteName;
        this.results = 0;
    }
}
