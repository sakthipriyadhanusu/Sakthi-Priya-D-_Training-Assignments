package com.assignment;
import java.util.Scanner;

public class CountWordsInString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String s = sc.nextLine().trim();

        if (s.isEmpty()) {
            System.out.println("Word count: 0");
        } else {
            String[] words = s.split("\\s+"); 
            System.out.println("Word count: " + words.length);
        }

      
    }
}


