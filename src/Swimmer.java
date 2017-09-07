
import java.util.Random;

public class Swimmer extends Athlete {

    private String participantAbility = "Swim";

    public Swimmer(String participantID, String participantName, String participantState, int participantAge) {
        super(participantID, participantName, participantState, participantAge);
        // this.particpantAbility = participantAbility;

    }


    public int compete(String s) {
        int result = 0;



        int min = 100;//min result in seconds
        int max = 200;//max result in seconds
        Random random =  new Random();
        result = random.nextInt(max - min + 1) + min;//provides a number between 100 seconds to 200 seconds

        return result;//provides a number between 100 seconds and 200 seconds
    }



    public String getParticipantAbility(){
        return participantAbility;
    }
}
