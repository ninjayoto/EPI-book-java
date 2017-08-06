package com.ryangehring.epi.solutions.c05;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by ryan on 8/4/17.
 */
public class P07Test {
    @Test
    public void exponentiation() throws Exception {

        assertEquals(4.0, P07.exponentiation(2. , 2), 0.01) ;
        assertEquals(49.0, P07.exponentiation(7. , 2), 0.01) ;
        assertEquals(0.25, P07.exponentiation(2. , -2), 0.01) ;

    }

}