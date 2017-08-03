package com.ryangehring.epi.solutions.c17;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by ryan on 8/2/17.
 */
public class P01Test {
    @Test
    public void numberOfCombinations() throws Exception {
        Integer[] w = {2,3,7} ;
        Integer n = 12 ;
        assertEquals((Integer) 4, P01.numberOfCombinations(w, n));
    }

    @Test
    public void numberOfPermutations() throws Exception {
        Integer[] w = {2,3,7} ;
        Integer n = 12 ;
        assertEquals((Integer) 18, P01.numberOfPermutations(w, n));
    }

}