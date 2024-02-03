package com.veera.collections;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class HashCollision {
    public static void main(String[] args) {
        Map<Integer,String> map = new ConcurrentHashMap<>();
        map.put(1,"A");
        map.put(2,"B");
        map.put(3,"C");
        Set<Map.Entry<Integer,String>> entrySet = map.entrySet();
        for(Map.Entry<Integer, String> entry : entrySet) {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
            map.put(4,"D");
        }

//        Map<Integer, String> resultMap = map.entrySet().stream()
//                .filter(k->k.getValue().equalsIgnoreCase("C"))
//                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
//        System.out.println(resultMap);
    }
}
