package com.assignment;

import java.util.Scanner;

public class CompareTwoStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String s1 = sc.nextLine();

        System.out.print("Enter second string: ");
        String s2 = sc.nextLine();

        System.out.println("Using equals(): " + s1.equals(s2));
        System.out.println("Using compareTo(): " + s1.compareTo(s2));

    }
}

