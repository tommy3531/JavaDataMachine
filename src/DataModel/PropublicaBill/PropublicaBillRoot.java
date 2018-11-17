package DataModel.PropublicaBill;

import java.util.ArrayList;

public class PropublicaBillRoot {

    String status;
    String copyright;
    ArrayList<PropublicaBillResult> billResults;

    public PropublicaBillRoot() {}

    public PropublicaBillRoot(String status, String copyright, ArrayList<PropublicaBillResult> billResults) {
        this.status = status;
        this.copyright = copyright;
        this.billResults = billResults;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCopyright() {
        return copyright;
    }

    public void setCopyright(String copyright) {
        this.copyright = copyright;
    }

    public ArrayList<PropublicaBillResult> getBillResults() {
        return billResults;
    }

    public void setBillResults(ArrayList<PropublicaBillResult> billResults) {
        this.billResults = billResults;
    }
}
