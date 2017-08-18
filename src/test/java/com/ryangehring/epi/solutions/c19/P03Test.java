package com.ryangehring.epi.solutions.c19;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * Created by ryan on 8/17/17.
 */
public class P03Test {
    @Test
    public void paintFill() throws Exception {

        boolean[] r1 = {true, false, false, true} ;
        boolean[] r2 = {true, false, false, true} ;
        boolean[] r3 = {false, true, true, true} ;
        boolean[] r4 = {true, false, false, true} ;
        boolean[][] grid = {r1,r2,r3,r4};
        P03.paintFill(grid,0,0);
        System.out.println(Arrays.deepToString(grid));
        assertTrue(!r1[0]);

    }

}