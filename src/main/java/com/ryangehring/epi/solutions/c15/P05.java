package com.ryangehring.epi.solutions.c15;

import com.ryangehring.epi.common.BinaryTree;

/**
 *
 * Find the root.
 * If a and b less than root, go left. If both greater go right. Else return as LCA.
 *
 */
public class P05 {

    public static Integer findLCA(BinaryTree btree, BinaryTree.Node a, BinaryTree.Node b) {
        BinaryTree.Node curr = btree.root ;
        while (curr != null) {
            if (((Integer) a.payload < (Integer) curr.payload) && ((Integer) b.payload < (Integer) curr.payload)){
                curr = curr.left ;
                continue;
            }
            if (((Integer) a.payload > (Integer) curr.payload) && ((Integer) b.payload > (Integer) curr.payload)){
                curr = curr.right ;
                continue;
            }

            return (Integer) curr.payload ;
        }
        return null ;
    }

}
