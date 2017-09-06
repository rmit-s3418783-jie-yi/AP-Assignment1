package AP1;

import java.util.*;

public abstract class Athlete {

    private String participantID;
    private String participantName;
    private String participantState;
    private int participantAge;
    private String participantAbility;
    private int totalPoints;


    public  Athlete(String participantID, String participantName, String participantState, int participantAge){
        this.participantID = participantID;
        this.participantName = participantName;
        this.participantState = participantState;
        this.participantAge = participantAge;
        totalPoints = 0;

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

    public void setTotalPoints(int totalPoints) {
        this.totalPoints = totalPoints;
    }

    public abstract int compete(String s);

    public String printAthlete() {
        return "ParticipantID: " + getParticipantID()+ "\t" +
                "Participant Name: " + getParticipantName() + "\t" +
                "Ability: " +  participantAbility;
    }



//    @Override
//    public String toString() {
//        return "ParticipantID: " + participantID + "\t" +
//                "participantName: " + participantName + "\t" +
//                "participantState: " + participantState + "\t" +
//                "totalPoints: " + totalPoints;
//    }


}
