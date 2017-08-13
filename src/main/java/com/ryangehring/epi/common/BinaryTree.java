package com.ryangehring.epi.common;

/**
 * Created by ryan on 7/31/17.
 */
public class BinaryTree {
    public Node root ;
    public BinaryTree() {
       this.root = null ;
    }


    public class Node {
        public Object payload ;
        public Node left ;
        public Node right ;
        public Node parent ;
        public Node(Object payload) {
            this.payload = payload ;
            this.left = null ;
            this.right = null ;
        }

    }

}
