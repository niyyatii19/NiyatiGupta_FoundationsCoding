package com.VendingMachine.customers;

import com.VendingMachine.VendingMachine;
import com.VendingMachine.products.Product;

import java.util.ArrayList;
import java.util.List;

public class CartDetails {
    List<Product> productList;
    VendingMachine vendingMachine;
    public CartDetails(){
        productList = new ArrayList<>();
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void addProductList(Product product, int quantity) {
        for(int i=0; i<quantity; i++){
            this.productList.add(product);
            vendingMachine.removeFromVending(product);
        }
    }

    public void getTheProduct(int option, int quantity){
        Product product = vendingMachine.getVendingMachineAdmin().getMappingProduct().get(option);
        addProductList(product, quantity);
    }

    public VendingMachine getVendingMachine() {
        return vendingMachine;
    }

    public void setVendingMachine(VendingMachine vendingMachine) {
        this.vendingMachine = vendingMachine;
    }
}
