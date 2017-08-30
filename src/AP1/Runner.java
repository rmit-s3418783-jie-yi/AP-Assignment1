package AP1;

public class Runner extends Athlete {


    public Runner(String participantID, String participantName, String participantState) {
        super(participantID, participantName, participantState);

    }

    public void compete(String s) {
        int min = 10;
        int max = 20;
        int result = (int)Math.random() * (max + min);
        super.setLatestResult(result); //provide a number between 10 to 20 seconds
    }

}
