package AP1;

public abstract class Participants {
    private String participantID;
    private String participantName;
    private String participantState;
    private int participantAge;

    public Participants (String participantID, String participantName, String participantState, int participantAge){
        this.participantID = participantID;
        this.participantName = participantName;
        this.participantState =participantState;
        this.participantAge = participantAge;
    }
    public String getParticipantID() {
        return participantID;
    }

    public String getParticipantName() {
        return participantName;
    }

    public int getParticipantAge() {
        return participantAge;
    }

    public String toString () {
        return "";
    }
    public abstract boolean checkSuper();
}
