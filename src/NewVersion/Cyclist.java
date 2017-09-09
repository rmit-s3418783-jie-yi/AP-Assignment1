package NewVersion;

import java.util.Random;

public class Cyclist extends Athlete {

    private String participantAbility;
    private int result = 0;

    public Cyclist(String participantID, String participantName, String participantState, int participantAge) {
        super(participantID, participantName, participantState, participantAge);
        participantAbility = "Run";
    }

    @Override
    public String getParticipantAbility() {
        return participantAbility;
    }

    public int compete(String gameType) {

        int min = 500;  //min result in seconds
        int max = 800;  //max result in seconds
        Random random =  new Random();
        result = random.nextInt(max - min + 1) + min;//provides a number between 100 seconds to 200 second
        return result;
    }

    @Override
    public int getResult() {
        return result;
    }
//
//    public String printParticipant() {
//        return "ParticipantID: " + super.getParticipantID() +
//                "\tParticipant Name: " + super.getParticipantName();
//    }
}
