package AP1;


public class Swimmer extends Athlete{

    public Swimmer(String participantID, String participantName, String participantState) {
        super(participantID, participantName, participantState);

    }


    public void compete(String s) {
        int min = 100;//min result in seconds
        int max = 200;//max result in seconds
        int result = (int)Math.random() * (max + min);//provides a number between 100 seconds to 200 seconds
        super.setLatestResult(result);//provides a number between 100 seconds and 200 seconds
    }


}
