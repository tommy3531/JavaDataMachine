package DataModel.Maplight;

public class MaplightSearchTerms {
    public String candidate_name;
    public String candidate_maplight_Id;
    public String candidate_fec_id;
    public String election_cycle;
    public String download_rows;
    public MaplightDonor maplightDonor;

    public MaplightSearchTerms(String candidate_name, String candidate_maplight_Id, String candidate_fec_id, String election_cycle, MaplightDonor maplightDonor, Integer download_rows) {
        this.candidate_name = candidate_name;
        this.candidate_maplight_Id = candidate_maplight_Id;
        this.candidate_fec_id = candidate_fec_id;
        this.election_cycle = election_cycle;
        this.maplightDonor = maplightDonor;
    }

    public String getCandidate_name() {
        return candidate_name;
    }

    public void setCandidate_name(String candidate_name) {
        this.candidate_name = candidate_name;
    }

    public String getCandidate_maplight_Id() {
        return candidate_maplight_Id;
    }

    public void setCandidate_maplight_Id(String candidate_maplight_Id) {
        this.candidate_maplight_Id = candidate_maplight_Id;
    }

    public String getCandidate_fec_id() {
        return candidate_fec_id;
    }

    public void setCandidate_fec_id(String candidate_fec_id) {
        this.candidate_fec_id = candidate_fec_id;
    }

    public String getElection_cycle() {
        return election_cycle;
    }

    public void setElection_cycle(String election_cycle) {
        this.election_cycle = election_cycle;
    }

    public MaplightDonor getMaplightDonor() {
        return maplightDonor;
    }

    public void setMaplightDonor(MaplightDonor maplightDonor) {
        this.maplightDonor = maplightDonor;
    }

    public String getDownload_rows() {
        return download_rows;
    }

    public void setDownload_rows(String download_rows) {
        this.download_rows = download_rows;
    }
}