package TypeCreater;

public class SenatorFec {

    String firstName;
    String fecId;

    public SenatorFec(String firstName, String fecId) {
        this.firstName = firstName;
        this.fecId = fecId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFecId() {
        return fecId;
    }

    public void setFecId(String fecId) {
        this.fecId = fecId;
    }
}
