/**********************************************************************************************************************
 * Author: Dario Ongsono
 * Purpose: This class responsible for the cyclist athlete and how it process its compete method
 * Create Date: 28/07/2017
 * Version: 1.15
 * Update Date: 04/09/2017
 **********************************************************************************************************************/
import java.util.Random;

public class Cyclist extends Athlete {

    private String participantAbility;
    private int result = 0; //result for compete method

    public Cyclist(String participantID, String participantName, String participantState, int participantAge, int totalPoints) {
        super(participantID, participantName, participantState, participantAge, totalPoints);
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

}
