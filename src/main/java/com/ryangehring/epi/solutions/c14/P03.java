package com.ryangehring.epi.solutions.c14;

import com.ryangehring.epi.common.sorts.MergeSort;
import com.ryangehring.epi.common.sorts.QuickSort;

/**
 * Created by ryan on 8/13/17.
 */
public class P03 {

    public static void printFrequencies(String s) {

        Comparable<Character>[] compArray = new Character[s.length()] ;
        int i=0 ;
        for (char c : s.toCharArray()) {
            compArray[i] = c;
            i++;
        }
        QuickSort.quickSort(compArray);
        char lastChar = 'a';
        int lastCharCount = 0 ;
        for (int j=0; j<compArray.length; j++) {

            if (!compArray[j].equals(lastChar)) {
                System.out.println(lastChar + ": " + lastCharCount);
                lastChar = (Character) compArray[j] ;
                lastCharCount = 0 ;
            }
            lastCharCount++;
        }
        System.out.println(lastChar + ": " + lastCharCount);

    }

}
