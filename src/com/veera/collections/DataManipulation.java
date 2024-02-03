package com.veera.collections;

public class DataManipulation {
    public static void main(String[] args) {
        String str = null;//StringUtils.isBlank null, empty, blank
        //StringUtils.isEmpty null and empty
        Integer in = null;
        try {
            System.out.println(in.toString());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Continue the flow");
    }
}
