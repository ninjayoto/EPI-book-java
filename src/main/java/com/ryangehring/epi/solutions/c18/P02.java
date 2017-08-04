package com.ryangehring.epi.solutions.c18;

import java.util.Arrays;

/**
 * Greedy optimization --- minimize waiting time.
 * Imagine the local rule (always choose the shortest query)
 * Now imagine there exists another query q_j which minimizes total waiting time but is NOT shortest.
 * Total waiting time for all subsequent queries = sum_i<j ( q_i   ) + q_j + ...
 * but we know q_j is not the shortest query. So by contradiction, q_j must be the shortest query.
 *
 */
public class P02 {

    public static Integer[] shortestWaitingTime(Integer[] queries) {
        Arrays.sort(queries) ;
        return queries ;
    }

}
