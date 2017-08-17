package com.ryangehring.epi.solutions.c17;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by ryan on 8/17/17.
 */
public class P06Test {
    @Test
    public void occursIn() throws Exception {
        Integer[] g1 = {0,1,2} ;
        Integer[] g2 = {0,0,3} ;
        Integer[] g3 = {0,0,0} ;
        Integer[][] grid = { g1, g2, g3} ;
        Integer[] data = {1,2,3};

        assertTrue(P06.occursIn(grid, data)) ;
    }

}