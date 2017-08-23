package com.ryangehring.epi.common;

/**
 * Created by ryan on 8/22/17.
 */
public class BinarySearchTree {

    public Node root ;
    public BinarySearchTree() {

    }

    public void add(Comparable p) {
        // handle special case where there is no root
        if (root == null) {
            root = new Node(p) ;
            return ;
        }
        Node curr = root ;
        while (true ) {
            if (curr.payload.compareTo(p) > 0) {
                if (curr.left == null) {
                    curr.left = new Node(p) ;
                    return ;
                }  else {
                    curr = curr.left ;
                }
            } else {
                if (curr.right == null) {
                    curr.right = new Node(p);
                    return;
                } else {
                    curr = curr.right ;
                }
            }
        }
    }

    public Node search(Comparable p) {
        Node curr = root ;
        while (curr != null) {
            if (curr.payload.compareTo(p) == 0 ) return curr ;
            if (curr.payload.compareTo(p) > 0 ) {
                curr = curr.left;
                continue ;
            }
            if (curr.payload.compareTo(p) < 0 ) curr = curr.right ;
        }
        return null ;
    }

    public Node[] searchWithParent(Comparable p) {
        Node parent = null ;
        Node curr = root ;

        while (curr != null) {
            if (curr.payload.compareTo(p) == 0 ) return new Node[] {parent, curr} ;
            parent = curr ;
            if (curr.payload.compareTo(p) > 0 ) {
                curr = curr.left;
                continue ;
            }
            if (curr.payload.compareTo(p) < 0 ) curr = curr.right ;
        }

        return null ;
    }



    public void delete(Comparable p) {
        Node[] parentAndFound = searchWithParent(p ) ;
        if (parentAndFound==null) return ;
        Node parent = parentAndFound[0];
        Node toDelete = parentAndFound[1] ;
        if ((toDelete.left == null) && (toDelete.right == null)) {
            if (parent == null) {
                root = null ;
            } else if (parent.left == toDelete ) {
                parent.left = null ;
            } else if (parent.right == toDelete) {
                parent.right = null ;
            }
            return ;
        }
        if ((toDelete.left == null)&& (toDelete.right != null)) {
            if (parent==null) {
                root = toDelete.right ;
            } else {
                if (toDelete == parent.left) {
                    parent.left = toDelete.right ;
                } else {
                    parent.right = toDelete.right;
                }
            }
            return;
        } else if ((toDelete.right == null)&& (toDelete.left != null)) {
            if (parent==null) {
                root = toDelete.left ;
            } else {
                if (toDelete == parent.left) {
                    parent.left = toDelete.left ;
                } else {
                    parent.right = toDelete.left;
                }
            }
            return ;
        } else {
            Node successorParent = null ;
            Node successor = toDelete.right ;
            while (successor.left != null) {
                successorParent = successor ;
                successor = successor.left ;
            }
            if (parent == null) {
                root = successor;
            } else if (parent.left==toDelete) {
                parent.left = successor ;
            } else {
                parent.right = successor ;
            }

            successor.left = toDelete.left ;
            if (successorParent != null) {
                successor.right = toDelete.right;
            }

            return;
        }
    }


    class Node {
        Comparable payload ;
        public Node left ;
        public Node right ;
        public Node(Comparable payload) {
            this.payload = payload ;
        }
    }

}
