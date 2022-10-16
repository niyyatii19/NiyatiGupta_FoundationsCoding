package com.VendingMachine.exception;

public class ProductNotThereException extends Exception{

    public ProductNotThereException(String message){
        super(message);
    }
}
