package com.ryangehring.epi.solutions.c18;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by ryan on 8/17/17.
 */
public class P05Test {
    @Test
    public void elCheapoFirstFit() throws Exception {

        int[] items = {3,3,2,4} ;
        List<List<Integer>> out = P05.elCheapoFirstFit(5, items) ;
        assertEquals(3, out.size());
    }

}