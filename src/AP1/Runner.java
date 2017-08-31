package AP1;

public class Runner extends Athlete {


    public Runner(String participantID, String participantName, String participantState) {
        super(participantID, participantName, participantState);

    }

    public void compete(String s) {
        int min = 10;//min result in seconds
        int max = 20;//max result in seconds
        int result = (int)Math.random() * (max + min);//provides a number between 10 seconds to 20 seconds
        super.setLatestResult(result); //provide a number between 10 to 20 seconds ..............
    }

}
