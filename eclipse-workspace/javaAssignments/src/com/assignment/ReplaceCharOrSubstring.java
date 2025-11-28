package com.assignment;
import java.util.Scanner;
public class ReplaceCharOrSubstring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter original string: ");
        String s = sc.nextLine();

        System.out.print("Enter substring to replace: ");
        String old = sc.nextLine();

        System.out.print("Enter new substring: ");
        String news = sc.nextLine();

        String replaced = s.replace(old, news);

        System.out.println("After replacement: " + replaced);

      
    }
}
