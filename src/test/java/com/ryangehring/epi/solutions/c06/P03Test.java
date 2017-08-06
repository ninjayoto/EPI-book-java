package com.ryangehring.epi.solutions.c06;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by ryan on 8/5/17.
 */
public class P03Test {
    @Test
    public void multiplyBigIntegers() throws Exception {
        assertEquals("81" , P03.multiplyBigIntegers("9", "9") );
        assertEquals("0" , P03.multiplyBigIntegers("9", "0") );
        assertEquals("-273" , P03.multiplyBigIntegers("-91", "3") );
        assertEquals("000100" , P03.multiplyBigIntegers("-10", "-10") );

    }

}