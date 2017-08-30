package AP1;

import java.util.*;

public abstract class Athlete {

    private String participantID;
    private String participantName;
    private String participantState;
    private int totalPoints;
    private double latestResult;

    public  Athlete(String participantID, String participantName, String participantState){
        this.participantID = participantID;
        this.participantName = participantName;
        this.participantState = participantState;
        totalPoints = 0;
        latestResult = 0;
    }

    public String getParticipantID(){
        return participantID;
    }

    public String getParticipantName(){
        return participantName;
    }

    public String getParticipantState(){
        return participantState;
    }

    public int getTotalPoints(){
        return totalPoints;
    }

    public void setParticipantState(String participantState) {
        this.participantState = participantState;
    }

    public void setParticipantName(String participantName) {
        this.participantName = participantName;
    }

    public void setParticipantID(String participantID) {
        this.participantID = participantID;
    }

    public void setTotalPoints(int totalPoints) {
        this.totalPoints = totalPoints;
    }

    public abstract void compete(String s);

    public double getLatestResult() {
        return latestResult;
    }

    public void setLatestResult(double latestResult) {
        this.latestResult = latestResult;
    }

    @Override
    public String toString() {
        return "ParticipantID: " + participantID + "\t" +
                "participantName: " + participantName + "\t" +
                "participantState: " + participantState + "\t" +
                "totalPoints: " + totalPoints;
    }
}
