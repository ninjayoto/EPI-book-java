package com.ryangehring.epi.solutions.c11;

import com.ryangehring.epi.common.Heap;

/**
 * Heap merge
 * Create a max heap that contains the top trade from each file.
 * Repeatedly pop from the heap, adding back the next line from the file.
 */
public class P01 {

    public class Trade implements Comparable<Trade> {
        public int time ;
        public int amount ;
        public String ticker ;
        public int lineNumber ;
        public int sourceListIdx ;

        public Trade(int sourceListIdx, int lineNumber, int time, int amount, String ticker) {
            this.sourceListIdx = sourceListIdx ;
            this.lineNumber = lineNumber ;
            this.time = time ;
            this.amount = amount;
            this.ticker = ticker;
        }

        @Override
        public int compareTo(Trade  o) {
            if (o.time > this.time) {
                return 1 ;
            } else if (o.time == this.time) {
                return 0;
            } else return -1 ;
        }
    }

    public static Trade[] merge(Trade[][] data) {
        Heap heap = new Heap() ;
        int linesOfData = 0 ;

        for (Trade[] dataset : data) {
            heap.push( dataset[0] ) ;
            linesOfData = linesOfData + dataset.length ;
        }

        int writeIdx = 0 ;
        Trade[] outData = new Trade[linesOfData] ;

        while (writeIdx < linesOfData) {
            Trade min = (Trade) heap.pop() ;
            outData[writeIdx] = min ;
            if (min.lineNumber + 1 < data[min.sourceListIdx].length ) {
                heap.push(data[min.sourceListIdx][min.lineNumber + 1]);
            }
            writeIdx++ ;
        }
        return outData ;
    }

}
