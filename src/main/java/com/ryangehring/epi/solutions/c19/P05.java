package com.ryangehring.epi.solutions.c19;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * String production -
 * Decide if a string s produces t
 * making one character changes from a set. (all words same length).
 *
 * Naive approach - simple BFS.
 * Try every character change. stop when you hit.
 *
 * Danger of naive approach - when to terminate.
 * Thought : are there at most n changes for a string of length n?
 * Not necessarily - suppose i have the words cat - bat - bit - kit
 * here i had to change the letter c to b to get the middle vowel.
 *
 * Book answer - each string is a graph.
 * It is adjacent to everything one char away.
 * Find shortest path from A to B.
 *
 */
public class P05 {


    public static int transforms(String a, String b, Set<String> store) {
        List<String> queue = new ArrayList<>();
        List<String> loadQueue = new ArrayList<>();
        Set<String> searched = new HashSet<>() ;
        queue.add(a);

        int count = 0 ;
        String chars = "abcdefghijklmnopqrstuvwxyz" ;

        while (!queue.isEmpty() || !loadQueue.isEmpty()) {

            String curr = queue.remove(0) ;
            searched.add(curr);
            System.out.println(curr);
            if (curr.equals(b)) return count ;

            for (int i=0; i< curr.length() ; i++) {
                for (char c : chars.toCharArray()) {
                    String test = curr.substring(0, i) +c + curr.substring(i+1,curr.length()) ;
                    if (store.contains(test)) {
                        if (searched.contains(test)) continue;
                        loadQueue.add(test) ;
                    }
                }
            }
            if (queue.isEmpty()) {
                count++;
                for (String s : loadQueue) {
                    queue.add(s);
                }
                loadQueue.clear();
                continue;
            }
        }
        return -1 ;
    }

}
