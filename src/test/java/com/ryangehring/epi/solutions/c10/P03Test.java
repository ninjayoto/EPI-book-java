package com.ryangehring.epi.solutions.c10;

import com.ryangehring.epi.common.BinaryTree;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by ryan on 8/1/17.
 */
public class P03Test {
    @Test
    public void isSymmetric() throws Exception {
        BinaryTree btree = new BinaryTree() ;
        btree.root = btree.new Node(1) ;
        btree.root.left = btree.new Node(1) ;
        btree.root.right = btree.new Node(1) ;
        btree.root.left.left = btree.new Node(1) ;
        btree.root.right.right = btree.new Node(1) ;
        assertTrue(P03.isSymmetric(btree) );

        btree.root.right.left = btree.new Node(1);
        assertFalse(P03.isSymmetric(btree) );

        btree.root.left.right = btree.new Node(1);
        assertTrue(P03.isSymmetric(btree) );

        btree.root.left.right.payload = 2 ;
        assertFalse(P03.isSymmetric(btree) );
    }

}