package com.ryangehring.epi.common;

import com.ryangehring.epi.solutions.c11.P01;

import java.util.Arrays;
import java.util.Random;

/**
 * Created by ryan on 8/1/17.
 */
public class Heap {

    int size ;
    Comparable[] data ;
    int filledSize = 0 ;
    public Heap() {
        size = 100 ;
        data = new Comparable[size];
        for (int i=0; i<size; i++) {
            data[i] = null ;
        }
    }

    public void push(Comparable x) {

        Random rn = new Random();
        int offset = (rn.nextInt() % (2*filledSize+1)) ;
        int destIdx = (2*filledSize + offset) ;
        while (data[destIdx] != null) {
            destIdx++ ;
        }
        data[destIdx] = x ;
        bubbleUp(destIdx) ;
        filledSize ++ ;

    }

    public Comparable pop() {

        Comparable out = data[0] ;
        if (out == null) return null ;
        data[0] = null ;
        bubbleDown(0);
        this.filledSize = filledSize - 1 ;
        return out ;
    }

    private void bubbleUp(int k) {

        if (k==0) return ;
        int parentIdx = (k-1)/2 ;
        Comparable temp = null ;
        if ( (data[parentIdx]==null )||  (data[parentIdx].compareTo(data[k]) > 0 )) {
            temp = data[parentIdx] ;
            data[parentIdx] = data[k] ;
            data[k] = temp ;
            bubbleUp(parentIdx);
        }
    }

    private void bubbleDown(int k) {

        int leftIdx = 2*k + 1 ;
        int rightIdx = 2*k+2 ;
        if (leftIdx + 1 > size) return ;
        if (data[leftIdx]==null && data[rightIdx]==null) {
            return ;
        }
        Comparable temp ;
        if (data[leftIdx] == null ) {
            temp = data[k] ;
            data[k] = data[rightIdx] ;
            data[rightIdx] = temp ;
            bubbleDown(rightIdx);
            return;
        } else if (data[rightIdx] == null ) {
            temp = data[k] ;
            data[k] = data[leftIdx] ;
            data[leftIdx] = temp ;
            bubbleDown(leftIdx);
            return;
        }

        if (data[leftIdx].compareTo( data[rightIdx] ) < 0) {
            temp = data[k] ;
            data[k] = data[leftIdx] ;
            data[leftIdx] = temp ;
            bubbleDown(leftIdx);
        } else {
            temp = data[k] ;
            data[k] = data[rightIdx] ;
            data[rightIdx] = temp ;
            bubbleDown(rightIdx);
        }
    }

}
