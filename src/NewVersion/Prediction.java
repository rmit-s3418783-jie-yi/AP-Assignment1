/**********************************************************************************************************************
 * Author: Dario Ongsono
 * Purpose: This is class allows user to predict winner and compare the prediction to the actual result
 * Create Date: 28/07/2017
 * Version: 1.15
 * Update Date: 04/09/2017
 **********************************************************************************************************************/

package NewVersion;



public class Prediction {
    private String predicationID;

    public Prediction (String predicationID){
        this.predicationID = predicationID;
    }

    public String match(String results){
        if (results == null || predicationID == null){ //If the user did not predict
            return "You did not predict a winner";
        } else {
            if (predicationID.equalsIgnoreCase(results)) { //If winner predicted correctly
                return "\t||\t★,:*:‧\\(￣▽￣)/‧:*‧°★*\t||" +
                        "\n\t||\t\t\t\t\t\t\t||" +
                        "\n\t||\t\tyou predicted\t\t\t|| " +
                        "\n\t||\t   the right athlete!\t\t||" +
                        "\n\t||\t\t\t\t\t\t\t||" +
                        "\n\t||\t★,:*:‧\\(￣▽￣)/‧:*‧°★*\t||";
                // TODO: 9/09/2017 Winner predict message
            } else
                return "Sorry! You did not predict correctly. Please try again! :) "; //If winner did not predict correctly
        }
    }

    public void setPredicationID(String predicationID) {
        this.predicationID = predicationID;
    }

    public String getPredicationID() {
        return predicationID;
    }
}

