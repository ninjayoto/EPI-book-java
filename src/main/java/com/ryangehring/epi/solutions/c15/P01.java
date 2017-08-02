package com.ryangehring.epi.solutions.c15;

import com.ryangehring.epi.common.BinaryTree;

/**
 * Created by ryan on 8/2/17.
 */
public class P01 {

    public static Boolean isNodeBSTRecursive(BinaryTree.Node x) {
        if (x==null) return true ;
        if (x.left != null) {
            if ( (Integer) x.payload < (Integer) x.left.payload) return false ;
        }
        if (x.right != null) {
            if ( (Integer) x.payload > (Integer) x.right.payload) return false ;
        }
        boolean isLeft = isNodeBSTRecursive(x.left) ;
        boolean isRight = isNodeBSTRecursive(x.right) ;
        if (isLeft && isRight) return true ;
        return false ;
    }

    public static Boolean isBST(BinaryTree btree ) {
        return isNodeBSTRecursive(btree.root) ;
    }

}
