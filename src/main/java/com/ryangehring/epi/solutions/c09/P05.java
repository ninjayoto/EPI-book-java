package com.ryangehring.epi.solutions.c09;

import java.util.Stack;

/**
 * Created by ryan on 8/6/17.
 */
public class P05 {

    public static String pathShortener(String path) {
        Stack<String> store = new Stack<String>() ;
        store.push("/") ;
        for (String s : path.split("/")) {
            if (s.equals(".")) continue;
            if (s.equals("..")) {
                store.pop();
                store.pop() ;
            } else {
                store.push(s);
                store.push("/");
            }
        }
        StringBuilder out = new StringBuilder() ;
        while (!store.isEmpty()) {
            out.insert(0, store.pop());
        }
        return new String(out) ;


    }

}
