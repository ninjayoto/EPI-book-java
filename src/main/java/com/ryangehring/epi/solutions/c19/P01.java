package com.ryangehring.epi.solutions.c19;

import java.util.*;

/**
 * Created by ryan on 8/3/17.
 */
public class P01 {


    public class Maze {
        Map<String, Boolean> map ;
        public Maze(Map<String, Boolean> map) {
            this.map = map ;
        }
    }


    public class Move {
        public Boolean visited ;
        public int x;
        public int y ;
        public Move from ;
        public Move(int x, int y, Move from) {
            this.x=x ;
            this.y=y ;
            this.from = from ;
            visited=true ;
        }
        public String toString() {
            return ("x: " + x + " y: " + y ) ;
        }
    }

    public void tryMove(Maze maze, Queue q, Map<String, Move> moves, int x, int y, Move from) {
        String key = Integer.toString(x) + "-"+Integer.toString(y) ;
        if ((maze.map.get( key ) != null ) &&(maze.map.get( key ) == true)) {
            if (moves.get( key ) == null) {
                q.add(new Move(x, y, from));
            }
        }

    }

    public  List<Move> searchAMaze(Maze maze, int xs, int ys, int xf, int yf) {
        Boolean found = false ;

        Map<String, Move> moves = new HashMap<String, Move>();
        Queue q = new LinkedList() ;
        Move curr =new Move(xs, ys, null) ;
        q.add(curr);

        moves.put((xs+"-"+ys), curr) ;
        while (true) {
            System.out.println(curr.toString() ) ;
            curr = (Move) q.poll() ;
            if ( curr==null ) break ;
            if ((curr.x == xf ) && (curr.y ==yf) ) break ;

            tryMove(maze, q, moves, curr.x+1, curr.y, curr);
            tryMove(maze, q, moves, curr.x-1, curr.y, curr);
            tryMove(maze, q, moves, curr.x, curr.y+1, curr);
            tryMove(maze, q, moves, curr.x, curr.y-1, curr);


        }
        List<Move> out = new ArrayList<Move>() ;
        while (curr != null) {
            System.out.println("tracing successful route: " + curr.toString());
            out.add(curr);
            curr = curr.from;
        }
        return out ;
    }

}
