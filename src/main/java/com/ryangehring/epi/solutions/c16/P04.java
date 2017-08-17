package com.ryangehring.epi.solutions.c16;

/**
 * Print all permutations
 */
public class P04 {


    public static void printAllPermutationsRecursive(String start, String remaining) {
        if (remaining.length() <= 0) {
            System.out.println(start);
            return;
        }
        for (int i=0; i<remaining.length(); i++) {
            String newRemaining = remaining.substring(0,i) + remaining.substring(i+1) ;
            printAllPermutationsRecursive(start + remaining.charAt(i), newRemaining );
        }
    }

    public static void printAllPermutations(String s) {
        String start = "" ;
        printAllPermutationsRecursive(start, s);
    }

}
