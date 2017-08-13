package com.ryangehring.epi.solutions.c14;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by ryan on 8/13/17.
 */
public class P05Test {
    @Test
    public void maxConcurrent() throws Exception {

        Integer[] startTimes = {0,0,2,3,5,9};
        Integer[] endTimes = {1,3,3,4,6,10};
        assertEquals((Integer) 2, P05.maxConcurrent(startTimes,endTimes));

    }

}