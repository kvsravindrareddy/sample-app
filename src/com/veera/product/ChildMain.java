package com.veera.product;

public class ChildMain {
    public static void main(String[] args) {
        Parent parent = new Parent();
        String parentColor = parent.color("White");
        System.out.println(parentColor);

        Child child = new Child();
        String childColor = child.color("Brown");
        System.out.println(childColor);

//        Child child1 = new Parent();
//        child1.color("Red");

        Parent parent1 = new Child();
        String inheritColor = parent1.color("White");
        System.out.println(inheritColor);
    }
}
