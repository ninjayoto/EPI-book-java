package com.ryangehring.epi.solutions.c05;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by ryan on 8/3/17.
 */
public class P03 {

    /*
    Naive Solution --- O(n) .
    Tests each bit and sets.
     */
    public static Long naiveReverseBits(Long x) {
        Long out=0L ;
        for (int i=0; i<64; i++) {
            out = out << 1;
            out = out | ( (x >> i) & 1L) ;

        }
        return out ;
    }

    public static Long precomputeSolution(Long x) {
        Map<Long, Long> store = new HashMap<Long, Long>() ;
        Long l = 0L ;
        while (l < (1L << 17)) {
            store.put(l, naiveReverseBits(l)  );
            l++ ;
        }
        Long mask = (1L << 17 )-1L ;
        Long out = store.get( (x&mask) ) |
                (store.get( ((x>> 16) &mask) ) >> 16) |
                (store.get( ((x >> 32)&mask) ) >> 32) |
                (store.get( ((x>> 48)&mask) ) >> 48) ;
        return out ;

    }

    public static Long reverseBits(Long x) {
        //return naiveReverseBits(x) ;
        return precomputeSolution(x) ;
    }

}
