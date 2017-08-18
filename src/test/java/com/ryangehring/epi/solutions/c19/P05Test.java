package com.ryangehring.epi.solutions.c19;

import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.*;

/**
 * Created by ryan on 8/17/17.
 */
public class P05Test {
    @Test
    public void transforms() throws Exception {
        Set<String> words = new HashSet() ;
        words.add("cat");
        words.add("bat");
        words.add("bit");
        words.add("kit");
        words.add("cow");
        int out = P05.transforms("cat", "kit", words);
        assertEquals(3, out);

        out = P05.transforms("cat", "bat", words);
        assertEquals(1, out);

        out = P05.transforms("cat", "cow", words);
        assertEquals(-1, out);

    }

}