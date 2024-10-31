package com.yearup.dealership;

public class LeaseContract extends Contract{
    // Data fields
    private float expectedEndingValue, leaseFee;

    public LeaseContract(String dateOfContract, String customerName, String customerEmail, boolean vehicleSold, float expectedEndingValue, float leaseFee) {
        super(dateOfContract, customerName, customerEmail, vehicleSold);
        this.expectedEndingValue = expectedEndingValue;
        this.leaseFee = leaseFee;
    }

    // Override parent method
    @Override
    public double getTotalPrice(){
        return 0;
    }

    @Override
    public double getMonthlyPayment(){
        return 0;
    }
}
