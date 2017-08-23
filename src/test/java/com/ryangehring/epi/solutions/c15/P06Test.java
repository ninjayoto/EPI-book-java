package com.ryangehring.epi.solutions.c15;

import com.ryangehring.epi.common.BinaryTree;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by ryan on 8/18/17.
 */
public class P06Test {
    @Test
    public void treeFromTraversal() throws Exception {

        Integer[] traversalData = {5,2,3,6};
        BinaryTree out = P06.treeFromTraversal(traversalData);
        assertEquals((Integer) 5 , (Integer) out.root.payload);
        assertEquals((Integer) 2 , (Integer) out.root.left.payload);
        assertEquals((Integer) 3 , (Integer) out.root.left.right.payload);
        assertEquals((Integer) 6 , (Integer) out.root.right.payload);


    }

}