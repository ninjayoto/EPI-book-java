package com.ryangehring.epi.solutions.c15;

import com.ryangehring.epi.common.BinaryTree;

import java.util.Stack;

/**
 * Created by ryan on 8/14/17.
 */
public class P04 {


    public static Integer[] kLargest(BinaryTree btree, Integer k) {
        Integer[] out = new Integer[k] ;
        BinaryTree.Node curr = btree.root ;
        Stack searchStack = new Stack() ;
        searchStack.push(curr) ;

        int i=0 ;
        while ((i < k) ) {

            while (curr != null) {
                searchStack.push(curr) ;
                curr = curr.right ;
            }

            if (curr == null) {
                curr = (BinaryTree.Node) searchStack.pop();
                out[i] = (Integer) curr.payload;
                i++;
                if (curr.left == null) {
                    curr=null ;
                } else {
                    curr = curr.left;
                }
            }

        }

        return out ;
    }

}
