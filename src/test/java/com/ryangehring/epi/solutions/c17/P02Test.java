package com.ryangehring.epi.solutions.c17;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

/**
 * Created by ryan on 8/2/17.
 */
public class P02Test {
    @Test
    public void editDistance() throws Exception {

        Map<String, Integer> store = new HashMap<String, Integer>() ;
        Integer out = P02.editDistance("cat", "cats", store) ;
        assertEquals((Integer) 1, out);

        Integer out2 = P02.editDistance("ba", "cats", store) ;
        assertEquals((Integer) 3, out2);

        Integer out3 = P02.editDistance("ban", "cannot", store) ;
        assertEquals((Integer) 4, out3);

    }

}