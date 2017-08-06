package com.ryangehring.epi.solutions.c09;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by ryan on 8/6/17.
 */
public class P05Test {
    @Test
    public void pathShortener() throws Exception {
        assertEquals("/hi/there/", P05.pathShortener("hi/there/"));
        assertEquals("/hi/there/", P05.pathShortener("hi/../hi/there/./"));
    }

}