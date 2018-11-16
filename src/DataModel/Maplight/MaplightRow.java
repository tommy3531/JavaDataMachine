package DataModel.Maplight;

public class MaplightRow {

    public Integer electionCycle;
    public String transactionDate;
    public Integer transactionAmount;
    public String donorName;
    public String donorOrganization;
    public String candidateName;
    public Integer candidateMaplightID;
    public String candidateFECID;

//    public MaplightRow(Integer electionCycle, String transactionDate, Integer transactionAmount, String donorName, String donorOrganization, String candidateName, Integer candidateMaplightID, String candidateFECID) {
//        this.electionCycle = electionCycle;
//        this.transactionDate = transactionDate;
//        this.transactionAmount = transactionAmount;
//        this.donorName = donorName;
//        this.donorOrganization = donorOrganization;
//        this.candidateName = candidateName;
//        this.candidateMaplightID = candidateMaplightID;
//        this.candidateFECID = candidateFECID;
//    }

    public Integer getElectionCycle() {
        return electionCycle;
    }

    public void setElectionCycle(Integer electionCycle) {
        this.electionCycle = electionCycle;
    }

    public String getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(String transactionDate) {
        this.transactionDate = transactionDate;
    }

    public Integer getTransactionAmount() {
        return transactionAmount;
    }

    public void setTransactionAmount(Integer transactionAmount) {
        this.transactionAmount = transactionAmount;
    }

    public String getDonorName() {
        return donorName;
    }

    public void setDonorName(String donorName) {
        this.donorName = donorName;
    }

    public String getDonorOrganization() {
        return donorOrganization;
    }

    public void setDonorOrganization(String donorOrganization) {
        this.donorOrganization = donorOrganization;
    }

    public String getCandidateName() {
        return candidateName;
    }

    public void setCandidateName(String candidateName) {
        this.candidateName = candidateName;
    }

    public Integer getCandidateMaplightID() {
        return candidateMaplightID;
    }

    public void setCandidateMaplightID(Integer candidateMaplightID) {
        this.candidateMaplightID = candidateMaplightID;
    }

    public String getCandidateFECID() {
        return candidateFECID;
    }

    public void setCandidateFECID(String candidateFECID) {
        this.candidateFECID = candidateFECID;
    }
}
