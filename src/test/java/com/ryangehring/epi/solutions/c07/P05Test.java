package com.ryangehring.epi.solutions.c07;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by ryan on 8/5/17.
 */
public class P05Test {
    @Test
    public void allLetterSets() throws Exception {

        P05 p = new P05() ;
        List<String> out = p.allLetterSets(new Integer[] {1,1,1,1,1,1,1,1,2}) ;
        assertEquals(3, out.size());
    }

}