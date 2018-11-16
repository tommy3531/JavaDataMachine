package DataModel.Maplight;

public class MaplightRoot {

    public MaplightSearchTerms searchTerms;
    public MaplightData data;

    public MaplightSearchTerms getSearchTerms() {
        return searchTerms;
    }

    public void setSearchTerms(MaplightSearchTerms searchTerms) {
        this.searchTerms = searchTerms;
    }

    public MaplightData getData() {
        return data;
    }

    public void setData(MaplightData data) {
        this.data = data;
    }
}
