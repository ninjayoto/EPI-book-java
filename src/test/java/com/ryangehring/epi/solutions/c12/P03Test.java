package com.ryangehring.epi.solutions.c12;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by ryan on 8/11/17.
 */
public class P03Test {
    @Test
    public void findEqualSpot() throws Exception {

        Integer[] test = {-1,0,2,3};
        assertEquals((Integer) 2, P03.findEqualSpot(test));
    }

}