package com.ryangehring.epi.solutions.c14;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by ryan on 8/13/17.
 */
public class P06Test {
    @Test
    public void disjointIntervalAddition() throws Exception {

        Integer[] p = {0,2};
        Integer[] p1 = {3,5};
        Integer[] p2 = {6,7};
        Integer[] p3 = {8,9};
        Integer[][] data = {p,p1,p2,p3};
        Integer[] interval = {1,6};
        List<Integer[]> out = P06.disjointIntervalAddition(data, interval) ;
        Integer[] e1 = {8,9};
        Integer[] e2 = {0,7};
        Integer[][] expected = {e1, e2} ;
        System.out.println(Arrays.toString(out.get(0)) + " " + Arrays.toString(out.get(1)));
        assertTrue(Arrays.deepEquals(expected, out.toArray()));

    }

}