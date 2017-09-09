/**********************************************************************************************************************
 * Author:
 * Purpose: This is the control class that can hold most function and method to run a game.
 * Create Date: 28/07/2017
 * Version: 1.15
 * Update Date: 04/09/2017
 **********************************************************************************************************************/

package NewVersion;

import java.util.ArrayList;
import java.util.Collections;

public class ProcessResults {
    private String athID;
    private int athResults;
    // private Results results;

    ArrayList<ProcessResults> processResultsArrayList = new ArrayList<>();

    public ProcessResults(String athID, int athResults){
        this.athID = athID;
        this.athResults = athResults;
    }


    public ArrayList processResultsArrayList(ArrayList<Athlete> participantArrayList,Game game){
        for (int i = 0; i <participantArrayList.size(); i++){
            setAthID(participantArrayList.get(i).getParticipantID());
            setAthResults(participantArrayList.get(i).compete(game.getGameType()));
            ProcessResults processResults = new ProcessResults(athID,athResults);
            // maybe here will have a problem.
            processResultsArrayList.add(processResults);
            Collections.sort(processResultsArrayList, new ComparatorResult());
        }
        return processResultsArrayList;
    }


    public void setAthID(String athID) {
        this.athID = athID;
    }

    public void setAthResults(int athResults) {
        this.athResults = athResults;
    }

    public int getAthResults() {
        return athResults;
    }

    public String getAthID() {
        return athID;
    }

    @Override
    public String toString() {
        return "AthleteID: " + getAthID() +
                "\tAthlete Result:" + getAthResults();
    }

    public void cleanArrayList(){
        processResultsArrayList.clear();
    }
}
