

public class Prediction {
    //private Athlete prediction;
    // private Results results;
    private String predicationID;
    private String getPredicationName;
    // only one thing need to do
    // compare the prediction with the first place

    // public Results results;

    public Prediction (String predicationID, String predicationName){
        this.predicationID = predicationID;
        this.getPredicationName = predicationName;
    }


    public boolean compareAthlete(String results){
        if (results == null) {
            System.out.println("Your prediction is Null.");
            return false;
        }
        else if (predicationID.equalsIgnoreCase(results))
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
