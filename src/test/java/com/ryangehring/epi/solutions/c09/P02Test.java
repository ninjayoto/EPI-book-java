package com.ryangehring.epi.solutions.c09;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by ryan on 7/31/17.
 */
public class P02Test {
    @Test
    public void evaluateRPN() throws Exception {

        String rpn = "1,2,*";
        Double out = P02.evaluateRPN(rpn) ;
        Double expected = 2. ;
        assertEquals(expected, out);


        String rpn2 = "1,1,+,-2,*";
        Double out2 = P02.evaluateRPN(rpn2) ;
        Double expected2 = -4. ;
        assertEquals(expected2, out2);

    }

}