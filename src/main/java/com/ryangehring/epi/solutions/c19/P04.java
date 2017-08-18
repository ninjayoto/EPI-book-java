package com.ryangehring.epi.solutions.c19;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by ryan on 8/17/17.
 */
public class P04 {

    List<Object> nodes ;

    class Node {
        public List<Node> links ;
        public Node() {
            links = new ArrayList<Node>();
        }

    }

    public P04() {
        nodes = new ArrayList() ;
    }

    public P04 clone(Node x) {
        P04 out = new P04() ;
        Map<Node, Node> store = new HashMap<Node, Node>();
        List<Node> toExplore = new ArrayList<Node>(x.links);
        Node curr = toExplore.remove(0) ;
        while (curr != null) {
            if (store.get(curr) != null) {
                if (toExplore.isEmpty()) break;
                curr = toExplore.remove(0);
                continue;
            }
            Node cloneN = new Node();
            store.put(curr, cloneN) ;
            for (Node cn : curr.links) {
                toExplore.add(cn);
            }
            if (toExplore.isEmpty()) break;
            curr = toExplore.remove(0);
        }
        for (Node node : store.keySet()) {
            Node clone = store.get(node) ;
            for (Node n : node.links) {
                clone.links.add(store.get(n)) ;
            }
        }
        for (Node n : store.values()) {
            out.nodes.add(n);
        }
        return out ;
    }


}
