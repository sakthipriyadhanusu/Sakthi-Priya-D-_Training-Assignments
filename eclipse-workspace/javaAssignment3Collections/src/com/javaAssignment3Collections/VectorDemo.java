package com.javaAssignment3Collections;

import java.util.Vector;

public class VectorDemo {
    public static void main(String[] args) {

        Vector<String> fruits = new Vector<>();

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");
        fruits.add("Orange");

        System.out.println("Vector Elements: " + fruits);

        System.out.println("First Element: " + fruits.firstElement());
        System.out.println("Last Element: " + fruits.lastElement());

        fruits.remove("Banana");
        System.out.println("After Removal: " + fruits);
    }
}

