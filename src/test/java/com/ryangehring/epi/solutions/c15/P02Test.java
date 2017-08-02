package com.ryangehring.epi.solutions.c15;

import com.ryangehring.epi.common.BinaryTree;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by ryan on 8/2/17.
 */
public class P02Test {
    @Test
    public void recursiveFind() throws Exception {
        BinaryTree btree = new BinaryTree() ;
        btree.root = btree.new Node(5) ;
        btree.root.left = btree.new Node(3) ;
        btree.root.left.right = btree.new Node(4) ;
        btree.root.left.left = btree.new Node(4) ;
        BinaryTree.Node out = P02.recursiveFind(btree.root, 4) ;
        assertEquals(btree.root.left.left , out);
    }

    @Test
    public void iterativeFind() throws Exception {
        BinaryTree btree = new BinaryTree() ;
        btree.root = btree.new Node(5) ;
        btree.root.left = btree.new Node(3) ;
        btree.root.left.right = btree.new Node(4) ;
        btree.root.left.left = btree.new Node(4) ;
        BinaryTree.Node out = P02.iterativeFind(btree.root, 4) ;
        assertEquals(btree.root.left.left , out);

    }

}