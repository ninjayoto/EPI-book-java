package com.ryangehring.epi.solutions.c15;

import com.ryangehring.epi.common.BinaryTree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;
import java.util.function.Predicate;

/**
 * Which traversals can reconstruct a bst uniquely?
 *
 *
 * preorder -----
 *   this actually reconstruct the tree---- notice the recursion
 *   implied by root - left - right
 *   left is the preorder traversal of the left tree, right is of right
 *   so you yield the root, then proceed to the nodes immediately underneath.
 *
 *  what about ----
 *                1
 *              2    3
 *
 *  OR
 *               1
 *             2
 *           3
 *
 *  this implies 3 > 1 AND 3 < 1 which is impossible in a bst
 *
 */
public class P06 {

    public static BinaryTree treeFromTraversal(Integer[] nodeData) {
        BinaryTree btree = new BinaryTree() ;
        btree.root = btree.new Node(nodeData[0]);
        List<BinaryTree.Node> store = new ArrayList<>();
        store.add(btree.root);
        for (int idx=1 ; idx< nodeData.length; idx++) {
            Integer i = nodeData[idx] ;
            BinaryTree.Node curr = store.get(store.size() - 1);
            System.out.println((Integer) curr.payload) ;
            System.out.println(Arrays.toString(store.toArray())) ;

            if (i <= (Integer) curr.payload) {
                curr.left = btree.new Node(i) ;
                store.add(curr.left) ;
            } else {
                // find the greatest element in the list that i is still greater than, that is the parent.
                int rmIdx = 0 ;
                for (int k=0; k < store.size(); k++) {
                    if ( ( (Integer) store.get(k).payload < i ) && ( (Integer) curr.payload < (Integer) store.get(k).payload ) ) {
                        curr = store.get(k) ;
                        rmIdx = k ;
                    }
                }
                for (int k=rmIdx+1; k<store.size(); k++ ) {
                    store.remove(rmIdx+1);
                }

                curr.right = btree.new Node(i) ;
                store.add(curr.right) ;
            }
        }
        return btree;
    }


}
