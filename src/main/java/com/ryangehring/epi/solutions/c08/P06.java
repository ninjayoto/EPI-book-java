package com.ryangehring.epi.solutions.c08;

import com.ryangehring.epi.common.SinglyLinkedList;

/**
 * Detecting overlap
 *
 * 1) Determine if they have the same tail node, and get lengths
 * 2) Iterate the longer list by the difference in lengths. (if
 * there is overlap of size k, you want to test that the size-kth element is the same.
 * You need to iterate from the end.
 *
 * 3) Iterate and return the index.
 *
 *
 *
 *
 */
public class P06 {

    public static Integer isOverlap(SinglyLinkedList a, SinglyLinkedList b) {

        int lenA = 1 ;
        int lenB = 1 ;
        SinglyLinkedList.Link tailA = a.getRoot() ;
        SinglyLinkedList.Link tailB = b.getRoot() ;
        while (true) {
            if (tailA.getNext() != null) {
                tailA = tailA.getNext();
                lenA++;
            } else {break ;}
        }
        while (true) {
            if (tailB.getNext() != null) {
                tailB = tailB.getNext();
                lenB++ ;
            } else {break ;}
        }
        if (tailA != tailB) return null ;
        if (lenA > lenB) {
            tailA = a.getRoot();
            tailB = b.getRoot();
        } else {
            tailA = b.getRoot();
            tailB = a.getRoot();
        }
        int idx = 0 ;
        for (int i=0; i< lenA-lenB ; i++) {
            tailA = tailA.getNext() ;
        }
        while (true) {
            if (tailA == tailB) return idx;
            idx ++;
            tailA = tailA.getNext() ;
            tailB = tailB.getNext() ;
        }

    }

}
