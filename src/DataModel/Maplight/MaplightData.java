package DataModel.Maplight;

import java.util.ArrayList;

public class MaplightData {

    public ArrayList<MaplightAggregate> aggregateTotals;
    public ArrayList<MaplightRow> rows;

    public MaplightData(ArrayList<MaplightAggregate> aggregateTotals, ArrayList<MaplightRow> rows) {
        this.aggregateTotals = aggregateTotals;
        this.rows = rows;
    }

    public ArrayList<MaplightAggregate> getAggregateTotals() {
        return aggregateTotals;
    }

    public void setAggregateTotals(ArrayList<MaplightAggregate> aggregateTotals) {
        this.aggregateTotals = aggregateTotals;
    }

    public ArrayList<MaplightRow> getRows() {
        return rows;
    }

    public void setRows(ArrayList<MaplightRow> rows) {
        this.rows = rows;
    }
}
