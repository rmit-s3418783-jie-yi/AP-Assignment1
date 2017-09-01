package AP1;

public class SuperAthlete extends Athlete{

   //gameType object to be passed from participation list to use a a condition

    // private String participantAbility = "Swim, Cycle, Run";

    public SuperAthlete(String participantID, String participantName, String participantState) {
        super(participantID, participantName, participantState);
        // this.participantAbility = participantAbility;

    }

    public void compete(String s) {

        // Todo
//
//        if(s == "Swimming"){
//            //TODO
//            //Swimmer calculations
//            int min = 100;
//            int max = 200;
//
//            return Math.random() * (max + min);
//        }
//        else if(){
//            //TODO
//            //Runner Calculations
//            int min = 10;
//            int max = 20;
//
//            return Math.random() * (max + min);
//        }
//        else if() {
//            //TODO
//            //Cyclist Calculations
//            int min = 500;
//            int max = 800;
//
//            return Math.random() * (max + min);
//
//        }

    }

    @Override
    public String printAthlete() {
        return "ParticipantID: " + super.getParticipantID()+ "\t" +
                "Participant Name: " + super.getParticipantName() + "\t";
                // "Ability: " +  particpantAbility;
    }


}
