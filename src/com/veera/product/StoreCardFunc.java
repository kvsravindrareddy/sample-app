package com.veera.product;

public class StoreCardFunc {
    public static void main(String[] args) {
        StoreCard wholeFoodsStoreCard = new StoreCard() {
            @Override
            public void usage(int discount) {
                System.out.println("We apply "+discount+"% discount");
            }
        };

        wholeFoodsStoreCard.usage(10);

        StoreCard amazonOnlineStoreCard = new StoreCard() {
            @Override
            public void usage(int discount) {
                System.out.println("We apply "+discount+"% discount");
            }
        };
        amazonOnlineStoreCard.usage(10);


        StoreCard java8WholeFoods = (discount)->System.out.println("We apply "+discount+"% discount");
        java8WholeFoods.usage(10);
    }
}
