package com.ryangehring.epi.solutions.c17;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Created by ryan on 8/3/17.
 */
public class P07 {

    public static Integer calcValue(Set<Integer> chosen, Integer[] weights, Integer[] values) {
        if (chosen==null) return -1 ;
        Integer currValue = 0 ;
        for (Integer i : chosen) {
            currValue += values[i] ;
        }
        return currValue ;
    }


    private static Set<Integer> calcKnapsack(Integer[] values, Integer[] weights, Integer weightLimit, Set<Integer> chosen ,
                                        Map<Integer, Set<Integer>> solutions) {
        Integer currWeight = 0 ;
        Integer currValue = 0 ;
        for (Integer i : chosen) {
            currWeight += weights[i];
            currValue += values[i] ;
        }
        if (currWeight > weightLimit) return null ;
        if (currWeight.equals( weightLimit)) return chosen ;

        if (solutions.get(currWeight) != null) return solutions.get(currWeight) ;
        Set<Integer> champ = null ;
        Integer champValue = 0 ;
        for (int i=0; i<weights.length; i++) {
            if (chosen.contains(i)) continue ;
            Set<Integer> chosenCopy = new HashSet<Integer>(chosen) ;
            chosenCopy.add(i);
            Set<Integer> solnCandidate = calcKnapsack(values, weights, weightLimit, chosenCopy, solutions);
            if (calcValue(solnCandidate, weights, values) > champValue) {
                champValue = calcValue(solnCandidate, weights, values) ;
                champ = solnCandidate ;
            }
        }
        solutions.put(currWeight, champ) ;
        return champ ;
    }

    public static Set<Integer> knapsack(Integer[] values, Integer[] weights, Integer weightLimit ) {
        return calcKnapsack(values, weights, weightLimit, new HashSet<Integer>(), new HashMap<Integer, Set<Integer>>() ) ;
    }

}
