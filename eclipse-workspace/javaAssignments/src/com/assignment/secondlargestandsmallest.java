package com.assignment;
import java.util.Arrays;
import java.util.Scanner;

public class secondlargestandsmallest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements : ");
        int n = sc.nextInt();

        if (n < 2) {
            System.out.println("Need at least 2 elements.");
            return;
        }

        int[] arr = new int[n];
        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        int secondSmallest = arr[1];
        int secondLargest = arr[n - 2];

        System.out.println("Second Smallest: " + secondSmallest);
        System.out.println("Second Largest: " + secondLargest);

        
    }
}

