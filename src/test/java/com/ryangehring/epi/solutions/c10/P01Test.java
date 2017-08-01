package com.ryangehring.epi.solutions.c10;

import com.ryangehring.epi.common.BinaryTree;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by ryan on 7/31/17.
 */
public class P01Test {
    @Test
    public void isBalanced() throws Exception {
        BinaryTree btree = new BinaryTree() ;
        btree.root = btree.new Node(1) ;
        btree.root.left = btree.new Node(1) ;
        btree.root.right = btree.new Node(1) ;
        btree.root.left.left = btree.new Node(1) ;
        Boolean out = P01.isBalanced(btree) ;
        assertTrue(out);


        BinaryTree btree2 = new BinaryTree() ;
        btree2.root = btree2.new Node(1) ;
        btree2.root.left = btree2.new Node(1) ;
        btree2.root.left.right = btree2.new Node(1) ;
        btree2.root.left.left = btree2.new Node(1) ;
        Boolean out2 = P01.isBalanced(btree2) ;
        assertFalse(out2);

    }

}