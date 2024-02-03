package com.veera.product;

public class WholeFoods implements StoreCard {

    @Override
    public void usage(int discount) {
        System.out.println("We apply 3% discount");
    }
}
