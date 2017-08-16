package com.ryangehring.epi.solutions.c15;

import com.ryangehring.epi.common.BinaryTree;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by ryan on 8/14/17.
 */
public class P03Test {
    @Test
    public void firstValueGreaterThanK() throws Exception {
        BinaryTree btree = new BinaryTree() ;
        btree.root = btree.new Node(5) ;
        btree.root.left = btree.new Node(3) ;
        btree.root.left.right = btree.new Node(4) ;
        btree.root.left.left = btree.new Node(2) ;
        Integer out = P03.firstValueGreaterThanK(btree, 2) ;
        assertEquals((Integer) 3,out);
    }

}