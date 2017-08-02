package com.ryangehring.epi.solutions.c16;

import java.util.Arrays;
import java.util.List;
import java.util.Stack;

/**
 * Towers of hanoi
 * recurrence relation:
 * S(3,0,0) = S(2,0,1)
 * S(k) = S(k-1) + 1
 */
public class P01 {

    public static void move(List<Stack<Integer>> board, int from, int to) {
        if ( !board.get(to).empty() && board.get(from).peek() > board.get(to).peek() ) throw new IllegalArgumentException("bad move") ;
        board.get(to).push( board.get(from).pop() );
        System.out.println(Arrays.toString(board.get(0).toArray()) +
                " " +  Arrays.toString(board.get(1).toArray()) +
                " " + Arrays.toString(board.get(2).toArray()) )    ;
    }

    public static void printTowersOfHanoi(List<Stack<Integer>> board , int n, int from, int to ) {
        if (n==0) return ;
        Integer dest = null ;
        if (from == 0 && to == 1) {
            dest=2 ;
        } else if (from == 0 && to==2) {
            dest=1 ;
        } else if (from == 1 && to==0) {
            dest=2 ;
        } else if (from==1 && to==2) {
            dest=0 ;
        } else if (from==2 && to==0) {
            dest=1 ;
        } else if (from==2 && to==1) {
            dest=0 ;
        }


        printTowersOfHanoi(board, (n-1) , from, dest );
        move(board, from, to );
        printTowersOfHanoi(board, (n-1) , dest, to );
    }

}
