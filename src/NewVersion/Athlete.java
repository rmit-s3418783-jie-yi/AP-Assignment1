/**********************************************************************************************************************
 * Author: Dario Ongsono
 * Purpose: This class the abstract class for athlete and how it determines the abstract method the subclasses has to implement
 * Create Date: 28/07/2017
 * Version: 1.15
 * Update Date: 04/09/2017
 **********************************************************************************************************************/

package NewVersion;

import java.util.ArrayList;

public abstract class Athlete extends Participant {

    private String participantAbility;
    private int totalPoints; //total points an athlete has
    private int lastPoint; //latest point the athlete has been awarded

    public Athlete(String participantID, String participantName, String participantState, int participantAge)
    {super(participantID,participantName,participantState,participantAge);

    }


    public String getParticipantAbility() {
        return participantAbility;
    }

    public abstract int compete(String gameType); //compete method to be implemented in the sub classes so that

    public abstract int getResult(); //returns back the compete() result

    @Override
    public String printParticipant() {
        return "ParticipantID: " + getParticipantID() +
                "\tParticipant Name: " + getParticipantName();
    }


    public String printAll(){
        return  "ParticipantID: " + getParticipantID() +
                "\tParticipant Name: " + getParticipantName()+
                "\tparticipantState: " + getParticipantState() +
                "\tparticipantAge: " + getParticipantAge();

    }

    public void setTotalPoints() {
        totalPoints += lastPoint;
    } //set the last points

    public void setLastPoint(int point) {
        this.lastPoint = point;
        setTotalPoints();
    } //Set the latest point awarded to the athlete

    @Override
    public String toString() { //toString method to print particpants
        return "ParticipantID: " + getParticipantID() +
                "\tparticipantName: " + getParticipantName() +
                "\tparticipantState: " + getParticipantState() +
                "\tparticipantAge: " + getParticipantAge() +
                "\ttotalPoints: " + totalPoints;


    }

}
