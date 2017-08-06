package com.ryangehring.epi.solutions.c08;

import com.ryangehring.epi.common.SinglyLinkedList;

import java.util.Arrays;

/**
 * Created by ryan on 8/5/17.
 */
public class P04 {


    public static Boolean isKNodesLeft(SinglyLinkedList.Link l, int k) {
        if (l == null) return false ;
        SinglyLinkedList.Link test = l ;
        for (int i=0; i<k-1; i++) {
            test=test.getNext() ;
            if (test==null) return false ;
        }
        return true ;

    }

    public static void reverseKAtATime(SinglyLinkedList l, int k) {
        SinglyLinkedList.Link trail = null;
        SinglyLinkedList.Link curr = l.getRoot() ;
        SinglyLinkedList.Link next = l.getRoot().getNext() ;
        SinglyLinkedList.Link trailingSubsetEnd = null ;
        SinglyLinkedList.Link subsetEnd = null ;

        int totalIters = 0 ;
        int idx = 0 ;
        while (curr != null ) {

            if ((idx % k) == 0) {
                totalIters++ ;
                trailingSubsetEnd = subsetEnd ;
                subsetEnd = curr ;
                if (!(isKNodesLeft(curr, k))) break ;
                curr.setNext(null );

            }
            if (idx %k == k-1) {
                if (totalIters == 1) {
                    l.setRoot(curr);
                }
                if (trailingSubsetEnd != null) {
                    trailingSubsetEnd.setNext(curr);
                }

            }

            if (curr == null) break ;
            if (idx % k != 0) {
                curr.setNext(trail);
            }

            trail = curr ;
            curr = next ;
            if (next != null) {
                next = next.getNext();
            }
            idx++ ;
        }
        System.out.println(Arrays.toString(l.toArray() )) ;
        System.out.println("done!") ;
    }

}
