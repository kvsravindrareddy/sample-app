package com.veera.collections;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class FileReadEx {
    private static void readFile(String inputFileName) throws IOException{
        try (Stream<String> lines = Files.lines(Paths.get(inputFileName))) {
            lines.forEach(System.out::println);
            //String str = null;
            //System.out.println(str.toString());
        } /*catch (IOException e) {
            System.out.println(e.getMessage());
        }*/ /*catch (Exception e) {
            System.out.println(e.getMessage());
            throw new NullPointerException("Nullpointer exception occured");
        }*/
        System.out.println("..........");
    }

    public static void main(String[] args) {
        String inputFile = "/Users/veera/work/classjan2024/sample-app/test2.txt";
        try {
            readFile(inputFile);
        }catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
