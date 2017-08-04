package com.ryangehring.epi.solutions.c19;

import org.junit.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;

/**
 * Created by ryan on 8/3/17.
 */
public class P01Test {
    @Test
    public void searchAMaze() throws Exception {

        Map<String, Boolean> map = new HashMap<String, Boolean>() ;
        map.put("0-0", true) ;
        map.put("0-1", true) ;
        map.put("0-2", false) ;
        map.put("1-0", false) ;
        map.put("1-1", true) ;
        map.put("1-2", true) ;
        map.put("2-0", true) ;
        map.put("2-1", false) ;
        map.put("2-2", true) ;

        P01 p = new P01() ;
        P01.Maze maze = p.new Maze(map) ;
        List<P01.Move> out =  p.searchAMaze(maze, 0,0,2,2) ;
        System.out.println(Arrays.toString( out.toArray()));
        assertEquals(2, out.get(0).x );
        assertEquals(2, out.get(0).y );
        assertEquals(0, out.get(4).y );
        assertEquals(0, out.get(4).y );

    }

}