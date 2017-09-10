/**********************************************************************************************************************
 * Author: Dario Ongsono
 * Purpose: This is a subclass of the participant class to create the official object
 * Create Date: 28/07/2017
 * Version: 1.15
 * Update Date: 04/09/2017
 **********************************************************************************************************************/

public class Official extends Participant {
    public Official(String participantID, String participantName, String participantState, int participantAge) {
        super(participantID,participantName,participantState,participantAge);

    }

    public String printParticipant() {
        return "Official ID: " + super.getParticipantID() +
                "\tOfficial Name: " + super.getParticipantName();
    }



}
