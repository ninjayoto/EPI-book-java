package com.ryangehring.epi.common;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by ryan on 8/22/17.
 */
public class TrieTest {
    @Test
    public void searchNode() throws Exception {

        Trie t = new Trie() ;
        t.add("hello");
        t.add("hey");
        t.add("hio");

        assertNotNull(t.searchNode("hello"));
        assertNotNull(t.searchNode("hey"));
        assertNotNull(t.searchNode("h"));
        assertNotNull(t.searchNode("he"));
        assertNull(t.searchNode("a"));
        assertNull(t.searchNode("b"));
        assertNull(t.searchNode("haha"));

    }

}