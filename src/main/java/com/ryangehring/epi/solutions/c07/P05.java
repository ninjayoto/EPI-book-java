package com.ryangehring.epi.solutions.c07;

import java.util.*;

/**
 * Created by ryan on 8/5/17.
 */
public class P05 {

    Map<Integer, Character[]> phoneMap;

    public P05() {
        phoneMap = new HashMap<Integer, Character[]>() ;
        phoneMap.put(1, new Character[] {'-'}) ;
        phoneMap.put(2, new Character[] {'A', 'B', 'C'}) ;
        phoneMap.put(3, new Character[] {'D', 'E', 'F'}) ;
        phoneMap.put(4, new Character[] {'G', 'H', 'I'}) ;
        phoneMap.put(5, new Character[] {'J', 'K', 'L'}) ;
        phoneMap.put(6, new Character[] {'M', 'N', 'O'}) ;
        phoneMap.put(7, new Character[] {'P', 'Q', 'R', 'S'}) ;
        phoneMap.put(8, new Character[] {'T', 'U', 'V' } ) ;
        phoneMap.put(9, new Character[] {'W', 'X', 'Y', 'Z'}) ;
    }


    public  void recursiveAllLetterSets(Integer[] x, List<String> out, String prefix) {
        if (prefix.length() >= 9) {
            out.add(prefix) ;
            return ;
        }
        int idx = prefix.length() ;
        for (Character c : phoneMap.get(x[idx])) {
            recursiveAllLetterSets(x, out, prefix+c);
        }
    }

    public  List<String> allLetterSets(Integer[] x) {

        List<String> out = new ArrayList<String>() ;
        recursiveAllLetterSets(x, out, "");

        return out ;


    }

}
