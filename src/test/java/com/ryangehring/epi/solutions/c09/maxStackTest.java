package com.ryangehring.epi.solutions.c09;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * Created by ryan on 7/31/17.
 */
public class maxStackTest {
    @Test
    public void getMax() throws Exception {
        P01 problem = new P01() ;
        P01.MaxStack stack = problem.new MaxStack() ;
        stack.push(4) ;
        System.out.println(Arrays.toString(stack.data.toArray() )) ;
        System.out.println(Arrays.toString(stack.maxes.toArray() )) ;

        stack.push(1);
        System.out.println(Arrays.toString(stack.data.toArray() )) ;
        System.out.println(Arrays.toString(stack.maxes.toArray() )) ;

        stack.push(5);
        stack.push(2) ;
        assertEquals((Integer) 5, stack.getMax());
        System.out.println(Arrays.toString(stack.data.toArray() )) ;
        System.out.println(Arrays.toString(stack.maxes.toArray() )) ;
        stack.pop() ;
        System.out.println(Arrays.toString(stack.data.toArray() )) ;
        System.out.println(Arrays.toString(stack.maxes.toArray() )) ;

        assertEquals((Integer) 5, stack.getMax());
        stack.pop() ;
        System.out.println(Arrays.toString(stack.data.toArray() )) ;
        System.out.println(Arrays.toString(stack.maxes.toArray() )) ;

        assertEquals((Integer) 4, stack.getMax());
        stack.pop() ;
        System.out.println(Arrays.toString(stack.data.toArray() )) ;
        System.out.println(Arrays.toString(stack.maxes.toArray() )) ;

        assertEquals((Integer) 4, stack.getMax());
        stack.pop() ;
        System.out.println(Arrays.toString(stack.data.toArray() )) ;
        System.out.println(Arrays.toString(stack.maxes.toArray() )) ;

        assertEquals((Integer) null, stack.getMax());
    }


}