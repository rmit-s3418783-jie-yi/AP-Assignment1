
import java.util.Random;

public class SuperAthlete extends Athlete{

   //gameType object to be passed from participation list to use a a condition

    private String participantAbility = "Swim, Cycle, Run";

    public SuperAthlete(String participantID, String participantName, String participantState, int participantAge) {
        super(participantID, participantName, participantState, participantAge);
        // this.participantAbility = participantAbility;

    }

    public int compete(String s) {

        int result = 0 ;
        Random random =  new Random();

        if(s == "Swimming"){
            //TODO
            //Swimmer calculations
            int min = 100;
            int max = 200;
            result = random.nextInt(max - min + 1) + min;//provides a number between 100 seconds to 200 second
        }
        else if(s == "Running"){
            //TODO
            //Runner Calculations
            int min = 10;
            int max = 20;
            result = random.nextInt(max - min + 1) + min;//provides a number between 100 seconds to 200 second
        }
        else if(s == "Cycling") {
            //TODO
            //Cyclist Calculations
            int min = 500;
            int max = 800;
            result = random.nextInt(max - min + 1) + min;//provides a number between 100 seconds to 200 second

        }

        return result;

    }

    @Override
    public String printAthlete() {
        return "ParticipantID: " + super.getParticipantID()+ "\t" +
                "Participant Name: " + super.getParticipantName() + "\t" +
                "Ability: " +  participantAbility;
    }


}
