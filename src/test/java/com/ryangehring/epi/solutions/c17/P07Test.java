package com.ryangehring.epi.solutions.c17;

import org.junit.Test;

import java.util.Set;

import static org.junit.Assert.*;

/**
 * Created by ryan on 8/3/17.
 */
public class P07Test {
    @Test
    public void knapsack() throws Exception {
        Integer[] values = {1,2,3,4,5};
        Integer[] weights = {2,4,5,6,7};
        Integer weightLimit = 9;
        Set<Integer> out = P07.knapsack(values, weights, weightLimit) ;
        System.out.println(out.toString()) ;
        assertTrue(out.contains(4));
    }

}