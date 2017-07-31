package com.ryangehring.epi.solutions.c05;// flip bits at i and j

class P02 {

  /**
   * Flips bits at index i and j.
   * Slow way --- test bit at position i and j.
   * Then if they are different, flip the bit at i and the bit at j.
   *
   * @param x : the number to flip bits at
   * @param i : the first index
   * @param j : the second index
   * @return
   */
  public static Long flip(long x, int i, int j) {
    // flip only if the
    if ( (( (x >> i) & 1) == 1) != ( ((x >> j) & 1) == 1) ) {
      x = x ^ ( (1 << i)  | (1 << j) ) ;
    }

    return x ;
  }


}