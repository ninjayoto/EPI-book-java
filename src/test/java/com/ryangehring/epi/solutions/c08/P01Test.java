package com.ryangehring.epi.solutions.c08;

import com.ryangehring.epi.common.SinglyLinkedList;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * Created by ryan on 7/31/17.
 */
public class P01Test {
    @Test
    public void mergeTwoSinglyLinkedLists() throws Exception {
        SinglyLinkedList a = new SinglyLinkedList() ;
        a.addLink(1);
        a.addLink(3);
        a.addLink(5);

        System.out.println(Arrays.toString(a.toArray())) ;
        SinglyLinkedList b = new SinglyLinkedList() ;
        b.addLink(2);
        b.addLink(4);
        System.out.println(Arrays.toString(b.toArray())) ;

        SinglyLinkedList out = P01.mergeTwoSinglyLinkedLists(a, b) ;
        Object[] outArray = out.toArray() ;
        Object[] expected = new Object[] {1,2,3,4,5} ;

        System.out.println(Arrays.toString(outArray)) ;

        assertTrue(Arrays.equals(expected, outArray) );

    }

}