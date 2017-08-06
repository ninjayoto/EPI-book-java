package com.ryangehring.epi.solutions.c06;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by ryan on 8/5/17.
 */
public class P04Test {
    @Test
    public void isWinnable() throws Exception {
        Integer[] example = {1,2,3};
        assertTrue(P04.isWinnable(example)) ;
        Integer[] example2 = {1,0,3};
        assertFalse(P04.isWinnable(example2)) ;
    }

}