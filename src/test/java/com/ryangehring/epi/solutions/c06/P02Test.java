package com.ryangehring.epi.solutions.c06;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * Created by ryan on 7/31/17.
 */
public class P02Test {
    @Test
    public void incrementBigInteger() throws Exception {
        int[] x = {1, 5 , 2, 3, 4, 3, 3};
        int[] expected = {1, 5 , 2, 3, 4, 3, 4} ;
        int[] out = P02.incrementBigInteger(x) ;

        System.out.println(Arrays.toString(out));
        assertTrue(Arrays.equals(out, expected)  );

        int[] x2 = {9,9,9};
        int[] expected2 = {1, 0,0,0} ;
        int[] out2 = P02.incrementBigInteger(x2) ;

        System.out.println(Arrays.toString(out2));
        assertTrue(Arrays.equals(out2, expected2)  );

    }

}