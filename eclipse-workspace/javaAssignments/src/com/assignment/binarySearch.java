package com.assignment;

import java.util.Arrays;
import java.util.Scanner;

public class binarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);        
        int n = sc.nextInt();
        int[] arr = new int[n];        
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.println("Sorted array: " + Arrays.toString(arr));
        System.out.print("Enter element to search: ");
        int key = sc.nextInt();
        int low = 0, high = n - 1;
        boolean found = false;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == key) {
                System.out.println("Element found at index (in sorted array): " + mid);
                found = true;
                break;
            } else if (key > arr[mid]) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        if (!found) {
            System.out.println("Element not found.");
        }

        
    }
}
