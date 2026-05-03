package com.assignment;

public class Assignment1Strings {
    public static void main(String[] args) {

        // String creation
        String str1 = "Hello";
        String str2 = new String("Hello");

        // Comparison
        System.out.println("Equals: " + str1.equals(str2));
        System.out.println("== operator: " + (str1 == str2));

        // Length
        System.out.println("Length: " + str1.length());

        // Substring
        System.out.println("Substring (0,3): " + str1.substring(0, 3));

        // toUpperCase
        System.out.println("Uppercase: " + str1.toUpperCase());

        // StringBuffer append
        StringBuffer sb = new StringBuffer("Java");
        sb.append(" Programming");
        System.out.println("StringBuffer: " + sb);
    }
}
