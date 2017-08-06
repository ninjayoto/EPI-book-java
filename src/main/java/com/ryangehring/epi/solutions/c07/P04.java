package com.ryangehring.epi.solutions.c07;

/**
 * I guess I'll do it the cheaty way?
 * Using a split method....
 */
public class P04 {

    public static String reverseOrderWords(String s ) {
        String[] sa = s.split(" ") ;
        StringBuilder b = new StringBuilder() ;
        for (int i=sa.length -1; i>= 0; i++) {
            b.append(sa[i]) ;
        }
        return b.toString();

    }

}
