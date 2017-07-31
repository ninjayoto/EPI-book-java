package com.ryangehring.epi.solutions.c05;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by ryan on 7/30/17.
 */
public class P02Test {
    @Test
    public void flip() throws Exception {
        P02 p = new P02() ;
        assertEquals( 1L , (long) p.flip(2L,0,1) );
        assertEquals( 3L , (long) p.flip(3L,0,1) );
        assertEquals( 5L , (long) p.flip(5L,2,0) );

    }

}