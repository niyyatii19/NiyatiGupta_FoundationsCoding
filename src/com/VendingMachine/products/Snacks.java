package com.VendingMachine.products;

public class Snacks implements Product{
    private String name;
    private double price;

    public Snacks(String name, double price) {
        this.name = name;
        this.price = price;
    }
    @Override
    public String getName() {
        return name;
    }
    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Snacks{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
