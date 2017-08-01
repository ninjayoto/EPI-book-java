package com.ryangehring.epi.solutions.c11;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * Created by ryan on 8/1/17.
 */
public class P01Test {
    @Test
    public void merge() throws Exception {
        P01 problem = new P01() ;
        P01.Trade[][] data = new P01.Trade[3][2] ;
        data[0][0] = problem.new Trade(0,0,1,1,"hi") ;
        data[0][1] = problem.new Trade(0,1,3,1,"hi") ;
        data[1][0] = problem.new Trade(1,0,2,1,"hi") ;
        data[1][1] = problem.new Trade(1,1,5,1,"hi") ;
        data[2][0] = problem.new Trade(2,0,4,1,"hi") ;
        data[2][1] = problem.new Trade(2,1,6,1,"hi") ;


        P01.Trade[] out = P01.merge(data) ;
        Integer[] outTimes = new Integer[out.length] ;
        for (int i=0 ; i< out.length; i++) {
            outTimes[i] = out[i].time ;
        }
        System.out.println(Arrays.toString(outTimes)) ;

        assertEquals( 1, out[0].time );
        assertEquals( 2, out[1].time );
        assertEquals( 3, out[2].time );
        assertEquals( 4, out[3].time );
        assertEquals( 5, out[4].time );
        assertEquals( 6, out[5].time );

    }

}