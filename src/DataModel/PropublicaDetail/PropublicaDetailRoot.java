package DataModel.PropublicaDetail;

import java.util.ArrayList;

public class PropublicaDetailRoot {
    String status;
    String copyright;
    ArrayList<PropublicaDetailResult> Results;

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

    public ArrayList<PropublicaDetailResult> getResults() {

        return Results;
    }

    public void setResults(ArrayList<PropublicaDetailResult> results) {

        Results = results;
    }
}
