package main;

public class Cyclist extends Athlete{


    public Cyclist(String participantID, String participantName, String participantState, int totalPoints) {
        super(participantID, participantName, participantState, totalPoints);

    }

    public double Compete() {
        int min = 500;
        int max = 800;

        return Math.random() * (max + min); //provides a number between 500 seconds to 800 seconds
    }

}
