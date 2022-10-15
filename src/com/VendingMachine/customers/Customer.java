package com.VendingMachine.customers;

import com.VendingMachine.products.Product;

import java.util.List;

public class Customer {
    private CartDetails cartDetails;
    private Payment payment;
    private Billing bill;

    public CartDetails getCartDetails() {
        return cartDetails;
    }

    public void setCartDetails(CartDetails cartDetails) {
        this.cartDetails = cartDetails;
    }

    public Payment getPayment() {
        return payment;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
        this.payment.setAmountToBePaid(bill.getTotalCost());
    }

    public Billing getBill() {
        return bill;
    }

    public void setBill(Billing bill) {
        this.bill = bill;
    }
}
