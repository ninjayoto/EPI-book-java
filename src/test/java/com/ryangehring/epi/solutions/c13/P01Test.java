package com.ryangehring.epi.solutions.c13;

import org.junit.Test;

import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;

/**
 * Created by ryan on 8/1/17.
 */
public class P01Test {
    @Test
    public void partitionDict() throws Exception {
        String[] t = {"hi", "ih", "cat"} ;
        Map<String, List<String>> out = P01.partitionDict(t) ;
        assertEquals(2, out.get("hi").size());
    }

}