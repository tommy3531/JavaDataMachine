package DataModel.Maplight;

public class MaplightAggregate {

    public Float totalAmount;
    public Integer contributions;

    public MaplightAggregate(Float totalAmount, Integer contributions) {
        this.totalAmount = totalAmount;
        this.contributions = contributions;
    }

    public Float getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(Float totalAmount) {
        this.totalAmount = totalAmount;
    }

    public Integer getContributions() {
        return contributions;
    }

    public void setContributions(Integer contributions) {
        this.contributions = contributions;
    }
}
