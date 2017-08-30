package AP1;

public class Runner extends Athlete {


    public Runner(String participantID, String participantName, String participantState) {
        super(participantID, participantName, participantState);

    }

    public double Compete() {
        int min = 10;
        int max = 20;

        return Math.random() * (max + min); //provide a number between 10 to 20 seconds
    }

}
