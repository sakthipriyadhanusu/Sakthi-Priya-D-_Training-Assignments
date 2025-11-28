package com.assignment;
import java.util.Scanner;

public class CountPosNegZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int pos = 0, neg = 0, zero = 0;

        for (int num : arr) {
            if (num > 0) pos++;
            else if (num < 0) neg++;
            else zero++;
        }

        System.out.println("Positive count: " + pos);
        System.out.println("Negative count: " + neg);
        System.out.println("Zero count: " + zero);

        sc.close();
    }
}


