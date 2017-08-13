package com.ryangehring.epi.solutions.c13;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by ryan on 8/12/17.
 */
public class P07Test {
    @Test
    public void mostCollinear() throws Exception {

        Integer[] p1 = {0,0,0} ;
        Integer[] p2 = {1,0,0} ;
        Integer[] p3 = {2,0,0} ;
        Integer[] p4 = {0,1,0} ;
        Integer[] p5 = {0,0,1} ;
        Integer[][] test = {p1, p2,p3,p4,p5};

        List<Integer[]> out = P07.mostCollinear(test) ;
        boolean isContained = false ;
        for (Integer[] p : out) {
            if (p3.equals(p) ) isContained = true ;
        }


        assertTrue(isContained);

    }

}