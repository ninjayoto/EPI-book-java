package com.ryangehring.epi.solutions.c09;

import com.ryangehring.epi.common.BinaryTree;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * Created by ryan on 8/6/17.
 */
public class P06Test {
    @Test
    public void printBST() throws Exception {

        BinaryTree btree = new BinaryTree() ;
        btree.root = btree.new Node(6) ;
        btree.root.left = btree.new Node(3) ;
        btree.root.left.left = btree.new Node(1) ;
        btree.root.left.right = btree.new Node(4) ;
        btree.root.right = btree.new Node(8) ;
        btree.root.right.left = btree.new Node(7) ;
        btree.root.right.right = btree.new Node(9) ;

        Integer[] expected = {1,3,4,6,7,8,9};
        Object[] out = P06.printBST(btree.root).toArray()  ;
        assertTrue(Arrays.deepEquals(expected, out) )  ;

    }

}