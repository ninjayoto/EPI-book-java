package com.ryangehring.epi.common;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by ryan on 8/22/17.
 */
public class BinarySearchTreeTest {
    @Test
    public void search() throws Exception {
        BinarySearchTree btree = new BinarySearchTree();
        btree.add(5) ;
        btree.add(3) ;
        btree.add(2) ;
        btree.add(4) ;
        btree.add(7) ;
        btree.add(8) ;
        assertNotNull(btree.search(5)) ;
        assertNotNull(btree.search(2)) ;
        assertNotNull(btree.search(4)) ;
        assertNotNull(btree.search(7)) ;
        assertNull(btree.search(9)) ;
        assertNull(btree.search(1)) ;
    }

    @Test
    public void delete() throws Exception {
        BinarySearchTree btree = new BinarySearchTree();
        btree.add(5) ;
        btree.add(3) ;
        btree.add(2) ;
        btree.add(4) ;
        btree.add(7) ;
        btree.add(8) ;
        btree.delete(3);
        assertNotNull(btree.search(2));
        assertNotNull(btree.search(4));

        btree.delete(5) ;
        assertNotNull(btree.search(2));
        assertNotNull(btree.search(4));
        assertNotNull(btree.search(7));
        assertNotNull(btree.search(8));

    }

}