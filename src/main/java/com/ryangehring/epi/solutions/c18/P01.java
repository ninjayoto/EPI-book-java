package com.ryangehring.epi.solutions.c18;

import com.ryangehring.epi.common.Heap;

import java.util.HashMap;
import java.util.Map;

/**
 * Implement a huffman coding
 * Given symbols and frequencies,
 * return the coding (symbol - bitsequence) assignments
 * that has the smallest average length.
 *
 * Huffman codes are greedy 'bottom-up' compression.
 * A prefix tree is constructed one step at a time, with the
 * least frequent terms guaranteed to be the furthest nodes from the top.
 *
 * A priority queue (min heap) is used here to 'greedily'
 * return the least frequent items.
 *
 *
 */
public class P01 {



    public class FrequencyEntry implements Comparable {
        public Integer frequency ;
        public Character symbol ;
        public Boolean isInternalNode ;
        public FrequencyEntry left ;
        public FrequencyEntry right ;

        public FrequencyEntry(Integer freq, Character sym) {
            frequency = freq ;
            symbol = sym ;
            isInternalNode = false ;
        }

        @Override
        public int compareTo(Object o) {
            if (((FrequencyEntry) o).frequency > frequency) return -1 ;
            else if (((FrequencyEntry) o).frequency == frequency) return 0 ;
            else return 1 ;
        }
    }

    public void makeEncoding(FrequencyEntry x, String b, Map<Character, String> store ) {
        if (x==null) return ;
        if (!x.isInternalNode) {
            store.put(x.symbol, b) ;
        }

        makeEncoding(x.left, b + "0", store);
        makeEncoding(x.right, b + "1", store);
    }

    public  Map<Character, String> createHuffmanCoding(FrequencyEntry[] frequencyTable) {
        Heap htree = new Heap() ;
        for (FrequencyEntry f : frequencyTable) {
            htree.push(f);
        }

        FrequencyEntry root = null ;
        while ( true ) {
            FrequencyEntry l = (FrequencyEntry) htree.pop() ;
            FrequencyEntry r = (FrequencyEntry) htree.pop() ;
            if (r==null) {
                root = l ;
                break;
            }
            FrequencyEntry x = new FrequencyEntry(l.frequency + r.frequency, null );
            x.left = l ;
            x.right = r ;
            x.isInternalNode = true ;
            htree.push(x) ;

        }

        Map<Character, String> store = new HashMap<Character, String>() ;
        makeEncoding(root, new String(), store ) ;
        return store ;

    }

}
