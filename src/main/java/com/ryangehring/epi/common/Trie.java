package com.ryangehring.epi.common;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by ryan on 8/22/17.
 */
public class Trie {

    private Node root ;
    public Trie() {
        root = new Node('a');
    }

    public void add(String word) {
        Node curr = root ;
        for (char c: word.toCharArray()) {
            if (!curr.children.containsKey(c)) {
                curr.children.put(c, new Node(c));
            }
            curr = curr.children.get(c);
        }
    }

    public Node searchNode(String word) {
        Node curr = root ;
        for (char c : word.toCharArray()) {
            if (!curr.children.containsKey(c)) {
                return null ;
            }
            curr = curr.children.get(c);
        }
        return curr ;
    }


    public class Node {
        private char c ;
        private Map<Character, Node> children ;

        public Node(char c) {
            this.c=c;
            children = new HashMap<>();
        }


    }


}
