
public class Official{

    private String officialID;
    private String officialName;

    public Official(String officialID, String officialName){
        this.officialID = officialID;
        this.officialName = officialName;
    }

    public String getOfficialID() {
        return officialID;
    }

    public String getOfficialName() {
        return officialName;
    }

    public void setOfficialID(String officialID) {
        this.officialID = officialID;
    }

    public void setOfficialName(String officialName) {
        this.officialName = officialName;
    }

    @Override
    public String toString() {
        return "OfficialID: " + officialID + "\tOfficialName: " + officialName;
    }
}
