package com.ryangehring.epi.solutions.c15;

import com.ryangehring.epi.common.BinaryTree;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * Created by ryan on 8/16/17.
 */
public class P05Test {
    @Test
    public void findLCA() throws Exception {
        BinaryTree btree = new BinaryTree() ;
        btree.root = btree.new Node(5) ;
        btree.root.left = btree.new Node(3) ;
        btree.root.left.right = btree.new Node(4) ;
        btree.root.left.left = btree.new Node(2) ;

        Integer out = P05.findLCA(btree, btree.root.left.left, btree.root.left.right) ;
        assertEquals((Integer) 3, out);

    }

}