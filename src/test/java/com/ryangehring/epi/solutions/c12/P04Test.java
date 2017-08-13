package com.ryangehring.epi.solutions.c12;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by ryan on 8/11/17.
 */
public class P04Test {
    @Test
    public void searchCyclicalArray() throws Exception {
        int[] test = {1,2,3} ;
        assertEquals(0, P04.searchCyclicalArray(test));
        int[] test2 = {2,3,1} ;
        assertEquals(2, P04.searchCyclicalArray(test2));
        int[] test3 = {3,4,5,6,7,1,2} ;
        assertEquals(5, P04.searchCyclicalArray(test3));

    }

}