package com.ryangehring.epi.solutions.c17;

import com.sun.org.apache.xpath.internal.operations.Bool;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by ryan on 8/16/17.
 */
public class P04Test {
    @Test
    public void nWays() throws Exception {
        Boolean[] g1 = {false,false,true} ;
        Boolean[] g2 = {false,false,true} ;
        Boolean[] g3 = {false,false,true} ;
        Boolean[][] grid = { g1, g2, g3} ;

        assertEquals(3, P04.nWays(grid));

        Boolean[] g11 = {false,false,false} ;
        Boolean[] g21 = {false,false,false} ;
        Boolean[] g31 = {false,false,false} ;
        Boolean[][] grid1 = { g11, g21, g31} ;

        assertEquals(6, P04.nWays(grid1));


    }

}