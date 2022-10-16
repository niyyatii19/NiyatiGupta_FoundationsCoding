package com.VendingMachine;

import com.VendingMachine.exception.ProductNotThereException;
import com.VendingMachine.products.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class VendingMachine {
    List<Product> productList;
    VendingMachineAdmin vendingMachineAdmin;

    VendingMachine(){
        productList = new ArrayList<>();
    }

    public void addProducts(Product product){
        productList.add(product);
    }

    public void displayDetails() {
        Map<Integer,Product> map = vendingMachineAdmin.getMappingProduct();

        for(Integer k : map.keySet()){
            System.out.println(k + "." + map.get(k) + " Quantity: "+
                    vendingMachineAdmin.getMappingQuantity().get(map.get(k)));
        }

    }

    public List<Product> getProductList() {
        return productList;
    }

    public void setVendingMachineAdmin(VendingMachineAdmin vendingMachineAdmin) {
        this.vendingMachineAdmin = vendingMachineAdmin;
    }

    public VendingMachineAdmin getVendingMachineAdmin() {
        return vendingMachineAdmin;
    }

    public void removeFromVending(Product product) {
        try{
            getProductList().remove(product);
            updateTheQuantity(product);
        }catch (ProductNotThereException p){
            System.out.println(p.getMessage());
        }

    }

    private void updateTheQuantity(Product product) throws ProductNotThereException {
        int getQ = vendingMachineAdmin.getMappingQuantity().get(product);
        getQ -= 1;
        if(getQ < 0) throw new ProductNotThereException("Quantity should not exceed the available quantity");
        vendingMachineAdmin.getMappingQuantity().put(product, getQ);
    }
}
