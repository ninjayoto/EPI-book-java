package com.ryangehring.epi.solutions.c13;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by ryan on 8/12/17.
 */
public class P03Test {
    @Test
    public void writeLetter() throws Exception {
        String magazine = "the cat ran over the fence like a cool cat" ;
        String letter = "cat the cat fence" ;
        assertTrue(P03.writeLetter(magazine, letter));
        String letter2 = "dog the woof" ;
        assertFalse(P03.writeLetter(magazine,letter2));
    }

}