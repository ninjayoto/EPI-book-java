package com.ryangehring.epi.solutions.c15;

import com.ryangehring.epi.common.BinaryTree;
import com.ryangehring.epi.solutions.c10.*;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by ryan on 8/2/17.
 */
public class P01Test {
    @Test
    public void isBST() throws Exception {
        BinaryTree btree2 = new BinaryTree() ;
        btree2.root = btree2.new Node(5) ;
        btree2.root.left = btree2.new Node(3) ;
        btree2.root.left.right = btree2.new Node(4) ;
        btree2.root.left.left = btree2.new Node(2) ;
        Boolean out2 = P01.isBST(btree2) ;
        assertTrue(out2);

        BinaryTree btree = new BinaryTree() ;
        btree.root = btree.new Node(5) ;
        btree.root.left = btree.new Node(3) ;
        btree.root.left.right = btree.new Node(4) ;
        btree.root.left.left = btree.new Node(4) ;
        Boolean out = P01.isBST(btree) ;
        assertFalse(out);

    }

}