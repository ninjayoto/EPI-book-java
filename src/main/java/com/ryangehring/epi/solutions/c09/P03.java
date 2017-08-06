package com.ryangehring.epi.solutions.c09;

import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

/**
 * Created by ryan on 8/6/17.
 */
public class P03 {

    public static Boolean isBalanced(String s) {

        Set<Character> opens = new HashSet<Character>() ;
        opens.add('(');
        opens.add('[');
        opens.add('{');
        Set<Character> closes = new HashSet<Character>() ;
        closes.add(')');
        closes.add(']');
        closes.add('}');


        Stack<Character> stack = new Stack<Character>() ;
        for (char c : s.toCharArray()) {
            if (opens.contains(c)) stack.push(c);
            if (closes.contains(c)) {
                Character test = stack.pop() ;
                if (test==null) return false ;
                if ((test == '{') && (c != '}')) return false ;
                if ((test == '[') && (c != ']')) return false ;
                if ((test == '(') && (c != ')')) return false ;
            }
        }
        if (!stack.isEmpty()) return false ;
        return true ;
    }


}
