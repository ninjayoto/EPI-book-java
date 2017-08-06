package com.ryangehring.epi.solutions.c09;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by ryan on 8/6/17.
 */
public class P04Test {
    @Test
    public void longestBalancedSubstring() throws Exception {

        assertEquals("(())", P04.longestBalancedSubstring("(()))"));
        assertEquals("(())", P04.longestBalancedSubstring(")(()))"));
        assertEquals("(()())", P04.longestBalancedSubstring("(()()))"));


    }

}