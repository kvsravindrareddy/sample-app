package com.veera.product;

public class ProductMain {
    public static void main(String[] args) {
        Product product = new Product(123,"Mac","Computers",100.23,"description",true,'n');
//        product.setId(123);
//        product.setName("Mac");
//        product.setCategory("Computers");
//        product.setActive(true);
//        product.setDeleted('n');
//        product.setDescription("Latest mac with Sillicon M2");

        System.out.println(product.toString());
    }
}
