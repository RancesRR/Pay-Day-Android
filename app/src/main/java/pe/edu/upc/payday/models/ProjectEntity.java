package pe.edu.upc.payday.models;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Jorge GD on 18/05/2017.
 */

public class ProjectEntity {
    private UserEntity userEntity;
    private LenderEntity lenderEntity;
    private LoanType loanType;
    private double loanAmount;
    private double loanRate;
    private int numberFees;
    private double feeAmount;
    private Date entryDate;

    public ProjectEntity() {
    }

    public ProjectEntity(UserEntity userEntity, LenderEntity lenderEntity, LoanType loanType, double loanAmount, int numberFees, double feeAmount, Date entryDate) {
        this.userEntity = userEntity;
        this.lenderEntity = lenderEntity;
        this.loanType = loanType;
        this.loanAmount = loanAmount;
        this.loanRate = loanType.getRate();
        this.numberFees = numberFees;
        this.feeAmount = feeAmount;
        this.entryDate = entryDate;
    }

    public UserEntity getUserEntity() {
        return userEntity;
    }

    public void setUserEntity(UserEntity userEntity) {
        this.userEntity = userEntity;
    }

    public LenderEntity getLenderEntity() {
        return lenderEntity;
    }

    public void setLenderEntity(LenderEntity lenderEntity) {
        this.lenderEntity = lenderEntity;
    }

    public LoanType getLoanType() {
        return loanType;
    }

    public void setLoanType(LoanType loanType) {
        this.loanType = loanType;
    }

    public double getLoanAmount() {
        return loanAmount;
    }

    public String getLoanAmountAsString() {
        return String.format("%.2f", loanAmount);
    }

    public void setLoanAmount(double loanAmount) {
        this.loanAmount = loanAmount;
    }

    public double getLoanRate() {
        return loanRate;
    }

    public String getLoanRateAsString() {
        return String.valueOf(loanRate);
    }

    public void setLoanRate(double loanRate) {
        this.loanRate = loanRate;
    }

    public int getNumberFees() {
        return numberFees;
    }

    public void setNumberFees(int numberFees) {
        this.numberFees = numberFees;
    }

    public double getFeeAmount() {
        return feeAmount;
    }

    public void setFeeAmount(double feeAmount) {
        this.feeAmount = feeAmount;
    }

    public Date getEntryDate() {
        return entryDate;
    }

    public String getEntryDateAsString(){
        return (new SimpleDateFormat("EEEE, MMMM d YYYY")).format(entryDate);
    }

    public void setEntryDate(Date entryDate) {
        this.entryDate = entryDate;
    }
}
