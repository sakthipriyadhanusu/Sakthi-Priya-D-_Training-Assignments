package com.assignment;

import java.util.Scanner;

public class CharFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String s = sc.nextLine();

        System.out.print("Enter the character to find frequency: ");
        char ch = sc.next().charAt(0);

        int count = 0;
        for (char c : s.toCharArray()) {
            if (c == ch) {
                count++;
            }
        }

        System.out.println("Frequency of '" + ch + "' = " + count);

    }
}

