package com.javaAssignment3Collections;

import java.util.TreeMap;
import java.util.Map;

public class TreeMapDemo {
    public static void main(String[] args) {

        TreeMap<Integer, String> map = new TreeMap<>();

        map.put(101, "Mithran");
        map.put(103, "Arun");
        map.put(102, "Karan");

        System.out.println("Ascending Order:");
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
        }

        System.out.println("\nDescending Order:");
        for (Map.Entry<Integer, String> entry : map.descendingMap().entrySet()) {
            System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
        }
    }
}

