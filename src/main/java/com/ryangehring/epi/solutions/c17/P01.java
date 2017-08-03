package com.ryangehring.epi.solutions.c17;

import java.util.HashMap;
import java.util.Map;

/**
 * Number of combinations from denominations of W that add to n:
 *  this is the 'making change' problem.
 *  Recurrence relation: f(n) = sum_i of f(n-w_i)
 *  To avoid finding all permutations, you need to also pass i, the index beyond which
 *  w is no longer there.
 */
public class P01 {

    private static Integer numberCombinations(Integer[] w, Integer n, Integer offset, Map<String, Integer> store ) {
        String key = n + " - " + offset ;
        if (store.get(key) != null) return store.get(key) ;
        if (n < 0) return 0 ;
        if (n==0) return 1 ;
        int out = 0 ;
        for (int i=0; i<offset; i++) {
            out += numberCombinations(w, n-w[i], i+1, store ) ;
        }

        store.put(key, out) ;
        return out ;
    }

    public static Integer numberOfCombinations(Integer[] w, Integer n ) {
        Map<String, Integer> store = new HashMap<String, Integer>() ;
        return numberCombinations(w, n, w.length, store) ;
    }

    private static Integer numberOfPermutations(Integer[] w, Integer n, Map<Integer, Integer> store) {
        if (store.get(n) != null) return store.get(n) ;
        if (n < 0) return 0 ;
        if (n==0) return 1 ;
        int out = 0 ;
        for (int i=0; i<w.length; i++) {
            out += numberOfPermutations(w, n-w[i], store ) ;
        }
        store.put(n, out) ;
        return out ;
    }

    public static Integer numberOfPermutations(Integer[] w, Integer n ) {
        Map<Integer, Integer> store = new HashMap<Integer, Integer>() ;
        return numberOfPermutations(w, n, store) ;
    }

}
