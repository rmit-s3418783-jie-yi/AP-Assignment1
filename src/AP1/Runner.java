package main;

public class Runner extends Athlete {


    public Runner(String participantID, String participantName, String participantState, int totalPoints) {
        super(participantID, participantName, participantState, totalPoints);

    }

    public double Compete() {
        int min = 10;
        int max = 20;

        return Math.random() * (max + min); //provide a number between 10 to 20 seconds
    }

}
