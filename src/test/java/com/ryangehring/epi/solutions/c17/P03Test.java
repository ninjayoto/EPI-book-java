package com.ryangehring.epi.solutions.c17;

import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.*;

/**
 * Created by ryan on 8/16/17.
 */
public class P03Test {
    @Test
    public void binomialCoef() throws Exception {

        assertEquals(3, P03.dynamicBinomialCoef(3,1,new HashMap<>() ) ) ;
        assertEquals(6, P03.dynamicBinomialCoef(4,2, new HashMap<>()) ) ;

    }

}