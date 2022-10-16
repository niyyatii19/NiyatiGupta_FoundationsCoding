package com.VendingMachine;

import com.VendingMachine.customers.*;

import java.util.Scanner;

public class Main {
    static VendingMachine vendingMachine = new VendingMachine();
    static VendingMachineAdmin vendingMachineAdmin = new VendingMachineAdmin();
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
	// write your code here
        vendingMachineAdmin.setVendingMachine(vendingMachine);
        vendingMachine.setVendingMachineAdmin(vendingMachineAdmin);
        vendingMachineAdmin.mappingTheProduct(1, 12);

        while(true){
            System.out.println("Are you admin or customer press 1 for admin press 2 for customer");
            int option = scan.nextInt();
            chooseForUser(option);
        }

    }

    private static void chooseForUser(int option) {
        switch (option){
            case 1:
                adminControls();
                break;
            case 2:
                customerControls();
                break;
            default:
                System.out.println("Enter valid value");
        }
    }

    private static void customerControls() {
        System.out.println("Enter the option of the product to add in cart");
        Customer customer = new Customer();
        CartDetails cartDetails = new CartDetails();
        Billing billing = new Billing();
        customer.setBill(billing);
        customer.setCartDetails(cartDetails);
        billing.setCustomer(customer);
        cartDetails.setVendingMachine(vendingMachine);
        String s = "";
        do{
            vendingMachine.displayDetails();
            System.out.println("Enter option");
            int option = scan.nextInt();
            System.out.println("Enter quantity. Quantity should not exceed the total");
            int quantity = scan.nextInt();
            cartDetails.getTheProduct(option, quantity);
            System.out.println("Press E/e to exit else any other key");
            s = scan.next();
        }while (!s.equalsIgnoreCase("E"));
        System.out.println("Your car items with quantity: \n" +billing.displayCartItems());
        System.out.println("Your total amount: " +billing.getTotalCost());

        System.out.println("Enter your payment method 1. Card 2. Cash");
        int payOption = scan.nextInt();
        Payment payment = null;
        switch (payOption){
            case 1:{
                payment = new PaymentByCard();

            }break;
            case 2:{
                payment = new PaymentByCash();
            }
            break;

        }
        assert payment != null;
        payment.setAmountToBePaid(billing.getTotalCost());
        payment.costToBePaid();
        System.out.println("Confirm payment: " + payment.getAmountToBePaid());
        payment.setPaymentDone(true);
        System.out.println("Success");

    }

    private static void adminControls() {
        System.out.println("Enter the food item option to add in vending machine");
        System.out.println("1. Chocolate");
        System.out.println("2. Chips");
        System.out.println("3. Juice");
        System.out.println("4. Coke");
        System.out.println("5. Milk");
        int option = scan.nextInt();
        System.out.println("Enter quantity");
        int quantity = scan.nextInt();
        vendingMachineAdmin.mappingTheProduct(option, quantity);
    }
}
