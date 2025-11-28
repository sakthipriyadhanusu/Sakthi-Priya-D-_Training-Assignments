package com.assignment;

import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
public class Elementfrequency {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		HashMap<Integer, Integer> freq = new HashMap<>();

	    for (int num : arr) {
	    	
	       freq.put(num, freq.getOrDefault(num, 0) + 1);
	    }

	    System.out.println("Frequency of each element:");
	    for (Map.Entry<Integer, Integer> entry : freq.entrySet()) {
	        System.out.println(entry.getKey() + " -> " + entry.getValue());
	    }
		
		
		

	}

}
