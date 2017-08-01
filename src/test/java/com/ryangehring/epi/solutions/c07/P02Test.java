package com.ryangehring.epi.solutions.c07;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * Created by ryan on 7/31/17.
 */
public class P02Test {
    @Test
    public void mutateCharArray() throws Exception {
        char[] test = {'a', 'b', 'c' ,'d'} ;
        char [] expected = {'d', 'd', 'c', 'd'} ;
        P02.mutateCharArray(test) ;
        System.out.println(Arrays.toString(test )) ;
        assertTrue( Arrays.equals(expected, test) ) ;

        char[] test2 = {'a', 'a', 'c' ,'d', 'z', 'z'} ;
        char [] expected2 = {'d', 'd', 'd', 'd', 'c', 'd'} ;
        P02.mutateCharArray(test2) ;
        System.out.println(Arrays.toString(test2 )) ;
        assertTrue( Arrays.equals(expected2, test2) ) ;

    }



}