package com.ryangehring.epi.solutions.c14;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by ryan on 8/19/17.
 */
public class P07Test {
    @Test
    public void mergeIntervals() throws Exception {

        List<Integer[]> intervals = new ArrayList();
        Integer[] i1 = {1,4} ;
        Integer[] i2 = {0,2} ;
        Integer[] i3 = {5,6} ;
        Integer[] i4 = {9,10} ;
        intervals.add(i1);
        intervals.add(i2);
        intervals.add(i3);
        intervals.add(i4);

        List<Integer[]> out = P07.mergeIntervals(intervals) ;
        assertEquals(3, out.size());

    }

}