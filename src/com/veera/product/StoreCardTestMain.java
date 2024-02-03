package com.veera.product;

public class StoreCardTestMain {
    public static void main(String[] args) {
        StoreCardTest wholeFoods = new WholeFoodsTest();
        wholeFoods.displayProductDiscount("LUXURY","Diamond");

        WholeFoodsTest wholeFoodsTest = new WholeFoodsTest();
        wholeFoodsTest.displayProductDiscount("LUXURY","Diamond",40);
    }
}
