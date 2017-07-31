package com.ryangehring.epi.solutions.c07;

import java.util.Arrays;

/**
 * Created by ryan on 7/31/17.
 */
public class P01 {
    public static int stringToInt(String s) {
        char[] c = s.toCharArray() ;
        boolean isNegative = false ;
        int i = 0 ;
        if (c[0] == '-') {
            isNegative = true ;
            i = 1 ;
        }
        int out = 0 ;
        while (i < c.length) {
            if (!Character.isDigit(c[i])) {
                throw new IllegalArgumentException("not valid input") ;
            }
            out = (out * 10) + (int) Character.getNumericValue(c[i]) ;
            i++ ;
        }
        if (isNegative) {
            out = -out ;
        }
        return out ;
    }

    public static String intToString(int i) {
        char[] out = new char[20] ;
        boolean isNegative = false ;
        if (i < 0) {
            isNegative = true ;
            i = -i ;
        }
        int right = out.length - 1 ;
        while (i > 0) {
            int digit = i % 10 ;
            out[right] = (char) (digit + 48) ;
            i = i/ 10 ;
            right = right - 1 ;
        }
        if (isNegative) {
            out[right] = '-' ;
            right = right - 1 ;
        }
        char[] out2 = Arrays.copyOfRange( out, right+1, out.length ) ;
        String almostThere = new String(out2) ;

        return almostThere ;
    }
}
