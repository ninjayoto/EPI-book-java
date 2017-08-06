package com.ryangehring.epi.solutions.c09;

import java.util.Stack;

/**
 * Longest substring of matching parens
 *
 * Naive way.  Start at char 0. Start adding to stack.
 * Once you fail, bump the index to char 0+1
 * If instead stack isempty, mark the start of a substring at the point you started at.
 * Also, keep track of the end of the range so you can return the substring.
 * This is n^2 CPU, n memory.
 *
 * A smarter way is to use the properties of symmetry.
 * If there is an unmatched right closing paren, you can immediately jump to evaluating
 * that index as the next candidate. Because Any prefix from the prior set of characters will
 * contain that unmatched symbol. And since the size of the subsets is decreasing as you increment i
 * for a fixed left endpoint. So this winds up as O(n).
 *
 *
 */
public class P04 {

    public static String longestBalancedSubstring(String s) {
        Stack<Character> store = new Stack<Character>() ;
        int idx = 0 ;
        char[] word = s.toCharArray() ;
        int champIdx = 0 ;
        int champLen = 0 ;
        int rightIdx = 0;
        while (idx < word.length) {
            while (rightIdx < word.length) {
                if (word[rightIdx] == '(') store.push(word[idx]);
                if (word[rightIdx] == ')') {
                    if (store.isEmpty()) {
                        if (rightIdx - idx+1 > champLen ) {
                            champLen = rightIdx - idx + 1;
                            champIdx = idx ;
                        }

                        idx = rightIdx + 1;
                        rightIdx = idx;

                        break ;
                    }
                    store.pop();
                }
                rightIdx++ ;
            }
        }
        return s.substring(champIdx, champIdx+champLen - 1) ;
    }

}
