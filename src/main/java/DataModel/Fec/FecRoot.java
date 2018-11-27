package DataModel.Fec;

import java.util.ArrayList;

public class FecRoot {

    String api_version;
    ArrayList<FecResult> results;

    public String getApi_version() {
        return api_version;
    }

    public void setApi_version(String api_version) {
        this.api_version = api_version;
    }

    public ArrayList<FecResult> getResults() {
        return results;
    }

    public void setResults(ArrayList<FecResult> results) {
        this.results = results;
    }

}
