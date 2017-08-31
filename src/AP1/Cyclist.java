package AP1;

public class Cyclist extends Athlete{


    public Cyclist(String participantID, String participantName, String participantState) {
        super(participantID, participantName, participantState);

    }

    public void compete(String s) {
        int min = 500;//min result in seconds
        int max = 800;//max result in seconds
        int result = (int)Math.random() * (max + min);//provides a number between 500 seconds to 800 seconds
        super.setLatestResult(result); //set the latest result the athlete has a achieved
    }

}
