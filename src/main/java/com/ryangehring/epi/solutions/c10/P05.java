package com.ryangehring.epi.solutions.c10;

import com.ryangehring.epi.common.BinaryTree;

/**
 * Find the LCA when the tree has a parent pointer.
 * Visit each node only once and use constant space.
 *
 * My solution below is recursive and uses O(nlogn ? ) space because
 * of the call stack... for every parent O(log(n))
 * it searches all the unsearched children. O(n/2/2)
 * Even though these could happen in sequence, i didnt
 * do a great job constraining that.
 *
 * Initialize 'curr' to a.
 * Visit all children of a. if b is one of them, return a.
 * Otherwise, return f(a's parent)---but only visit the side that isn't a.
 * Let's again use the return values to encode search strategies.
 * if (a) then the subtree contains only a.
 *
 */
public class P05 {


    private static BinaryTree.Node searchDown(BinaryTree.Node a , BinaryTree.Node b, BinaryTree.Node curr) {
        if (curr == null) return a;
        if (curr == b) return curr ;
        BinaryTree.Node left = searchDown(a,b,curr.left) ;
        if  ( (left != null) && (left != a) ) {
            return left ;
        }
        BinaryTree.Node right = searchDown(a,b,curr.right) ;
        if (((right != null) && (right!=a))) {
            return right ;
        }
        return a ;
    }

    private static BinaryTree.Node lcaRecursive( BinaryTree.Node a , BinaryTree.Node b, BinaryTree.Node curr, BinaryTree.Node left, BinaryTree.Node right) {
        if (curr == null) return a;
        if (curr == b) return curr ;
        if (left == null) {
            left = searchDown(a,b,curr.left);
        }
        if (right == null) {
            right = searchDown(a,b,curr.right);
        }
        if  ( (left != null) && (left != a) ) {
            return curr ;
        } else if (((right != null) && (right!=a))) {
            return curr ;
        }

        BinaryTree.Node parent = curr.parent ;

        if (curr == parent.left) return lcaRecursive( a, b,  parent, a, null ) ;
        return lcaRecursive( a, b,  parent, null, a ) ;

    }

    public static BinaryTree.Node lcaWithParent(BinaryTree.Node a, BinaryTree.Node b ) {
        return lcaRecursive(a, b,a, null, null);
    }

}
