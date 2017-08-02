package com.ryangehring.epi.solutions.c15;

import com.ryangehring.epi.common.BinaryTree;

import java.util.Stack;

/**
 * Created by ryan on 8/2/17.
 */
public class P02 {

    public static BinaryTree.Node recursiveFind(BinaryTree.Node x, Integer k) {
        if (x==null) return null ;
        BinaryTree.Node leftFound = recursiveFind(x.left, k) ;
        if (leftFound != null) return leftFound ;
        if ( ((Integer) x.payload).equals(k)) return x ;
        BinaryTree.Node rightFound = recursiveFind(x.right, k) ;
        if (rightFound != null) return rightFound ;
        return null ;
    }

    public static BinaryTree.Node iterativeFind(BinaryTree.Node x, Integer k) {
        Stack<BinaryTree.Node> stack = new Stack<BinaryTree.Node>() ;
        BinaryTree.Node curr ;
        stack.push(x) ;
        while (!stack.isEmpty()) {
            curr = stack.pop() ;
            stack.push(curr) ;
            if (curr.left != null) {
                stack.push(curr.left) ;
                continue ;
            }
            curr = stack.pop() ;
            if ( ((Integer) curr.payload).equals(k) ) return curr ;
            if (curr.right != null) {
                stack.push(curr.right) ;
                continue ;
            }
        }
        return null ;
    }


}
