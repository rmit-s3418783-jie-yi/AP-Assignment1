/**********************************************************************************************************************
 * Author:
 * Purpose: This is the control class that can hold most function and method to run a game.
 * Create Date: 28/07/2017
 * Version: 1.15
 * Update Date: 04/09/2017
 **********************************************************************************************************************/

package NewVersion;

import java.util.ArrayList;

public abstract class Athlete extends Participant {

    private String participantAbility;
    private int totalPoints;
    private int lastPoint;

    public Athlete(String participantID, String participantName, String participantState, int participantAge)
    {super(participantID,participantName,participantState,participantAge);

    }


    public String getParticipantAbility() {
        return participantAbility;
    }

    public abstract int compete(String gameType);

    public abstract int getResult();

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
    }

    public void setLastPoint(int point) {
        this.lastPoint = point;
        setTotalPoints();
    }

    @Override
    public String toString() {
        return "ParticipantID: " + getParticipantID() +
                "\tparticipantName: " + getParticipantName() +
                "\tparticipantState: " + getParticipantState() +
                "\tparticipantAge: " + getParticipantAge() +
                "\ttotalPoints: " + totalPoints;


    }

}
