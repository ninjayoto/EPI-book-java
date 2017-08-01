package com.ryangehring.epi.solutions.c10;

import com.ryangehring.epi.common.BinaryTree;
import com.sun.org.apache.xpath.internal.operations.Bool;

/**
 * k - balanced btree
 */
public class P02 {

    private static int getHeight(BinaryTree.Node x) {
        if (x==null) return -1 ;
        int leftHeight = getHeight(x.left) ;
        int rightHeight = getHeight(x.right) ;
        if (leftHeight > rightHeight) {
            return 1+leftHeight ;
        } else {
            return 1+rightHeight ;
        }
    }

    public static Boolean nodeIsBalanced(BinaryTree.Node x, int k) {
        int diff = getHeight(x.left) - getHeight(x.right) ;
        if ( (diff < -k )|| (diff > k) ) {
            return false ;
        }
        return true ;
    }

    public static Boolean checkAllChildNodes(BinaryTree.Node x, int k) {
        if (x==null) return true ;
        Boolean leftIsBalanced = checkAllChildNodes(x.left, k) ;
        Boolean rightIsBalanced = checkAllChildNodes(x.right, k) ;
        if (nodeIsBalanced(x, k)) {
                return true ;
        } else {
            return false ;
        }
    }

    public static BinaryTree.Node searchForFirstUnbalanced(BinaryTree.Node x, int k) {
        if (x==null) {return null;}
        BinaryTree.Node leftImba = searchForFirstUnbalanced(x.left, k) ;
        if (leftImba != null) return leftImba ;
        BinaryTree.Node rightImba = searchForFirstUnbalanced(x.right, k) ;
        if (rightImba != null) return rightImba ;
        Boolean left = checkAllChildNodes(x.left, k) ;
        Boolean right = checkAllChildNodes(x.right, k) ;
        Boolean curr = checkAllChildNodes(x, k) ;
        if (left && right && !curr) return x ;
        return null ;
    }

    public static BinaryTree.Node getKUnbalancedNode(BinaryTree b, int k) {
        if (b.root == null) return null ;
        // now visit every node in the tree
        return searchForFirstUnbalanced(b.root, k) ;

    }
}
