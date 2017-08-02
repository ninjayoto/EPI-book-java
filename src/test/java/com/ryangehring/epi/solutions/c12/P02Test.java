package com.ryangehring.epi.solutions.c12;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by ryan on 8/1/17.
 */
public class P02Test {
    @Test
    public void firstGreaterThan() throws Exception {
        Integer[] t = {1,2,3} ;
        int out = P02.firstGreaterThan(t,2) ;
        assertEquals(2, out);

        Integer[] t2= {1};
        out = P02.firstGreaterThan(t2,1) ;
        assertEquals(-1, out);

        Integer[] t3 = {1,2,2,3} ;
        out = P02.firstGreaterThan(t3,1) ;
        assertEquals(1, out);


        Integer[] t4 = {1,2,2,2,2,2,3} ;
        out = P02.firstGreaterThan(t4,2) ;
        assertEquals(6, out);
    }

}