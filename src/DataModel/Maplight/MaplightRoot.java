package DataModel.Maplight;

public class MaplightRoot {

    Long electionCyle;
    String transactionDate;
    Long transactionAmountDonation;
    String donorName;
    String donorOrganizationDonation;
    String candidateNameDonation;
    Long candidateMapLightIDDonation;
    String candidateFECIDDonation;

    public MaplightRoot(Long electionCyle, String transactionDate, Long transactionAmountDonation, String donorName, String donorOrganizationDonation, String candidateNameDonation, Long candidateMapLightIDDonation, String candidateFECIDDonation) {
        this.electionCyle = electionCyle;
        this.transactionDate = transactionDate;
        this.transactionAmountDonation = transactionAmountDonation;
        this.donorName = donorName;
        this.donorOrganizationDonation = donorOrganizationDonation;
        this.candidateNameDonation = candidateNameDonation;
        this.candidateMapLightIDDonation = candidateMapLightIDDonation;
        this.candidateFECIDDonation = candidateFECIDDonation;
    }

    public Long getElectionCyle() {
        return electionCyle;
    }

    public void setElectionCyle(Long electionCyle) {
        this.electionCyle = electionCyle;
    }

    public String getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(String transactionDate) {
        this.transactionDate = transactionDate;
    }

    public Long getTransactionAmountDonation() {
        return transactionAmountDonation;
    }

    public void setTransactionAmountDonation(Long transactionAmountDonation) {
        this.transactionAmountDonation = transactionAmountDonation;
    }

    public String getDonorName() {
        return donorName;
    }

    public void setDonorName(String donorName) {
        this.donorName = donorName;
    }

    public String getDonorOrganizationDonation() {
        return donorOrganizationDonation;
    }

    public void setDonorOrganizationDonation(String donorOrganizationDonation) {
        this.donorOrganizationDonation = donorOrganizationDonation;
    }

    public String getCandidateNameDonation() {
        return candidateNameDonation;
    }

    public void setCandidateNameDonation(String candidateNameDonation) {
        this.candidateNameDonation = candidateNameDonation;
    }

    public Long getCandidateMapLightIDDonation() {
        return candidateMapLightIDDonation;
    }

    public void setCandidateMapLightIDDonation(Long candidateMapLightIDDonation) {
        this.candidateMapLightIDDonation = candidateMapLightIDDonation;
    }

    public String getCandidateFECIDDonation() {
        return candidateFECIDDonation;
    }

    public void setCandidateFECIDDonation(String candidateFECIDDonation) {
        this.candidateFECIDDonation = candidateFECIDDonation;
    }
}


