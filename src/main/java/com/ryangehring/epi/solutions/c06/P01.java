package com.ryangehring.epi.solutions.c06;

/**
 * Dutch national flag problem.
 * Take an array A and an index i.
 * Reorder the array such that the below is true.
 * elements less than A[i], elements equal to A[i], elements greater than A[i]
 * Use constant space and O(n) time.
 *
 * This problem uses a 'three-way index' between:
 *   - less: the number of elements less than A[i] found so far
 *   - mid: pointer to the current element
 *   - high: the number of elements greater than A[i] found so far
 * to maintain the invariant:
 *   [0, less) : less than A[i]
 *   [less,  mid) : equal to A[i]
 *   [ mid, length - high - 1) : unsorted
 *   [length - high - 1, length) : greater than A[i]
 *
 * It's a bit confusing to think through all at once.
 * Start iterating over the array with a pointer.
 * If you get an element < A[i], you want to swap it to the end of the [0, less) region,
 * and increment less. You also increment Mid because you know that the element you are swapping with,
 * at index 'less', is either equal to A[i] or the current location of the pointer. Both are 'safe' for
 * the invariant so you can increment.
 * If you run across an element equal to A[i], just increment mid and keep going.
 * If you run across an element greater than A[i], you swap it with the end of the 'high' region: length-high-1.
 * You can increment high, but since the element you just swapped down is unknown, do NOT increment mid in this case.
 * Once mid passes length - high - 1, you are complete.
 */
public class P01 {

    public static int[] reorder(int[] x, int i ) {
        int k = x[i] ;
        int less = 0 ;
        int mid = 0 ;
        int high = 0 ;
        int currVal ;
        int temp ;
        while (mid < x.length - high ) {
            currVal = x[mid] ;

            if (currVal < k) {
                temp = currVal ;
                x[mid] = x[less] ;
                x[less] = temp ;
                less ++ ;
                mid ++ ;
            } else if (currVal > k) {
                temp = x[x.length - high - 1] ;
                x[x.length - high - 1] = x[mid] ;
                x[mid] = temp ;
                high++ ;
            } else {
                mid++ ;
            }

        }

        return x ;
    }

}
