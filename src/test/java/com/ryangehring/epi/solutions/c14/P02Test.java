package com.ryangehring.epi.solutions.c14;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * Created by ryan on 8/2/17.
 */
public class P02Test {
    @Test
    public void mergeSortInPlace() throws Exception {
        Integer[] a = {1,3,5,null,null} ;
        Integer[] b = {2,4} ;
        P02.mergeSortInPlace(a ,b);
        Integer[] expected = {1,2,3,4,5} ;
        assertTrue(Arrays.equals(expected, a));
    }

}