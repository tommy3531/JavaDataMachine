package DataModel.PropublicaDetail;

import java.util.ArrayList;

public class PropublicaDetailRoot {
    String status;
    String copyright;
    ArrayList<PropublicaDetailResults> Results;

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

    public ArrayList<PropublicaDetailResults> getResults() {

        return Results;
    }

    public void setResults(ArrayList<PropublicaDetailResults> results) {

        Results = results;
    }
}
