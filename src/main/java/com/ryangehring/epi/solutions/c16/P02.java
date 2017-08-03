package com.ryangehring.epi.solutions.c16;

/**
 * Extended simple Regex:
 *   Handle [a-Z0-9], ., and *, plus ^ and $
 * Regex recurrence relation:
 *   -
 */
public class P02 {


    public static Boolean recursiveRegex(String word, String regex, int i, int j) {
        if (i >= word.length() && j >= regex.length()) return true ;
        if (j >= regex.length() ) return true ;
        if (regex.charAt(j) == '^') {
            if (i == 0) return recursiveRegex(word, regex, i, j + 1);
            return false ;
        } else if (regex.charAt(j) == '$') {
            if (i==word.length() ) return true ;
            return false ;
        } else if ( ((j+1) < regex.length()  ) && ( regex.charAt(j+1) == '*')) {
            if (regex.charAt(j) == '.') {
                if (i < word.length()) {
                    Boolean greedy = recursiveRegex(word, regex, i + 1, j);
                    if (greedy) return greedy;
                }
                return recursiveRegex(word, regex, i, j+2) ;
            } else if (word.charAt(i) == regex.charAt(j) ) {
                if (i < word.length()) {
                    Boolean greedy = recursiveRegex(word, regex, i + 1, j);
                    if (greedy) return greedy;
                }
                return recursiveRegex(word, regex, i , j+2);
            }  else {
                return recursiveRegex(word, regex, i , j+2);
            }
        } else if ( (i < word.length()) && (word.charAt(i) == regex.charAt(j))) {
            return recursiveRegex(word, regex, i+1, j+1) ;
        }
        if (i < word.length()) return recursiveRegex(word, regex, i+1, 0) ;
        return false ;
    }

    public static Boolean isRegexMatch(String word, String regex) {
        return recursiveRegex(word, regex, 0, 0) ;
    }

}
