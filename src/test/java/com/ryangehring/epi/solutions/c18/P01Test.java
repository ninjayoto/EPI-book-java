package com.ryangehring.epi.solutions.c18;

import com.ryangehring.epi.solutions.c11.P02;
import org.junit.Test;

import java.util.Map;

import static org.junit.Assert.*;

/**
 * Created by ryan on 8/3/17.
 */
public class P01Test {
    @Test
    public void compareTo() throws Exception {
        P01 p = new P01() ;
        P01.FrequencyEntry f1 = p.new FrequencyEntry( 9, 'c') ;
        P01.FrequencyEntry f2 = p.new FrequencyEntry( 2, 'a') ;
        P01.FrequencyEntry f3 = p.new FrequencyEntry( 8, 't') ;
        P01.FrequencyEntry[] f = {f1, f2, f3} ;
        Map<Character, String> out =  p.createHuffmanCoding( f) ;
        System.out.println(out.toString()) ;
        assertEquals("0", out.get('c')  );
        assertEquals("11", out.get('t')  );
        assertEquals("10", out.get('a')  );
    }

}