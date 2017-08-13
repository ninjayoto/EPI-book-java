package com.ryangehring.epi.solutions.c14;

import com.ryangehring.epi.common.sorts.QuickSort;

/**
 * Remove duplicates
 */
public class P04 {

    public static void removeDuplicates(String[] sa) {
        QuickSort.quickSort(sa);
        int offset = 0 ;
        String lastString = null ;
        for (int i=0; i< sa.length ; i++) {
            if (sa[i].equals( lastString)) {
                offset++ ;
            }
            lastString = sa[i];
            sa[i-offset] = sa[i];
        }
        for (int i=sa.length - offset; i<sa.length; i++) {
            sa[i] = null ;
        }
    }

}
