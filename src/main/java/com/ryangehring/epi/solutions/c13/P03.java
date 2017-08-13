package com.ryangehring.epi.solutions.c13;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by ryan on 8/12/17.
 */
public class P03 {

    public static Boolean writeLetter(String magazine, String letter) {
        String[] m = magazine.split(" ") ;
        String[] l = letter.split(" ") ;
        Map<String, Integer> store = new HashMap<String, Integer>() ;
        for (String s : m) {
            if (store.get(s) == null) {
                store.put(s, 1);
            } else {
                store.put(s, store.get(s)+1);
            }
        }
        for (String s : l) {
            if (store.get(s) == null) {
                return false ;
            } else if (store.get(s) <= 0 ) {
                return false ;
            } else {
                store.put(s, store.get(s) - 1 ) ;
            }
        }
        return true ;
    }

}
