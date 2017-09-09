/**********************************************************************************************************************
 * Author:
 * Purpose: This is the control class that can hold most function and method to run a game.
 * Create Date: 28/07/2017
 * Version: 1.15
 * Update Date: 04/09/2017
 **********************************************************************************************************************/

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
