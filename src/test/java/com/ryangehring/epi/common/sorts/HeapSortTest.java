package com.ryangehring.epi.common.sorts;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * Created by ryan on 8/3/17.
 */
public class HeapSortTest {
    @Test
    public void heapSort() throws Exception {
        Integer[]  test = {1,4,2,6,3,5} ;
        Integer[] expected = {1,2,3,4,5,6} ;
        HeapSort.heapSort(test);
        assertTrue(Arrays.equals(expected, test));
    }

}