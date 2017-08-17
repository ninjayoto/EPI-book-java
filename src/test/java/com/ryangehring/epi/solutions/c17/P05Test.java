package com.ryangehring.epi.solutions.c17;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by ryan on 8/16/17.
 */
public class P05Test {
    @Test
    public void maxFish() throws Exception {
        Integer[] g1 = {0,1,0} ;
        Integer[] g2 = {0,0,0} ;
        Integer[] g3 = {0,0,0} ;
        Integer[][] grid = { g1, g2, g3} ;

        assertEquals(1, P05.maxFish(grid));

        Integer[] g11 = {0,2,0} ;
        Integer[] g21 = {0,0,0} ;
        Integer[] g31 = {0,3,0} ;
        Integer[][] grid1 = { g11, g21, g31} ;

        assertEquals(5, P05.maxFish(grid1));

    }

}