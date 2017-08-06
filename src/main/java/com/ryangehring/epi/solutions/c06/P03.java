package com.ryangehring.epi.solutions.c06;

/**
 * Multiply big integers.
 * Strategy - multiply like powers of ten.
 * that means, choose i and j such that i+j = k.
 * also maintain a 'carry' from k-1.
 * This is roughly O(len(a) len(b)).
 */
public class P03 {

    public static String multiplyBigIntegers(String a, String b) {
        if ((a == "0") || (b=="0")) return "0" ;
        int max_k = a.length() + b.length()  ;

        boolean negative = false ;
        if (a.charAt(0) == '-') negative = !negative;
        if (b.charAt(0) == '-') negative = !negative;

        char[] out = new char[max_k ] ;


        int carry = 0 ;

        for (int k =0 ;k<max_k ; k++) {
            for (int i=0; i<= k; i++ ) {

                int j = k-i ;
                int i_idx = a.length() - i - 1 ;
                int j_idx = b.length() - j - 1 ;

                if (i_idx < 0 ) break;
                if (j_idx <0 ) continue; ;

                if ((a.charAt(i_idx) == '-') || (b.charAt(j_idx) == '-')  ) continue;
                int aDigit = Character.getNumericValue(a.charAt(i_idx));
                int bDigit = Character.getNumericValue(b.charAt(j_idx));

                carry += (aDigit * bDigit) ;
            }



            out[out.length - k-1 ] = Character.forDigit((carry % 10), 10 );
            carry = carry / 10 ;
        }
        if (negative) out[0] = '-' ;
        return (new String(out)).replaceAll("\\p{C}", "");
    }


}
