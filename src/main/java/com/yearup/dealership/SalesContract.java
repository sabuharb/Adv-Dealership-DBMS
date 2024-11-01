package com.yearup.dealership;

public class SalesContract extends Contract{
    // Data fields
    private float salesTaxAmount = 0.05f, recordingFee = 100, processingFee;
    private boolean finance;
    UserInterface userInterface = new UserInterface();
    private double originalPrice;

    // Constructor
    public SalesContract(String dateOfContract, String customerName, String customerEmail, boolean vehicleSold, boolean finance) {
        super(dateOfContract, customerName, customerEmail, vehicleSold);
        this.finance = finance;
    }

    // Override parent methods
    @Override
    public double getTotalPrice(){

        return this.totalPrice = originalPrice + (originalPrice * salesTaxAmount) +
                this.recordingFee + this.processingFee;
    }

    @Override
    public double getMonthlyPayment(){
        if(this.finance && this.originalPrice >= 10000){
            this.monthlyPayment = (this.totalPrice + (this.totalPrice * 0.0425)) / 48;
        }else if(this.finance && this.originalPrice < 10000){
            this.monthlyPayment = (this.totalPrice + (this.totalPrice * 0.0525)) / 24;
        }
        return this.monthlyPayment;
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
        if (this.originalPrice < 10000){
            this.processingFee = 295;
        }else{
            this.processingFee = 495;
        }
        return this.processingFee;
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
