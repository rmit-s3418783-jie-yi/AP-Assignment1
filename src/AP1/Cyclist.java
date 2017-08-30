package AP1;

public class Cyclist extends Athlete{


    public Cyclist(String participantID, String participantName, String participantState) {
        super(participantID, participantName, participantState);

    }

    public void compete(String s) {
        int min = 500;
        int max = 800;
        int result = (int)Math.random() * (max + min);
        super.setLatestResult(result); //provides a number between 500 seconds to 800 seconds
    }

}
