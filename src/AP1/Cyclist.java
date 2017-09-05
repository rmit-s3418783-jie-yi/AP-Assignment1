package AP1;

public class Cyclist extends Athlete{

    private String participantAbility = "Cycle";


    public Cyclist(String participantID, String participantName, String participantState, int participantAge) {
        super(participantID, participantName, participantState, participantAge);

    }

    public void compete(String s) {
        int min = 500;//min result in seconds
        int max = 800;//max result in seconds
        int result = (int)Math.random() * (max + min);//provides a number between 500 seconds to 800 seconds
        super.setLatestResult(result); //set the latest result the athlete has a achieved
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
