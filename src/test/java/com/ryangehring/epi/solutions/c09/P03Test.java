package com.ryangehring.epi.solutions.c09;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by ryan on 8/6/17.
 */
public class P03Test {
    @Test
    public void isBalanced() throws Exception {

        assertTrue(P03.isBalanced("(hi!)")) ;
        assertTrue(P03.isBalanced("{hi(!)}")) ;
        assertFalse(P03.isBalanced("(h]i!)")) ;

    }

}