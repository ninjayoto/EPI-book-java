package com.ryangehring.epi.solutions.c14;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * Created by ryan on 8/13/17.
 */
public class P04Test {
    @Test
    public void removeDuplicates() throws Exception {
        String[] test = {"hi", "cats", "are", "hi", "right", "always" };
        P04.removeDuplicates(test);
        System.out.println(Arrays.toString(test));
        int hiCount = 0 ;
        for (String s : test) {
            if (s == null) continue;
            if (s.equals("hi")) hiCount++ ;
        }
        assertEquals(1,hiCount);
    }

}