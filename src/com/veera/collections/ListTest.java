package com.veera.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListTest {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(10);
        list.add(10000);
        list.add(20);
        System.out.println("Traditional for loop");
        for(int i=0;i<list.size();i++) {
            if(list.get(i)<10) {
                System.out.println(list.get(i) * 2);
            } else {
                System.out.println(list.get(i));
            }
        }

        System.out.println("For each loop");
        for(Integer in : list) {
            if(in < 10) {
                System.out.println(in*2);
            } else {
                System.out.println(in);
            }
        }

        Iterator<Integer> itr = list.iterator();
        while(itr.hasNext()) {
            if(itr.next()<10) {
                System.out.println(itr.next()*2);
            } else {
                System.out.println(itr.next());
            }
        }

        ListIterator<Integer> listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            if(listIterator.next()<10) {
                System.out.println(listIterator.next()*2);
            } else {
                System.out.println(listIterator.next());
            }
        }

        System.out.println("Java 8 stream API");
        list.stream()/*.filter(in->in<10)*/.map(in->{
            if(in<10) {
                return in * 2;
            } else {
                return in;
            }
        }).forEach(System.out::println);
    }
}
