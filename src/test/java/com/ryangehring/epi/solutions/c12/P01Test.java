package com.ryangehring.epi.solutions.c12;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by ryan on 8/1/17.
 */
public class P01Test {
    @Test
    public void firstOccurenceOf() throws Exception {
        Integer[] t = {1,2,3} ;
        int out = P01.firstOccurenceOf(t,2) ;
        assertEquals(1, out);

        Integer[] t2= {1};
        out = P01.firstOccurenceOf(t2,1) ;
        assertEquals(0, out);

        Integer[] t3 = {1,2,2,3} ;
        out = P01.firstOccurenceOf(t3,2) ;
        assertEquals(1, out);


        Integer[] t4 = {1,2,2,2,2,2,3} ;
        out = P01.firstOccurenceOf(t4,2) ;
        assertEquals(1, out);

    }

}