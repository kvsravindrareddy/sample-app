package com.veera.product;

public class StoreCarMain {
    public static void main(String[] args) {
        StoreCard wholeFoods = new WholeFoods();
        wholeFoods.usage(10);

        StoreCard amazonOnline = new AmazonOnline();
        amazonOnline.usage(10);
    }
}
