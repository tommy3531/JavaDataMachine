package DataModel.PropublicaBill;

import java.util.ArrayList;

public class PropublicaBillResult {

    public String id;
    public String memberURI;
    public String name;
    public int numResults;
    public int offSet;
    ArrayList<PropublicaBillDetail> billDetails;

    public PropublicaBillResult(String id, String memberURI, String name, int numResults, int offSet, ArrayList<PropublicaBillDetail> billDetails) {
        this.id = id;
        this.memberURI = memberURI;
        this.name = name;
        this.numResults = numResults;
        this.offSet = offSet;
        this.billDetails = billDetails;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMemberURI() {
        return memberURI;
    }

    public void setMemberURI(String memberURI) {
        this.memberURI = memberURI;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumResults() {
        return numResults;
    }

    public void setNumResults(int numResults) {
        this.numResults = numResults;
    }

    public int getOffSet() {
        return offSet;
    }

    public void setOffSet(int offSet) {
        this.offSet = offSet;
    }

    public ArrayList<PropublicaBillDetail> getBillDetails() {
        return billDetails;
    }

    public void setBillDetails(ArrayList<PropublicaBillDetail> billDetails) {
        this.billDetails = billDetails;
    }
}
