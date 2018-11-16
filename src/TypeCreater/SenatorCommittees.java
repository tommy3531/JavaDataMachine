package TypeCreater;

public class SenatorCommittees {

    String firstName;
    String lastName;
    String committeeName;
    String committeeTitle;
    String committeeCode;
    String committeeRank;
    String committeeSide;

    public SenatorCommittees(String firstName, String lastName, String committeeName, String committeeTitle, String committeeCode, String committeeRank, String committeeSide) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.committeeName = committeeName;
        this.committeeTitle = committeeTitle;
        this.committeeCode = committeeCode;
        this.committeeRank = committeeRank;
        this.committeeSide = committeeSide;
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

    public String getCommitteeName() {
        return committeeName;
    }

    public void setCommitteeName(String committeeName) {
        this.committeeName = committeeName;
    }

    public String getCommitteeTitle() {
        return committeeTitle;
    }

    public void setCommitteeTitle(String committeeTitle) {
        this.committeeTitle = committeeTitle;
    }

    public String getCommitteeCode() {
        return committeeCode;
    }

    public void setCommitteeCode(String committeeCode) {
        this.committeeCode = committeeCode;
    }

    public String getCommitteeRank() {
        return committeeRank;
    }

    public void setCommitteeRank(String committeeRank) {
        this.committeeRank = committeeRank;
    }

    public String getCommitteeSide() {
        return committeeSide;
    }

    public void setCommitteeSide(String committeeSide) {
        this.committeeSide = committeeSide;
    }
}
