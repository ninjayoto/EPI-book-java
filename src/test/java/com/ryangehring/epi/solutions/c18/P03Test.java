package com.ryangehring.epi.solutions.c18;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by ryan on 8/17/17.
 */
public class P03Test {
    @Test
    public void capacity() throws Exception {

        Integer[] data = {1,4,2,3} ;
        assertEquals(1, P03.capacity(data));

        Integer[] data2 = {6,4,2,4} ;
        assertEquals(2, P03.capacity(data2));

        Integer[] data3 = {4,1,2,3} ;
        assertEquals(3, P03.capacity(data3));



    }

}