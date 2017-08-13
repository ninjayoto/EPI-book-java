package com.ryangehring.epi.solutions.c12;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by ryan on 8/12/17.
 */
public class P05Test {
    @Test
    public void searchArray() throws Exception {
        Integer[] x = {1,2,3,4,5,6,7,8,9} ;
        assertEquals((Integer) 3, P05.searchArray(x, 4));

    }

}