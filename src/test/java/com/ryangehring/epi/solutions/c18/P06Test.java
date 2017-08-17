package com.ryangehring.epi.solutions.c18;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by ryan on 8/17/17.
 */
public class P06Test {
    @Test
    public void kCreates() throws Exception {
        int[] data = {1,3,5,7} ;
        assertTrue(P06.kCreates(data, 11));
    }

}