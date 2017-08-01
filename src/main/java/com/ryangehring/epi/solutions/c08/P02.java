package com.ryangehring.epi.solutions.c08;

import com.ryangehring.epi.common.SinglyLinkedList;

/**
 * Reverse a list. Technique : Keep one lagging pointer and one leading.
 * Set next of the current node to the lagging pointer.
 * Set current node to be leading pointer. Repeat.
 */
public class P02 {

    public static void reverseList(SinglyLinkedList x) {
        SinglyLinkedList.Link curr = x.getRoot() ;
        SinglyLinkedList.Link next = x.getRoot().getNext() ;
        SinglyLinkedList.Link prev = null ;
        while (curr != null) {
            curr.setNext(prev);
            prev = curr ;
            curr = next ;
            if (curr == null) {
                x.setRoot( prev) ;
            } else {
                next = next.getNext();
            }
        }
    }

}
