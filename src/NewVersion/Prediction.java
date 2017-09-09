package NewVersion;



public class Prediction {
    private String predicationID;

    public Prediction (String predicationID){
        this.predicationID = predicationID;
    }

    public String match(String results){
        if (results == null || predicationID == null){
            return "Your prediction is null";
        } else {
            if (predicationID.equalsIgnoreCase(results)) {
                return "\t||\t★,:*:‧\\(￣▽￣)/‧:*‧°★*\t||" +
                        "\n\t||\t\t\t\t\t\t\t||" +
                        "\n\t||\t\tyou predict\t\t\t|| " +
                        "\n\t||\t   right athlete!\t\t||" +
                        "\n\t||\t\t\t\t\t\t\t||" +
                        "\n\t||\t★,:*:‧\\(￣▽￣)/‧:*‧°★*\t||";
            } else
                return "Your prediction is not right";
        }
    }

    public void setPredicationID(String predicationID) {
        this.predicationID = predicationID;
    }

    public String getPredicationID() {
        return predicationID;
    }
}

