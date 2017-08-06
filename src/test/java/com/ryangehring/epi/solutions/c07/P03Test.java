package com.ryangehring.epi.solutions.c07;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by ryan on 8/5/17.
 */
public class P03Test {
    @Test
    public void isPalindrome() throws Exception {

        assertTrue(P03.isPalindrome("a"));
        assertTrue(P03.isPalindrome("aba"));
        assertTrue(P03.isPalindrome("abba"));
        assertTrue(P03.isPalindrome(""));
        assertFalse(P03.isPalindrome("ab"));
        assertFalse(P03.isPalindrome("abb"));

    }

}