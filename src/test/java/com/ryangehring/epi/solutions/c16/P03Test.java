package com.ryangehring.epi.solutions.c16;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by ryan on 8/16/17.
 */
public class P03Test {
    @Test
    public void nQueens() throws Exception {

        List<Integer[][]> out = P03.nQueens(4) ;
        for (Integer[][] a : out) {
            System.out.println(Arrays.deepToString(a));
        }
        assertEquals((Integer) 2 , (Integer) out.size());
    }

}