package com.assignment;

import java.util.Arrays;
import java.util.Scanner;

public class leftrotate{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter number of positions to left rotate: ");
        int k = sc.nextInt();

        k = k % n; 
        for (int r = 0; r < k; r++) {
            int first = arr[0];
            for (int i = 0; i < n - 1; i++) {
                arr[i] = arr[i + 1];
            }
            arr[n - 1] = first;
        }

        System.out.println("Array after left rotation: " + Arrays.toString(arr));

    }
}

