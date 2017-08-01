package com.ryangehring.epi.solutions.c08;

import com.ryangehring.epi.common.SinglyLinkedList;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * Created by ryan on 7/31/17.
 */
public class P02Test {
    @Test
    public void reverseList() throws Exception {
        SinglyLinkedList a = new SinglyLinkedList() ;
        a.addLink(1);
        a.addLink(3);
        a.addLink(5);
        P02.reverseList(a);

        System.out.println(Arrays.toString(a.toArray() ) );

        Object[] expected = new Object[] {5,3,1} ;

        assertTrue(Arrays.equals(expected, a.toArray()) );
        System.out.println(a.toArray());
    }

}