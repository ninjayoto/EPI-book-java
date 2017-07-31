package com.ryangehring.epi.solutions.c05;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by ryan on 7/30/17.
 */
public class P01Test {


    @Test
    public void parityShouldBeCorrect() {
        P01 tester = new P01();

        // assert statements
        assertEquals("Parity of 0 is false", false, tester.parity(0L) );
        assertEquals("Parity of 0 is false", false, tester.parity(0L) );
        assertEquals("Parity of 1 is true", true, tester.parity(1L) );
        assertEquals("Parity of 2 is true", true, tester.parity(2L) );
        assertEquals("Parity of 3 is false", false, tester.parity(3L) );

    }

    @Test
    public void parity2ShouldBeCorrect() {
        P01 tester = new P01();

        // assert statements
        assertEquals("Parity of 0 is false", false, tester.parity2(0L) );
        assertEquals("Parity of 0 is false", false, tester.parity2(0L) );
        assertEquals("Parity of 1 is true", true, tester.parity2(1L) );
        assertEquals("Parity of 2 is true", true, tester.parity2(2L) );
        assertEquals("Parity of 3 is false", false, tester.parity2(3L) );
        assertEquals("Parity of 3 is false", false, tester.parity2(18L) );

    }

}