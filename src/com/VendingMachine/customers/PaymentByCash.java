package com.VendingMachine.customers;

public class PaymentByCash extends Payment{
    @Override
    public double costToBePaid() {
        return super.getAmountToBePaid();
    }
}
