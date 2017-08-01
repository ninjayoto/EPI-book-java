package com.ryangehring.epi.solutions.c08;

import com.ryangehring.epi.common.SinglyLinkedList;

/**
 * Merge two single linked lists
 */
public class P01 {

    public static SinglyLinkedList mergeTwoSinglyLinkedLists(SinglyLinkedList a, SinglyLinkedList b) {
        SinglyLinkedList.Link a_curr = a.getRoot() ;
        SinglyLinkedList.Link b_curr = b.getRoot() ;
        if (a_curr == null) return b ;
        if (b_curr == null) return a ;
        if ( (Integer) a_curr.payload > (Integer) b_curr.payload) {
            SinglyLinkedList temp = b ;
            b = a ;
            a = temp ;
        }
        a_curr = a.getRoot() ;
        b_curr = b.getRoot() ;
        SinglyLinkedList.Link curr = a_curr ;
        a_curr = a_curr.getNext() ;
        while (true) {
            if (a_curr == null) {
                curr.setNext(b_curr);
                break ;
            }
            if (b_curr == null) {
                curr.setNext(a_curr);
                break;
            }
            if ((Integer) a_curr.payload < (Integer) b_curr.payload) {
                curr.setNext(a_curr);
                curr = a_curr ;
                a_curr = a_curr.getNext();
            } else {
                curr.setNext(b_curr);
                curr = b_curr ;
                b_curr = b_curr.getNext();
            }
        }

        return a ;
    }

}
