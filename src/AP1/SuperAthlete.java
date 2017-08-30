package main;

public class SuperAthlete extends Athlete{

    private String gameType; //gameType object to be passed from participation list to use a a condition

    public SuperAthlete(String participantID, String participantName, String participantState, int totalPoints) {
        super(participantID, participantName, participantState, totalPoints);

    }

    public double Compete() {
        if(){
            //TODO
            //Swimmer calculations
            int min = 100;
            int max = 200;

            return Math.random() * (max + min);
        }
        else if(){
            //TODO
            //Runner Calculations
            int min = 10;
            int max = 20;

            return Math.random() * (max + min);
        }
        else if() {
            //TODO
            //Cyclist Calculations
            int min = 500;
            int max = 800;

            return Math.random() * (max + min);

        }


    }


}
