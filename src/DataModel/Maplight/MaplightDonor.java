package DataModel.Maplight;

public class MaplightDonor {

    public String donorOrganization;
    public String donorText;

    public MaplightDonor(String donorOrganization, String donorText) {
        this.donorOrganization = donorOrganization;
        this.donorText = donorText;
    }

    public String getDonorOrganization() {
        return donorOrganization;
    }

    public void setDonorOrganization(String donorOrganization) {
        this.donorOrganization = donorOrganization;
    }

    public String getDonorText() {
        return donorText;
    }

    public void setDonorText(String donorText) {
        this.donorText = donorText;
    }
}
