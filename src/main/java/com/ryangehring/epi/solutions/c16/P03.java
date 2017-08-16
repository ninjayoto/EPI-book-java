package com.ryangehring.epi.solutions.c16;

import java.util.ArrayList;
import java.util.List;

import static java.lang.Math.abs;

/**
 * Nonattaching queens
 *
 * Try to put the queen in the leftmost unoccupied column.
 * If you can't , return null
 * Else add solution to out.
 */
public class P03 {

    public static Boolean validMove(Integer[][] board, Integer xp, Integer yp) {
        int n = board[0].length ;
        for (int x=0; x<n; x++) {
            for (int y=0; y<n; y++) {
                if ((board[x][y] != null) && board[x][y].equals( 1)) {
                    if (x==xp) return false;
                    if (y==yp) return false ;
                    if (abs(x-xp) == abs(y-yp)) return false ;
                }
            }
        }
        return  true ;
    }

    public static void nQueensRecursion(Integer n, Integer[][] board, List<Integer[][]> out ) {
        if (n==0) {
            out.add(board) ;
            return;
        }
        Integer x = n-1 ;
        for (int y=0;y<board[0].length;y++) {
            if (validMove(board, x, y)) {
                Integer[][] cloneBoard = new Integer[board[0].length][];
                for(int i = 0; i < board[0].length; i++) {
                    cloneBoard[i] = board[i].clone();
                }
                cloneBoard[x][y] = 1 ;
                nQueensRecursion(n-1,cloneBoard,out);
            }
        }
    }


    public static List<Integer[][]> nQueens(Integer n) {
        List<Integer[][]> out = new ArrayList<Integer[][]>();
        Integer[][] board = new Integer[n][n] ;
        nQueensRecursion(n, board, out);
        return out ;

    }



}
