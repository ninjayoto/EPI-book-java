package com.ryangehring.epi.solutions.c17;

import java.util.Map;

/**
 * Levenshtein distance
 * Insert Delete or Change
 *
 * Base cases
 *
 * cats -> cat : 1 change, delete s
 * cats -> carts : 1 change, insert r
 *
 * Lemma - insert a character is equal to delete a character from dest
 * Is change equal to delete from both? yes.
 * This is good because the algorithm now proceeds deterministically
 * in at most m+n+max(m,n) steps to eval everything
 *
 * Recurrence relation
 *   LD is the min OF
 *      all deletes from each character (O(m+n))
 *      all changes
 */
public class P02 {

    public static Integer editDistance(String a, String b, Map<String, Integer> store) {

        if (b.length() > a.length()) {
            String temp = a ;
            a=b;
            b=temp;
        }
        String key = a + " / " + b ;
        if (store.get(key) != null) return store.get(key) ;
        if (a.length() == 0) return b.length() ;
        if (b.length() == 0) return a.length() ;
        if (a.equals(b)) return 0 ;
        Integer minResult = a.length() ;
        for (int i=0; i< a.length(); i++) {
            StringBuilder sb = new StringBuilder() ;
            sb.append(a) ;
            sb.deleteCharAt(i) ;
            String newA = sb.toString() ;
            Integer result = 1+ editDistance(newA, b, store) ;
            if (result < minResult) minResult = result ;
        }
        for (int i=0; i< b.length(); i++) {
            StringBuilder sb = new StringBuilder() ;
            sb.append(b) ;
            sb.deleteCharAt(i) ;
            String newB = sb.toString() ;
            Integer result = 1+ editDistance(a, newB, store) ;
            if (result < minResult) minResult = result ;

            StringBuilder sb2 = new StringBuilder() ;
            sb2.append(a) ;
            sb2.deleteCharAt(i) ;
            String newA = sb2.toString() ;
            Integer result2 = 1+ editDistance(newA, newB, store) ;
            if (result2 < minResult) minResult = result2 ;
        }
        store.put(key, minResult) ;

        return minResult ;
    }

}
