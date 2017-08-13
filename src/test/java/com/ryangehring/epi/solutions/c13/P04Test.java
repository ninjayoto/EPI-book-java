package com.ryangehring.epi.solutions.c13;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by ryan on 8/12/17.
 */
public class P04Test {

    @Test
    public void put() throws Exception {
        P04 p = new P04();
        p.put("a", 1) ;
        p.put("b", 1) ;
        p.put("c", 1) ;
        p.put("d", 1) ;
        p.put("e", 1) ;
        p.put("f", 1) ;
        p.put("g", 1) ;
        p.put("h", 1) ;
        p.put("i", 1) ;
        p.put("j", 1) ;
        p.put("k", 1) ;
        p.put("l", 1) ;
        p.put("m", 1) ;
        assertNull(p.get("a"));
        assertEquals((Integer) 1 , p.get("l"));
    }


}