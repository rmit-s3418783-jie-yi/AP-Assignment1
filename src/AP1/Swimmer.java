package main;


public class Swimmer extends Athlete{

    public Swimmer(String participantID, String participantName, String participantState, int totalPoints) {
        super(participantID, participantName, participantState, totalPoints);

    }


    public double Compete() {
        int min = 100;
        int max = 200;

        return Math.random() * (max + min); //provides a number between 100 seconds and 200 seconds
    }


}
