package com.yearup.dealership;

public class SalesContract extends Contract{
    // Data fields
    private float salesTaxAmount, recordingFee, processingFee;
    private boolean finance;

    // Constructor
    public SalesContract(String dateOfContract, String customerName, String customerEmail, boolean vehicleSold, float salesTaxAmount, float recordingFee, float processingFee, boolean finance) {
        super(dateOfContract, customerName, customerEmail, vehicleSold);
        this.salesTaxAmount = salesTaxAmount;
        this.recordingFee = recordingFee;
        this.processingFee = processingFee;
        this.finance = finance;
    }

    // Override parent methods
    @Override
    public double getTotalPrice(){

        totalPrice = this.recordingFee + this.processingFee;

        return 0;
    }

    @Override
    public double getMonthlyPayment(){
        return 0;
    }

    // Getters and Setters
    public float getSalesTaxAmount() {
        return salesTaxAmount;
    }

    public void setSalesTaxAmount(float salesTaxAmount) {
        this.salesTaxAmount = salesTaxAmount;
    }

    public float getRecordingFee() {
        return recordingFee;
    }

    public void setRecordingFee(float recordingFee) {
        this.recordingFee = recordingFee;
    }

    public float getProcessingFee() {
        return processingFee;
    }

    public void setProcessingFee(float processingFee) {
        this.processingFee = processingFee;
    }

    public boolean isFinance() {
        return finance;
    }

    public void setFinance(boolean finance) {
        this.finance = finance;
    }
}
