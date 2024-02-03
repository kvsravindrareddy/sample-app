package com.veera.collections;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class LinkedListEx {
    public static void main(String[] args) {
        Employee e1 = new Employee(1,"veera1","kakarla1","IT1","NJ1",1000);
        Employee e2 = new Employee(2,"veera2","kakarla2","IT2","NJ2",2000);
        Employee e3 = new Employee(3,"veera3","kakarla3","IT3","NJ3",3000);
        Employee e4 = new Employee(4,"veera4","kakarla4","IT4","NJ4",4000);
        List<Employee> numbers = new ArrayList<>();
        numbers.add(e1);
        numbers.add(e2);
        numbers.add(e2);
        numbers.add(e3);
        numbers.add(e4);

        System.out.println("Original ArrayList : "+numbers);

        numbers.removeAll(Arrays.asList(e2));
        //numbers.remove(e2);
        System.out.println("After removing ArrayList : "+numbers);

        List<Employee> liNumbers = new LinkedList<>();
        liNumbers.add(e1);
        liNumbers.add(e2);
        liNumbers.add(e3);
        liNumbers.add(e4);
        //System.out.println("Original LInkedList "+liNumbers);
        liNumbers.remove(e4);
        //System.out.println("After removing LInkedList "+liNumbers);
    }
}
