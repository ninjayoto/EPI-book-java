package com.ryangehring.epi.solutions.c08;

import com.ryangehring.epi.common.SinglyLinkedList;

/**
 * Created by ryan on 8/5/17.
 */
public class P03 {

    public static void reverseLLSubset(SinglyLinkedList l, int i, int j) {
        SinglyLinkedList.Link trail = null;
        SinglyLinkedList.Link curr = l.getRoot() ;
        SinglyLinkedList.Link next = l.getRoot().getNext() ;
        SinglyLinkedList.Link subsetStartLink = null ;
        SinglyLinkedList.Link lastLinkInSubset = null ;
        for (int k = 1; k<=j; k++) {
            if (k==i) {
                subsetStartLink = trail ;
                lastLinkInSubset = curr ;
            }
            if ((k>i) && (k <= j)) {
                curr.setNext(trail);
            }
            if (k==j) {
                subsetStartLink.setNext(curr );
                lastLinkInSubset.setNext(next);
            }

            trail = curr ;
            curr = next ;
            next = next.getNext();


        }
    }

}
