package com.VendingMachine.products;

public interface Product {
    void setName(String name);
    String getName();
    void setPrice(double price);
    double getPrice();
    String toString();
}
