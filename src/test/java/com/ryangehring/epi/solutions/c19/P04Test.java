package com.ryangehring.epi.solutions.c19;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

/**
 * Created by ryan on 8/17/17.
 */
public class P04Test {
    @Test
    public void testclone() throws Exception {

        P04 p = new P04() ;
        P04.Node n1 = p.new Node() ;
        P04.Node n2 = p.new Node() ;
        P04.Node n3 = p.new Node() ;
        P04.Node n4 = p.new Node() ;

        n1.links.add(n2);
        n2.links.add(n1);
        n2.links.add(n3);


        P04 out = p.clone(n1);
        assertEquals(3, out.nodes.size());

    }

}