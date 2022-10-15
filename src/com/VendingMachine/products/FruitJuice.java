package com.VendingMachine.products;

public class FruitJuice implements  Product{
    private String name;
    private double price;

    public FruitJuice(String name, double price) {
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
        return "FruitJuice{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
