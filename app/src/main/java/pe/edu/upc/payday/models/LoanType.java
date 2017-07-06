package pe.edu.upc.payday.models;

/**
 * Created by Jorge GD on 18/05/2017.
 */

public class LoanType {
    private LenderEntity lenderEntity;
    private double rate;
    private String description;

    public LoanType() {
    }

    public LoanType(LenderEntity lenderEntity, double rate, String description) {
        this.lenderEntity = lenderEntity;
        this.rate = rate;
        this.description = description;
    }

    public LenderEntity getLenderEntity() {
        return lenderEntity;
    }

    public void setLenderEntity(LenderEntity lenderEntity) {
        this.lenderEntity = lenderEntity;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
