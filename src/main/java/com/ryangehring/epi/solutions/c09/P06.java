package com.ryangehring.epi.solutions.c09;

import com.ryangehring.epi.common.BinaryTree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Given a BST node, we will iteratively traverse 'inorder'
 * Since all elements in a BST's left subtree must be <=
 * all elements in the right subtree, an 'inorder'
 * tranversal is appropriate --- visit all left.
 * then yield current. then visit all right.
 * A stack can be used in this case to hold the unvisited nodes above.
 *
 */
public class P06 {

    public static List<Integer> printBST(BinaryTree.Node start) {
        List<Integer> out = new ArrayList<Integer>();
        Stack<BinaryTree.Node> store = new Stack<BinaryTree.Node>() ;
        BinaryTree.Node curr = start ;

        while (!store.isEmpty() || (curr != null)) {
            if (curr != null) {
                store.push(curr) ;
                curr = curr.left;
            } else {
                curr = store.pop() ;
                out.add((Integer) curr.payload) ;

                if (curr.right != null) {
                    curr = curr.right;
                } else {
                    curr = null ;
                }

            }
        }
        return out ;

    }


}
