/**********************************************************************************************************************
 * Author: Dario Ongsono
 * Purpose: This class takes in the participant ArrayList and process result for each athlete
 * Create Date: 28/07/2017
 * Version: 1.15
 * Update Date: 04/09/2017
 **********************************************************************************************************************/

import java.util.ArrayList;
import java.util.Collections;

public class ProcessResults {
    private String athID;
    private int athResults; //the result for each individual athlete when the compete() method is invoked
  ;

    ArrayList<ProcessResults> processResultsArrayList = new ArrayList<>(); //Arraylist to store the processed results

    public ProcessResults(String athID, int athResults){
        this.athID = athID;
        this.athResults = athResults;
    }

    //Method to invoke compete method of each athlete and sorting from best result to worst
    public ArrayList processResultsArrayList(ArrayList<Athlete> participantArrayList,Game game){
        for (int i = 0; i <participantArrayList.size(); i++){
            setAthID(participantArrayList.get(i).getParticipantID());
            setAthResults(participantArrayList.get(i).compete(game.getGameType()));
            ProcessResults processResults = new ProcessResults(athID,athResults);
            processResultsArrayList.add(processResults);
            Collections.sort(processResultsArrayList, new ComparatorResult()); //Sort highest results to the top of the list
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
    } //Clears the processResult arraylist
}
