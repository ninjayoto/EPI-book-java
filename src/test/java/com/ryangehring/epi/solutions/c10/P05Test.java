package com.ryangehring.epi.solutions.c10;

import com.ryangehring.epi.common.BinaryTree;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by ryan on 8/8/17.
 */
public class P05Test {
    @Test
    public void lcaWithParent() throws Exception {

        BinaryTree btree = new BinaryTree() ;
        btree.root = btree.new Node(1) ;
        btree.root.left = btree.new Node(2) ;
        btree.root.left.parent = btree.root ;
        btree.root.right = btree.new Node(3) ;
        btree.root.right.parent = btree.root ;
        btree.root.left.left = btree.new Node(4) ;
        btree.root.left.left.parent = btree.root.left ;
        btree.root.right.right = btree.new Node(5) ;
        btree.root.right.right.parent = btree.root.right ;

        assertEquals(btree.root.left, P05.lcaWithParent(btree.root.left, btree.root.left.left));
        assertEquals(btree.root, P05.lcaWithParent(btree.root.left, btree.root.right.right));
    }

}