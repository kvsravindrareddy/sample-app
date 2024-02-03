package com.veera.product;

public class StoreCardTest {
    public void displayProductDiscount(String category, String name) {
        if(category.equals("ELECTRICAL")) {
            System.out.println("Apply 10% discount for the Electrical and product name is "+name);
        } else if(category.equals("LUXURY")) {
            System.out.println("Apply 20% discount for the Electrical and product name is "+name);
        } else {
            System.out.println("Apply 5% discount for the Electrical and product name is "+name);
        }
    }
}
