package com.veera.product;

public class WholeFoodsAbstract extends StoreCardAbstract {
    @Override
    public void usage() {
        System.out.println("We apply 3% discount");
    }

    public void display(String name) {
        System.out.println("This is the discount for "+name);
    }
}
