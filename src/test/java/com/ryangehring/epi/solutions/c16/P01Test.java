package com.ryangehring.epi.solutions.c16;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

import static org.junit.Assert.*;

/**
 * Created by ryan on 8/2/17.
 */
public class P01Test {
    @Test
    public void printTowersOfHanoi() throws Exception {

        Stack<Integer> a = new Stack<Integer>();
        Stack<Integer> b = new Stack<Integer>();
        Stack<Integer> c = new Stack<Integer>();
        List<Stack<Integer>> board = new ArrayList<Stack<Integer>>();
        board.add(a);
        board.add(b);
        board.add(c);

        a.push(4);
        a.push(3);
        a.push(2);
        a.push(1);

        P01.printTowersOfHanoi(board, 4, 0, 2);

        Integer[] expected = {4,3,2,1} ;
        assertTrue(Arrays.equals(expected, board.get(2).toArray())) ;

    }

}