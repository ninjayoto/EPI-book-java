package com.ryangehring.epi.solutions.c06;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;
import java.util.Arrays;

/**
 * Created by ryan on 7/30/17.
 */
public class P01Test {
    @Test
    public void reorder() throws Exception {

        int i=5 ;
        int[] x = {1, 5 , 2, 3, 4, 3, 3};
        int[] expected = {1,2,3,3,3,4,5} ;
        int[] out = P01.reorder(x, i) ;
        System.out.println(Arrays.toString(out));
        assertTrue(Arrays.equals(out, expected)  );

        int i2=0 ;
        int[] x2 = {1, 5 , 2, 3, 4, 3, 3};
        int[] expected2 = {1,2,3,4,3,3,5} ;
        int[] out2 = P01.reorder(x2, i2) ;
        System.out.println(Arrays.toString(out2 ));
        assertTrue(Arrays.equals(out2, expected2)  );


        ;
    }

}