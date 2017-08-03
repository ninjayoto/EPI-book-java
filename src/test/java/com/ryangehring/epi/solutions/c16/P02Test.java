package com.ryangehring.epi.solutions.c16;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by ryan on 8/2/17.
 */
public class P02Test {
    @Test
    public void isRegexMatch() throws Exception {
        assertTrue(P02.isRegexMatch("cats are great!", "great")) ;
        assertTrue(P02.isRegexMatch("cats are great!", "^cats")) ;
        assertTrue(P02.isRegexMatch("cats are great!", "t!$")) ;
        assertTrue(P02.isRegexMatch("cats are great!", ".*")) ;
        assertTrue(P02.isRegexMatch("cats are great!", "a*")) ;
        assertTrue(P02.isRegexMatch("cats are great!", "ar.*g")) ;
        assertTrue(P02.isRegexMatch("cats are great!", "ar.*$")) ;
        assertFalse(P02.isRegexMatch("cats are great!", "wolves"));
        assertFalse(P02.isRegexMatch("cats are great!", "cats$"));
        assertFalse(P02.isRegexMatch("cats are great!", "^great"));
        assertFalse(P02.isRegexMatch("cats are great!", "c.*t$"));
        assertFalse(P02.isRegexMatch("cats are great!", "^.*rz"));
    }

}