package com.assignment;
import java.util.Scanner;

public class CountDigitsAlphabetsSpecial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String s = sc.nextLine();

        int digits = 0, alphabets = 0, special = 0;

        for (char c : s.toCharArray()) {
            if (Character.isDigit(c)) {
                digits++;
            } else if (Character.isLetter(c)) {
                alphabets++;
            } else {
                special++;
            }
        }

        System.out.println("Digits: " + digits);
        System.out.println("Alphabets: " + alphabets);
        System.out.println("Special characters: " + special);

  
    }
}

