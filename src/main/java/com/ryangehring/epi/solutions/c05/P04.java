package com.ryangehring.epi.solutions.c05;

/**
 * Simply shift the smallest set bit left to the next location of an unset bit.
 */
public class P04 {

    public static int calcWeight(Long l) {
        int count = 0 ;
        for (int i=0; i<64; i++) {
            count += ((l >> i) & 1) ;
        }
        return count ;
    }

    public static Long closestWeight(Long l) {
        int weight = calcWeight(l) ;
        //
        for (int i=0; i< 64; i++) {

            if ((((l >> i) & 1L) == 1L)  ^ ((((l >> (i+1)) & 1L) == 1L))) {
                Long mask = (1L << i) + (1L<<(i+1)) ;
                return (l ^ mask) ;
            }

        }
        return  null ;
    }

}
