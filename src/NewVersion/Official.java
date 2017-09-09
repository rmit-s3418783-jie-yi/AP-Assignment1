package NewVersion;

public class Official extends Participant {
    public Official(String participantID, String participantName, String participantState, int participantAge) {
        super(participantID,participantName,participantState,participantAge);

    }

    public String printParticipant() {
        return "Official ID: " + getParticipantID() +
                "\tOfficial Name: " + super.getParticipantName();
    }



}
