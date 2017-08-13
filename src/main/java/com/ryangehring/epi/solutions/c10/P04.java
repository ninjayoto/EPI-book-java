package com.ryangehring.epi.solutions.c10;

import com.ryangehring.epi.common.BinaryTree;

/**
 * I found this one hard. You need to be smart about picking
 * return values that convey enough information to solve the problem
 * if you want to solve efficiently. In this case, the function can
 * return a, b, the LCA, or null.
 * the main idea is, if left != right, return the current node (
 * and ensure you traverse from the bottom up, ie an INORDER traversal).
 *
 */
public class P04 {


    private static BinaryTree.Node recursiveLCA(BinaryTree.Node a, BinaryTree.Node b, BinaryTree.Node curr) {
        if (curr==null) return null ;
        System.out.println(curr.payload) ;
        BinaryTree.Node left = recursiveLCA(a,b, curr.left) ;
        if ((left != null) && (left != a) && (left != b)) { return left ;}


        BinaryTree.Node right = recursiveLCA(a,b, curr.right) ;
        if ((right != null) && (right != a) && (right != b)) { return right ;}

        if ((left == a) && (right == b)) {
            return curr ;
        } else if  ((curr == a) && ((left==b) || (right == b)) ) {
            return curr ;
        } else if  ((curr == b) && ((left==a) || (right == a)) ) {
            return curr ;
        }
        if ((curr == a) || (curr==b)) return curr ;
        if ((left == a) || (left==b)) return left ;
        if ((right == a) || (right==b)) return right ;


        return null ;



    }

    public static BinaryTree.Node lca(BinaryTree.Node a, BinaryTree.Node b, BinaryTree btree) {
        return recursiveLCA(a,b,btree.root) ;
    }

}
