package com.ryangehring.epi.solutions.c16;

import org.junit.Test;

import java.util.Arrays;
import java.util.Set;

import static org.junit.Assert.*;

/**
 * Created by ryan on 8/16/17.
 */
public class P06Test {
    @Test
    public void subsetOfSizeK() throws Exception {
        Set<Set<Integer>> out = P06.subsetOfSizeK(4,2) ;
        for (Set<Integer> s : out) {
            System.out.println(Arrays.toString(s.toArray()));
        }
        assertEquals(6, out.size());

    }

}