package AP1;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.SplittableRandom;

public class ProcessResults {


    private String firstPlace;
    private String secondPlace;
    private String thirdPlace;
    private String athID;
    private int athResults;
    public Results results; // = new Results("","","");

    ArrayList<ProcessResults> processResultsArrayList = new ArrayList<>();
    ArrayList<ProcessResults> finalResultsArraryList = new ArrayList<>();
    // TODO: 2017/9/4 call athlete  compete()

    // here will be have a loop to go through each athlete.copete().

    public ProcessResults(String athID, int athResults){
        this.athID = athID;
        this.athResults = athResults;
        this.results = new Results("","","");
    }

    // TODO: 2017/9/4 compare the results to list DESC

//    List unmodifiableList = Collections.unmodifiableList(list);
//
//    List newList = new ArrayList(unmodifiableList);
//
//    Collections.sort(newList);
//


    public ArrayList<ProcessResults> processResultsArrayList(ArrayList<Athlete> participantArrayList, Game game){
        for (int i = 0; i <participantArrayList.size(); i++){
            setAthID(participantArrayList.get(i).getParticipantID());
            setAthResults(participantArrayList.get(i).compete(game.getGameType()));
            ProcessResults processResults = new ProcessResults(getAthID(),getAthResults());

            processResultsArrayList.add(processResults);
            Collections.sort(processResultsArrayList, new ComparatorResult());
        }
        return processResultsArrayList;
    }


    public void releaseResult(ArrayList<Athlete> participantArrayList, Game game){
        for (int i = 0; i <participantArrayList.size(); i++){
            setAthID(participantArrayList.get(i).getParticipantID());
            setAthResults(participantArrayList.get(i).compete(game.getGameType()));
            ProcessResults processResults = new ProcessResults(getAthID(),getAthResults());

            processResultsArrayList.add(processResults);
        }




        Collections.sort(processResultsArrayList, new ComparatorResult());
        for (int i =0 ; i< processResultsArrayList.size(); i++){
            System.out.println(processResultsArrayList.get(i).toString());
            finalResultsArraryList.add(processResultsArrayList.get(i));

        }
            setFirstPlace(processResultsArrayList.get(0).getAthID());
            setSecondPlace(processResultsArrayList.get(1).getAthID());
            setThirdPlace(processResultsArrayList.get(2).getAthID());

            results.setWinners(finalResultsArraryList);
    }


    public ArrayList getFinalResult(){
        return finalResultsArraryList;
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

    public void setThirdPlace(String thirdPlace) {
        this.thirdPlace = thirdPlace;
    }

    public void setSecondPlace(String secondPlace) {
        this.secondPlace = secondPlace;
    }

    public void setFirstPlace(String firstPlace) {
        this.firstPlace = firstPlace;
    }

    public String getFirstPlace() {
        return firstPlace;
    }

    public String getSecondPlace() {
        return secondPlace;
    }

    public String getThirdPlace() {
        return thirdPlace;
    }

    public Results getResults() {
        return results;
    }

    public void cleanArraylist(){
        processResultsArrayList.clear();
    }

    // loop dd

    // first. setID and setName
    // second .
    // third.





}
