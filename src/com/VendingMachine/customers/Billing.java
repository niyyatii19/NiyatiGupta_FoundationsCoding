package com.VendingMachine.customers;

import com.VendingMachine.products.Product;

import java.util.List;

public class Billing {
    private Customer customer;
    private double totalCost;



    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public double getTotalCost() {
        setTotalCost();
        return totalCost;
    }

    public void setTotalCost() {
        double totalCost = 0;
        List<Product> product = customer.getCartDetails().getProductList();
        for(Product p : product){
            totalCost += p.getPrice();
        }
        this.totalCost = totalCost;
    }

    public String displayCartItems(){
       return customer.getCartDetails().getProductList().toString();
    }


}
