package com.ryangehring.epi.solutions.c05;

import com.ryangehring.epi.solutions.c13.*;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by ryan on 8/4/17.
 */
public class P04Test {
    @Test
    public void closestWeight() throws Exception {
        assertEquals((Long) 1L, P04.closestWeight(2L));
        assertEquals((Long) 6L, P04.closestWeight(5L));
        assertEquals((Long) 5L, P04.closestWeight(3L));
    }

}