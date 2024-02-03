package com.veera.product;

public class WholeFoodsTest extends StoreCardTest {
    public void displayProductDiscount(String category, String name) {
        if(category.equals("ELECTRICAL")) {
            System.out.println("Apply 20% discount for the Electrical and product name is "+name);
        } else if(category.equals("LUXURY")) {
            System.out.println("Apply 30% discount for the Electrical and product name is "+name);
        } else {
            System.out.println("Apply 5% discount for the Electrical and product name is "+name);
        }
    }

    public void displayProductDiscount(String category, String name, int discount) {
        if(category.equals("ELECTRICAL")) {
            System.out.println("Apply "+discount+"% discount for the Electrical and product name is "+name);
        } else if(category.equals("LUXURY")) {
            System.out.println("Apply "+discount+"% discount for the Electrical and product name is "+name);
        } else {
            System.out.println("Apply "+discount+"% discount for the Electrical and product name is "+name);
        }
    }
}
