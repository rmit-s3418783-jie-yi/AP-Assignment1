package AP1;

import java.util.ArrayList;

public class Prediction {
    //private Athlete prediction;
    // private Results results;
    private String predicationID;
    private String getPredicationName;
    // only one thing need to do
    // compare the prediction with the first place

    public Prediction (String predicationID, String predicationName){
        this.predicationID = predicationID;
        this.getPredicationName = predicationName;
    }


    public boolean compareAthlete(Results results){
        if (predicationID.equalsIgnoreCase(results.getFirstPlace()))
        return true;
        else return false;
    }


    public void setPredicationID(String predicationID) {
        this.predicationID = predicationID;
    }

    public void setGetPredicationName(String getPredicationName) {
        this.getPredicationName = getPredicationName;
    }

    public String getPredicationID() {
        return predicationID;
    }

    public String getGetPredicationName() {
        return getPredicationName;
    }
}
