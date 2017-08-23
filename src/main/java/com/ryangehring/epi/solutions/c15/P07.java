package com.ryangehring.epi.solutions.c15;

import java.util.List;

/**
 * Find the 'max distance' minimizing points.
 *
 * This is a constrained optimization. Assuming any 3 points could be selected, just sort the arrays and try
 * each 3 closest points.
 *
 * With the constraint that each point must come from one array, you must then iterate each array in 'min-lockstep'
 * so move the min element first. Can probably show by contradiction that this will snag the solution.
 *
 * The book says that you could use a BST to store the pointers from each array.
 * The BST encodes all the sorting/order relationships between the points.
 * So rather than doing k comparisons every time to find the min, you can do log(k)
 *
 * I lazily implemented with iterators, not a BST.
 *
 */
public class P07 {

    public static Integer kPoints(Integer[] a, Integer[] b, Integer[] c) {
        int x=0,y=0,z=0;
        int champDist = 9999999;
        while ((x < a.length) || (y < b.length) || (z < c.length) ) {

            int dist = Math.max(
                    Math.max(
                            Math.abs(a[
                                    Math.min(x, a.length-1)] - b[Math.min(y, b.length-1)]
                            ),
                            Math.abs(a[
                                    Math.min(x, a.length-1)] - c[Math.min(z, c.length-1)]
                            )
                    ),
                    Math.abs(b[
                            Math.min(y, b.length-1)] - c[Math.min(z, c.length-1)
                            ])
            );


            if (dist < champDist) champDist = dist ;

            if ((x<a.length) &&  ((a[x] <  b[y]) && (a[x] < c[z]))) {
                x++;
            } else if ((y<b.length) &&  ( b[y] < c[z])) {
                y++;
            } else  {
                z++;
            }
        }
        return champDist;
    }

}
