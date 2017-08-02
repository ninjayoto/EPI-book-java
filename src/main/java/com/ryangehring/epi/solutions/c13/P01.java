package com.ryangehring.epi.solutions.c13;

import java.util.*;

/**
 * Take a dictionary of words,
 * Return a partition of the dictionary into subsets,
 * of words that are anagrams of each other
 * Strategy - sort the strings.
 * Make a hash table with (sorted_string, [List of anagrams])
 * return that.
 */
public class P01 {

    public static Map<String, List<String>> partitionDict(String[] words){
        HashMap<String, List<String>> out = new HashMap<>() ;
        for (String s: words) {
            char[] w = s.toCharArray() ;
            Arrays.sort(w) ;
            String key = new String(w) ;
            if (out.get(key) == null) {
                List<String> l = new ArrayList<String>();
                l.add(s);
                out.put(key, l) ;
            } else {
                out.get(key).add(s);
            }
        }
        return out ;
    }

}
