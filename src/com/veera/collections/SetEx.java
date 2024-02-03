package com.veera.collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class SetEx {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10,2,3,10,2,3);
        //System.out.println(list);

        Set<Integer> set = new HashSet<>();
        set.add(10);
        set.add(2);
        set.add(3);
        set.add(10);
        set.add(2);
        set.add(3);
        //System.out.println(set);

        set.stream().sorted().forEach(System.out::println);
    }
}
