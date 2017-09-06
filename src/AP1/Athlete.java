package AP1;

import java.util.*;

public abstract class Athlete {

    private String participantID;
    private String participantName;
    private String participantState;
    private int participantAge;
    private String participantAbility;
    private int lastPoint;
    private int totalPoints;


    public  Athlete(String participantID, String participantName, String participantState, int participantAge){
        this.participantID = participantID;
        this.participantName = participantName;
        this.participantState = participantState;
        this.participantAge = participantAge;
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

    public String getParticipantAbility() {
        return participantAbility;
    }

    public void setParticipantAbility(String participantAbility) {
        this.participantAbility = participantAbility;
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

    public void setTotalPoints() {
        totalPoints += lastPoint;
    }

    public void setLastPoint(int point) {
        this.lastPoint = point;
        setTotalPoints();
    }

    public int getLastPoint() {
        return lastPoint;
    }

    public abstract int compete(String s);

    public String printAthlete() {
        return "ParticipantID: " + getParticipantID()+ "\t" +
                "Participant Name: " + getParticipantName() + "\t" +
                "Ability: " +  getParticipantAbility();
    }



    @Override
    public String toString() {
        return "ParticipantID: " + participantID +
                "\tparticipantName: " + participantName +
                "\tparticipantState: " + participantState +
                "\tparticipantAge: " + participantAge +
                "\ttotalPoints: " + totalPoints;
    }


}
