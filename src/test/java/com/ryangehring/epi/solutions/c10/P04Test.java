package com.ryangehring.epi.solutions.c10;

import com.ryangehring.epi.common.BinaryTree;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by ryan on 8/8/17.
 */
public class P04Test {
    @Test
    public void lca() throws Exception {
        BinaryTree btree = new BinaryTree() ;
        btree.root = btree.new Node(1) ;
        btree.root.left = btree.new Node(2) ;
        btree.root.right = btree.new Node(3) ;
        btree.root.left.left = btree.new Node(4) ;
        btree.root.right.right = btree.new Node(5) ;
        assertEquals( btree.root.left , P04.lca(btree.root.left.left, btree.root.left, btree  ));

        assertEquals( btree.root , P04.lca(btree.root.left.left, btree.root.right, btree  ));

    }

}