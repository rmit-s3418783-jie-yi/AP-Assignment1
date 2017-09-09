/**********************************************************************************************************************
 * Author:
 * Purpose: This is the control class that can hold most function and method to run a game.
 * Create Date: 28/07/2017
 * Version: 1.15
 * Update Date: 04/09/2017
 **********************************************************************************************************************/
package NewVersion;

import java.util.Random;

public class SuperAthlete extends Athlete {
    private String participantAbility;
    private int result;

    public SuperAthlete (String participantID, String participantName, String participantState, int participantAge) {
        super(participantID,participantName,participantState,participantAge);
        participantAbility = "Swim, Cyclist, Run";
    }

    @Override
    public String getParticipantAbility() {
        return participantAbility;
    }

    public int compete(String gameType) {
        Random random =  new Random();
        int min = 0;
        int max = 0;
        if(gameType == "Swimming"){
            //Swimmer calculations
            min = 100;
            max = 200;
        }
        else if(gameType == "Running"){
            //Runner Calculations
            min = 10;
            max = 20;
        }
        else if(gameType == "Cycling") {
            //Cyclist Calculations
            min = 500;
            max = 800;
        }
        //provides a number
        result = random.nextInt(max - min + 1) + min;
        return result;
    }

    @Override
    public int getResult() {
        return result;
    }



//    public String printParticipant() {
//        return "ParticipantID: " + super.getParticipantID() +
//                "\tParticipant Name: " + super.getParticipantName();
//    }

//    public String printAll(){
//        return  "ParticipantID: " + getParticipantID() +
//                "\tParticipant Name: " + getParticipantName()+
//                "\tparticipantState: " + getParticipantState() +
//                "\tparticipantAge: " + getParticipantAge();
//
//    }
}
