package com.ryangehring.epi.solutions.c11;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * Created by ryan on 8/1/17.
 */
public class P02Test {
    @Test
    public void sortKIncreasingDecreasingArray() throws Exception {

        Integer[] test = {1,4,8,7,3,5,9,6,2};
        Integer[] expected = {1,2,3,4,5,6,7,8,9};
        Integer[] out = P02.sortKIncreasingDecreasingArray(test, 4) ;
        System.out.println(Arrays.toString(out)) ;
        assertTrue(Arrays.equals(expected, out));



    }

}