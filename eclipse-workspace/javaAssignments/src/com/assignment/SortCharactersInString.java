package com.assignment;

import java.util.Arrays;
import java.util.Scanner;

public class SortCharactersInString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String s = sc.nextLine();

        char[] arr = s.toCharArray();
        Arrays.sort(arr);

        String sorted = new String(arr);
        System.out.println("Sorted characters: " + sorted);

    }
}

