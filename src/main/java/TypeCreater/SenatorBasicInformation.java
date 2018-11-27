package TypeCreater;

public class SenatorBasicInformation {

    String firstName;
    String lastName;
    String legID;

    public SenatorBasicInformation(String firstName, String lastName, String legID) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.legID = legID;

    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLegID() {
        return legID;
    }

    public void setLegID(String legID) {
        this.legID = legID;
    }
}
