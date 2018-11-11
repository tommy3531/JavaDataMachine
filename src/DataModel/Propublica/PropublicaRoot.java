package DataModel.Propublica;

import java.util.List;

public class PropublicaRoot {

    String status;
    String copyright;
    List<Result> Results;

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

    public List<Result> getResults() {
        return Results;
    }

    public void setResults(List<Result> results) {
        Results = results;
    }

}
