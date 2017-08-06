package com.ryangehring.epi.solutions.c05;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by ryan on 8/4/17.
 */
public class P05Test {
    @Test
    public void multiply() throws Exception {

        assertEquals((Long) 6L, P05.multiply(3,2));
        assertEquals((Long) 63L, P05.multiply(9,7));
        assertEquals((Long) 0L, P05.multiply(0,23));

    }

}