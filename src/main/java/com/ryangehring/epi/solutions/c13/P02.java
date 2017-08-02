package com.ryangehring.epi.solutions.c13;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by ryan on 8/1/17.
 */
public class P02 {

    public static  Boolean isPalindromePossible(String s ) {
        Map<Character, Integer> data = new HashMap<Character, Integer>() ;
        for (char c: s.toCharArray()) {
            if (data.get(c) == null) {
                data.put(c, 1) ;
            } else {
                data.put(c, data.get(c) + 1) ;
            }
        }
        int oddCount = 0 ;
        for (Integer i : data.values()) {
            if (i % 2 == 1) oddCount++ ;
        }
        if (oddCount > 1) return false ;
        return true ;
    }
}
