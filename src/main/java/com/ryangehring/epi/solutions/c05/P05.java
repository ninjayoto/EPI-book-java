package com.ryangehring.epi.solutions.c05;

/**
 * Bit operations only multiplication.
 *
 * Did this by rewriting the product as sums of digits.
 * SUM_i (c_i 2^1) * SUM_j (d_j 2^j)
 * The powers of two add and the coefs multiply.
 * Conveniently the product of the coefficients is 0 or 1 always.
 *
 * This requires addition to work.
 * Addition --- since 2^k + 2^k = 2^(k+1) ,
 *   you need to 'carry' ie set the bit 1 left of where x and y are both 1.
 *   you can 'add' ie flip bits anywhere there is a 1 and 0 exclusive or via xor.
 *   Then you need to repeat the operation with the 'carry' and the partial sum only.
 *   repeat until done.
 *
 */
public class P05 {

    public static Long multiply(int x, int y ) {

        Long out = 0L ;
        for (int i=0; i<32; i++) {
            for (int j=0; j<32; j++) {
                if (i+j > 63) continue;
                out = add(out , (long) ((((x >> i) & 1) & ((y >> j) & 1)) << (i+j) ) );
            }
        }
        return out ;

    }

    public static Long add(Long x, Long y) {
        while (y != 0) {
            Long carry = x & y ;
            x = x ^ y ;
            y = carry << 1 ;
        }
        return x ;
    }

}
