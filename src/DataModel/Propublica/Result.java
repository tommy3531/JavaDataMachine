package DataModel.Propublica;

import java.util.List;

public class Result {

    String congress;
    String chamber;
    String num_results;
    int offset;
    List<Member> Members;

    public String getCongress() {
        return congress;
    }

    public void setCongress(String congress) {
        this.congress = congress;
    }

}
