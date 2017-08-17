package com.ryangehring.epi.solutions.c18;

import java.util.ArrayList;
import java.util.List;

/**
 * First-fit algorithm.
 *
 * Maintain a list of boxes of fixed size.
 * Try to put items in the boxes sequentially until it fits.
 * Otherwise, put in a new box.
 *
 * The tricky part is defining what it means to fit.
 * Box volume - package volume > 0 is not sufficient.
 * Turns out this is an NP-hard problem called 'bin packing'
 * I'm just gonna use an el-cheapo heuristic where I stack em on 1 dimension.
 * So I'm reducing the intended 3D problem to 1D.
 *
 *
 */
public class P05 {

    public static List<List<Integer>> elCheapoFirstFit(int capacity, int[] items) {
        List<List<Integer>> out = new ArrayList<List<Integer>>();

        for (int item: items) {
            Boolean placed = false ;
            for (List<Integer> box : out) {
                int boxCapacity = capacity ;
                for (Integer i : box) {
                    boxCapacity -= i ;
                }
                if (boxCapacity >= item) {
                    box.add(item);
                    placed = true ;
                    break;
                }
            }
            if (!placed) {
                List<Integer> temp = new ArrayList<Integer>() ;
                temp.add(item) ;
                out.add(temp);
            }
        }
        return out;
    }

}
