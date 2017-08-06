package com.ryangehring.epi.solutions.c07;


import com.ryangehring.epi.solutions.c07.P04;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by ryan on 8/5/17.
 */
public class P04Test {
    @Test
    public void reverseOrderWords() throws Exception {

        assertEquals("groot am i", P04.reverseOrderWords("i am groot"));

    }

}