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

}
