package com.ryangehring.epi.solutions.c14;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by ryan on 8/1/17.
 */
public class P01Test {

    @Test
    public void calcIntersection() throws Exception {
        Integer[] a= {1,2,3,5};
        Integer[] b={2,3,4} ;
        Integer[] out = P01.calcIntersection(a, b ) ;
        assertEquals((Integer) 2, out[0]);
        assertEquals((Integer) 3, out[1]);


    }

}