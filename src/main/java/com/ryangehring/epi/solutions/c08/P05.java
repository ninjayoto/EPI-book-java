package com.ryangehring.epi.solutions.c08;

import com.ryangehring.epi.common.SinglyLinkedList;

/**
 * Created by ryan on 8/6/17.
 */
public class P05 {

    public static SinglyLinkedList.Link cycleDetector(SinglyLinkedList l) {

        SinglyLinkedList.Link slow = l.getRoot() ;
        SinglyLinkedList.Link fast = l.getRoot() ;

        while (true) {
            slow = slow.getNext() ;
            fast = fast.getNext() ;
            if (fast== null) return null ;
            fast = fast.getNext() ;
            if (fast== null) return null ;
            if (fast == slow) return fast ;
        }

    }

}
