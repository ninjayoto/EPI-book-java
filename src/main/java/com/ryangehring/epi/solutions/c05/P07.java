package com.ryangehring.epi.solutions.c05;

/**
 * X^(2^1 + 2^3) = x^(2)x^(2^3)
 * If the LSB is set, x^y = x*x^(y-1)
 * If the LSB is not set, factor out x^2 and shift right
 */
public class P07 {




    public static Double exponentiation(Double x, Integer y) {

        Double res = 1. ;
        if (y < 0) {
            y = -y ;
            x = 1/ x ;
        }
        int power = y ;
        while (power > 0) {
            if ((power & 1) == 1) {
                res = res* x ;
            }
            x = x*x ;
            power = power >> 1 ;
        }
        return res ;


    }


}
