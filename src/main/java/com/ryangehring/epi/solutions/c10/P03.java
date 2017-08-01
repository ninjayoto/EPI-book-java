package com.ryangehring.epi.solutions.c10;

import com.ryangehring.epi.common.BinaryTree;
import com.sun.org.apache.xpath.internal.operations.Bool;

/**
 * This is a traversal problem; takes two nodes at a time that are mirror images.
 * Recurrence relation:
 *  Given two nodes, sym(a, b):
 *    (a left) sym a(right)
 *    (a right) sym b(left)
 *    if both the above are true,
 *      if a payload = b payload, return true
 *      else return false
 */
public class P03 {

    public static Boolean symmetricTraversal(BinaryTree.Node x, BinaryTree.Node y) {
        if (x == null && y==null) return true ;
        else if (x==null) return false ;
        else if (y==null) return false ;
        Boolean leftSymmetric = symmetricTraversal(x.left, y.right) ;
        Boolean rightSymmetric = symmetricTraversal(x.right, y.left) ;
        if (leftSymmetric && rightSymmetric) {
            if (x.payload == y.payload) return true ;
        }
        return false ;
    }

    public static Boolean isSymmetric(BinaryTree btree) {
        if (btree.root==null) return true ;

        return symmetricTraversal(btree.root.left, btree.root.right) ;
    }
}
