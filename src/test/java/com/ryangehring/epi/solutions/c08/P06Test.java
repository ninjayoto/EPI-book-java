package com.ryangehring.epi.solutions.c08;

import com.ryangehring.epi.common.SinglyLinkedList;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by ryan on 8/6/17.
 */
public class P06Test {
    @Test
    public void isOverlap() throws Exception {
        SinglyLinkedList ll = new SinglyLinkedList() ;
        ll.addLink( 1);
        ll.addLink( 2);
        ll.addLink( 3);
        ll.addLink( 4);

        SinglyLinkedList ll2 = new SinglyLinkedList() ;
        ll2.addLink( 1);
        ll2.addLink( 2);
        ll2.addLink( 3);
        ll2.addLink( 4);


        ll2.getRoot().getNext().setNext(ll.getRoot().getNext().getNext());

        assertEquals((Integer) 2, P06.isOverlap(ll, ll2));

    }

}