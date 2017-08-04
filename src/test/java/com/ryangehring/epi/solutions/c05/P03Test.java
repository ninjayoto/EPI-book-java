package com.ryangehring.epi.solutions.c05;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by ryan on 8/3/17.
 */
public class P03Test {
    @Test
    public void reverseBits() throws Exception {
        Long x = ((1L << 33) + 1L) ;
        Long out = P03.reverseBits(x) ;

        assertTrue( ((out >> 30) & 1) == 1L) ;
    }

}