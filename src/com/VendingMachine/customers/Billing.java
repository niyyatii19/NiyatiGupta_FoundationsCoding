package com.VendingMachine.customers;

import com.VendingMachine.products.Product;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

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
        List<Product> products = customer.getCartDetails().getProductList();
        Map<Product, Long> map = products.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        return map.toString();
    }


}
