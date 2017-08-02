package com.ryangehring.epi.solutions.c13;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by ryan on 8/1/17.
 */
public class P02Test {
    @Test
    public void isPalindromePossible() throws Exception {
        assertTrue(P02.isPalindromePossible("a"));
        assertTrue(P02.isPalindromePossible("abb"));
        assertTrue(P02.isPalindromePossible("abba"));
        assertFalse(P02.isPalindromePossible("ab"));
    }

}