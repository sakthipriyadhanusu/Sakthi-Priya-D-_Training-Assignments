package com.assignment;

import java.util.*;

public class SubstringOccurrences {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the string: ");
        String str = sc.nextLine();

        System.out.print("Enter the substring to find: ");
        String sub = sc.nextLine();

        int count = 0;
        int index = 0;

        while ((index = str.indexOf(sub, index)) != -1) {
            count++;
            index = index + 1;  
        }

        System.out.println("Occurrences: " + count);
    }
}
