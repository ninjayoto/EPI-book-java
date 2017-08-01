package com.ryangehring.epi.solutions.c10;

import com.ryangehring.epi.common.BinaryTree;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by ryan on 7/31/17.
 */
public class P02Test {
    @Test
    public void getKUnbalancedNode() throws Exception {
        BinaryTree btree = new BinaryTree() ;
        btree.root = btree.new Node(1) ;
        btree.root.left = btree.new Node(1) ;
        btree.root.right = btree.new Node(1) ;
        btree.root.left.left = btree.new Node(1) ;
        BinaryTree.Node out = P02.getKUnbalancedNode(btree, 1) ;
        assertTrue(out==null);

        BinaryTree btree2 = new BinaryTree() ;
        btree2.root = btree2.new Node(1) ;
        btree2.root.left = btree2.new Node(1) ;
        btree2.root.left.right = btree2.new Node(1) ;
        btree2.root.left.left = btree2.new Node(1) ;
        BinaryTree.Node out2 = P02.getKUnbalancedNode(btree2, 1) ;
        assertTrue(out2 == btree2.root );

    }

}