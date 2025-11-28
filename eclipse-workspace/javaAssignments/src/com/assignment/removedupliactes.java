package com.assignment;
import java.util.Scanner;
import java.util.Set;
import java.util.LinkedHashSet;
public class removedupliactes {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 System.out.print("Enter number of elements: ");
	     int n = sc.nextInt();
	     int[] arr = new int[n];

	     System.out.println("Enter " + n + " numbers:");
	     for (int i = 0; i < n; i++) {
	            arr[i] = sc.nextInt();
	     }


	     Set<Integer> set = new LinkedHashSet<>();

	     for (int num : arr) {
	         set.add(num);  
	     }

	     System.out.println("Array after removing duplicates:");
	     for (int num : set) {
	        System.out.print(num + " ");
	     }
	     
	        
		

	}

}
