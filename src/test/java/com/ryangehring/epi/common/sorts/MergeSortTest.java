package com.ryangehring.epi.common.sorts;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * Created by ryan on 8/3/17.
 */
public class MergeSortTest {
    @Test
    public void mergeSort() throws Exception {
        Integer[] x = {1,6,4,3,2,5} ;

        MergeSort.mergeSort(x);
        Integer[] expected = {1,2,3,4,5,6} ;

        System.out.println(Arrays.toString(x));

        assertTrue(Arrays.equals(expected, x)) ;

    }

}