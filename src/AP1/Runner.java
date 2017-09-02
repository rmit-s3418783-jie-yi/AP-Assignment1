package AP1;

public class Runner extends Athlete {

    private String particpantAbility = "Run";


    public Runner(String participantID, String participantName, String participantState, int participantAge) {
        super(participantID, participantName, participantState, participantAge);
    }

    public void compete(String s) {
        int min = 10;//min result in seconds
        int max = 20;//max result in seconds
        int result = (int)Math.random() * (max + min);//provides a number between 10 seconds to 20 seconds
        super.setLatestResult(result); //provide a number between 10 to 20 seconds ..............
    }

    @Override
    public String printAthlete() {
        return "ParticipantID: " + super.getParticipantID()+ "\t" +
                "Participant Name: " + super.getParticipantName() + "\t";
    }

    public String getParticpantAbility(){
        return particpantAbility;
    }
}
