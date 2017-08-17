package com.ryangehring.epi.solutions.c18;

/**
 * Trapping water
 *
 * A container is defined by three properties,
 * left height > middle height
 * right height > middle height
 *
 * Suppose I start iterating the array. At every point, I can:
 *   - Add the positive difference between min(left height, right height) and curr to get capacity.
 *   But how do I know left height?
 *   Left height will be the trailing max.
 *   Right height will be the following max.
 *  This leads to n^2 algorithm where at every pointt I find the trailing min and the following max.
 *
 *  Is there a 'greedy' way to do it to save CPU?
 *  Looks like this is a 2-pass algorithm.
 *  First, find the maximum entry in the array.
 *  Then, iterate at it from both sides.
 *
 */
public class P03 {

    public static int capacity(Integer[] data) {

        int champ = -1 ;
        int champIdx = -1 ;
        for (int i=0;i<data.length; i++) {
            if (data[i] > champ) {
                champ = data[i] ;
                champIdx = i ;
            }
        }
        int capacity = 0;
        int leftMax = 0 ;

        for (int i=0; i<champIdx; i++) {
            if (data[i] > leftMax) {
                leftMax = data[i] ;
            }
            if (data[i] < leftMax) {
                capacity+= leftMax - data[i] ;
            }
        }

        int rightMax = 0 ;
        for (int i=data.length-1; i>champIdx; i--) {
            if (data[i] > rightMax) {
                rightMax = data[i] ;
            }
            if (data[i] < rightMax) {
                capacity+= rightMax - data[i] ;
            }
        }
        return capacity ;
    }

}
