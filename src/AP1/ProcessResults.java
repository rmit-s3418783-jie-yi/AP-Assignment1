package AP1;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class ProcessResults {


    private int firstPlace;
    private int secondPlace;
    private int thirdPlace;
    private String athID;
    private int athResults;

    ArrayList<ProcessResults> processResultsArrayList = new ArrayList<>();
    // TODO: 2017/9/4 call athlete  compete()

    // here will be have a loop to go through each athlete.copete().

    public ProcessResults(String athID, int athResults){
        this.athID = athID;
        this.athResults = athResults;
    }

    // TODO: 2017/9/4 compare the results to list DESC

//    List unmodifiableList = Collections.unmodifiableList(list);
//
//    List newList = new ArrayList(unmodifiableList);
//
//    Collections.sort(newList);
//
    public void createAthlete(ArrayList<Athlete> participantArrayList, Game game){
        for (int i = 0; i <participantArrayList.size(); i++){
            setAthID(participantArrayList.get(i).getParticipantID());
            setAthResults(participantArrayList.get(i).compete(game.getGameType()));
            ProcessResults processResults = new ProcessResults(getAthID(),getAthResults();

            processResultsArrayList.add(processResults);

        }
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

    // loop dd

    // first. setID and setName
    // second .
    // third.





}
