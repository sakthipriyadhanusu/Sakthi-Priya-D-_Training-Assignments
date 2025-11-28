package com.assignment;

import java.util.Scanner;

public class RemoveDuplicateCharacters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String s = sc.nextLine();

        String result = "";
        for (char c : s.toCharArray()) {
            if (result.indexOf(c) == -1) {  
                result += c;
            }
        }

        System.out.println("String after removing duplicate characters: " + result);

        sc.close();
    }
}

