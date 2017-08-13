package com.ryangehring.epi.solutions.c08;

import com.ryangehring.epi.common.SinglyLinkedList;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by ryan on 8/6/17.
 */
public class P05Test {
    @Test
    public void cycleDetector() throws Exception {
        SinglyLinkedList ll = new SinglyLinkedList() ;
        ll.addLink( 1);
        ll.addLink( 2);
        ll.addLink( 3);
        ll.addLink( 4);
        SinglyLinkedList.Link out = P05.cycleDetector(ll) ;

        assertTrue(out == null);

        SinglyLinkedList.Link start = ll.getRoot().getNext().getNext() ;
        start.setNext(ll.getRoot().getNext());
        out = P05.cycleDetector(ll) ;
        assertEquals(out, start);

    }

}