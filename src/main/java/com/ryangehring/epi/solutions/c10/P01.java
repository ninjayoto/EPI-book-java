package com.ryangehring.epi.solutions.c10;

import com.ryangehring.epi.common.BinaryTree;

/**
 * Created by ryan on 7/31/17.
 */
public class P01 {

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

    public static Boolean nodeIsBalanced(BinaryTree.Node x) {
        int diff = getHeight(x.left) - getHeight(x.right) ;
        if ( (diff < -1 )|| (diff > 1) ) {
            return false ;
        }
        return true ;
    }

    public static Boolean checkAllChildNodes(BinaryTree.Node x) {
        if (x==null) return true ;
        Boolean leftIsBalanced = checkAllChildNodes(x.left) ;
        Boolean rightIsBalanced = checkAllChildNodes(x.right) ;
        if (leftIsBalanced && rightIsBalanced) {
            return nodeIsBalanced(x);
        } else {
            return false ;
        }
    }

    public static Boolean isBalanced(BinaryTree b) {
        if (b.root == null) return true ;
        // now visit every node in the tree
        return checkAllChildNodes(b.root) ;

    }
}
