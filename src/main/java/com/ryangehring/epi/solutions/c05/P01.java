package com.ryangehring.epi.solutions.c05 ; //calc parity of array of n integers
import java.util.HashMap ;

/**
 * Implements a 'parity' method that returns true if the #
 * of 1's in the bit sequence is odd, false otherwise.
 * parity2 Stores parities for values up to 16 in a hashMap so instead of 63 bit checks, you have 16.
 * Time complexity is constant--- one hash lookup on hit, OR one lookup plus 16 bitshifts on miss
 * Space complexity is constant, you are caching 16 values.
 */
class P01 {

  public P01() {
    precalcParityTable = new HashMap<Long, Boolean>();
    for (long i=0; i<16; i++) {
      precalcParityTable.put(i,  calcParity(i) );
    }
  }

  private HashMap<Long, Boolean> precalcParityTable ;

  private Boolean calcParity(Long x) {
    Boolean out = false;
    for (int i = 0; i < 64; i++) {
      if (((1L << i) & x) != 0L) {
        out = !out;
      }
    }
    return out;
  }

  public Boolean parity2(Long x) {

    Boolean out = false ;
    int mask = 15;
    while (x != 0) {
      out = (out ^ precalcParityTable.get((x & mask)) );
      x = x >> 4 ;
    }
    return out ;
  }

  public Boolean parity( Long x ) {
    Boolean answer = calcParity(x);
    return answer;
  }


}

