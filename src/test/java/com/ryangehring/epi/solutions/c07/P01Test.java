package com.ryangehring.epi.solutions.c07;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by ryan on 7/31/17.
 */
public class P01Test {
    @Test
    public void stringToInt() throws Exception {
        String s = "-1234";
        int out = P01.stringToInt(s) ;
        assertEquals(-1234 , out);

        String s2 = "4";
        int out2 = P01.stringToInt(s2) ;
        assertEquals(4 , out2);

    }

    @Test
    public void intToString() throws Exception {
        int i = 135 ;
        String out = P01.intToString(i) ;
        assertEquals("135", out);

        int i2 = -135 ;
        String out2 = P01.intToString(i2) ;
        assertEquals("-135", out2);
    }

}