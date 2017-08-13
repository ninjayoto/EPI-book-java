package com.ryangehring.epi.solutions.c08;

import com.ryangehring.epi.common.SinglyLinkedList;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * Created by ryan on 8/5/17.
 */
public class P03Test {
    @Test
    public void reverseLLSubset() throws Exception {

        SinglyLinkedList ll = new SinglyLinkedList() ;
        ll.addLink( 1);
        ll.addLink( 2);
        ll.addLink( 3);
        ll.addLink( 4);
        Integer[] expected = {1,3,2,4} ;
        P03.reverseLLSubset(ll, 2,3);
        Object[] out = ll.toArray() ;
        assertTrue(Arrays.equals(expected, out));


    }

}