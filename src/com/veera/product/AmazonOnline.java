package com.veera.product;

public class AmazonOnline implements StoreCard {

    @Override
    public void usage(int discount) {
        System.out.println("We apply 5% discount");
    }
}
