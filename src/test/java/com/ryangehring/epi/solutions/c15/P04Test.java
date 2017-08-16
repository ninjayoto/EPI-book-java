package com.ryangehring.epi.solutions.c15;

import com.ryangehring.epi.common.BinaryTree;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * Created by ryan on 8/14/17.
 */
public class P04Test {
    @Test
    public void kLargest() throws Exception {
        BinaryTree btree = new BinaryTree() ;
        btree.root = btree.new Node(5) ;
        btree.root.left = btree.new Node(3) ;
        btree.root.left.right = btree.new Node(4) ;
        btree.root.left.left = btree.new Node(2) ;
        Integer[] out = P04.kLargest(btree, 3);
        Integer[] expected = {5,4,3} ;
        System.out.println(Arrays.toString(out));
        assertTrue(Arrays.deepEquals(expected, out)) ;
    }

}