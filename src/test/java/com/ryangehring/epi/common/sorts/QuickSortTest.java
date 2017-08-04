package com.ryangehring.epi.common.sorts;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * Created by ryan on 8/3/17.
 */
public class QuickSortTest {
    @Test
    public void quickSort() throws Exception {
        Integer[]  test = {1,1,1,4,2,6,3,5} ;
        Integer[] expected = {1,1,1,2,3,4,5,6} ;
        QuickSort.quickSort(test);
        System.out.println(Arrays.toString(test));
        assertTrue(Arrays.equals(expected, test));

    }

}