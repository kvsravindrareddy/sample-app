package com.veera.product;

public class StoreCardAbstractMain {
    public static void main(String[] args) {
        StoreCardAbstract amazonOnline = new AmazonOnlineAbstract();
        amazonOnline.usage();
        amazonOnline.display();

        StoreCardAbstract wholeFoods = new WholeFoodsAbstract();
        wholeFoods.usage();

        wholeFoods.display();
    }
}
