package com.ryangehring.epi.solutions.c15;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by ryan on 8/18/17.
 */
public class P07Test {
    @Test
    public void kPoints() throws Exception {

        Integer[] x = {1,3,6,9};
        Integer[] y = {1,4,8,11};
        Integer[] z = {2,6,9,12};

        assertEquals((Integer) 1, P07.kPoints(x,y,z));

    }

}