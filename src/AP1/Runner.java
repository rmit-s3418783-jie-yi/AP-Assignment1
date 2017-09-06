package AP1;

import java.util.Random;

public class Runner extends Athlete {

    private String participantAbility = "Run";


    public Runner(String participantID, String participantName, String participantState, int participantAge) {
        super(participantID, participantName, participantState, participantAge);
    }

    public int compete(String s) {
        int result = 0;

        int min = 10;//min result in seconds
        int max = 20;//max result in seconds
        Random random =  new Random();
        result = random.nextInt(max - min + 1) + min;//provides a number between 100 seconds to 200 second
        return result; //provide a number between 10 to 20 seconds ..............
    }



    public String getParticpantAbility(){
        return participantAbility;
    }
}
