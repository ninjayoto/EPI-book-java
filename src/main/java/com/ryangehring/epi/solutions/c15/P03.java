package com.ryangehring.epi.solutions.c15;

import com.ryangehring.epi.common.BinaryTree;

/**
 * First node valued greater than k in a BST
 *
 * Do an inorder traversal
 * --- left, curr, right
 * If curr > k return curr
 * Else return null
 *
 */
public class P03 {

    public static Integer fvRecur(BinaryTree.Node x, Integer k) {
        if (x==null) return null ;
        Integer left = fvRecur(x.left, k) ;
        if (left != null) return  left;
        Integer curr = (Integer) x.payload ;
        if (curr > k ) return curr;
        Integer right = fvRecur(x.right, k) ;
        if (right != null) return  right ;
        return null ;

    }

    public static Integer firstValueGreaterThanK(BinaryTree btree , Integer k) {
        return fvRecur(btree.root, k) ;
    }

}
