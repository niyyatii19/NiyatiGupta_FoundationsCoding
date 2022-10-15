package com.VendingMachine.customers;

public class PaymentByCard extends Payment{

    @Override
    public double costToBePaid() {
        double amount = super.getAmountToBePaid() * 2;
        super.setAmountToBePaid(amount);
        return amount;
    }
}
