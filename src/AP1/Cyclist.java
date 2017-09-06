package AP1;

import java.util.Random;

public class Cyclist extends Athlete{

    private String participantAbility = "Cycle";


    public Cyclist(String participantID, String participantName, String participantState, int participantAge) {
        super(participantID, participantName, participantState, participantAge);

    }

    public int compete(String s) {
        int result = 0;

        int min = 500;//min result in seconds
        int max = 800;//max result in seconds
        Random random =  new Random();
        result = random.nextInt(max - min + 1) + min;//provides a number between 100 seconds to 200 second
        return result;
    }
    @Override
    public String printAthlete() {
        return "ParticipantID: " + super.getParticipantID()+ "\t" +
                "Participant Name: " + super.getParticipantName() + "\t" +
                "Ability: " +  participantAbility;
    }

    public String getParticpantAbility(){
        return participantAbility;
    }

}
