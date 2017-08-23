package com.ryangehring.epi.solutions.c15;

import com.ryangehring.epi.common.Heap;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Logfile with billions of page string / timestamp tuples
 *
 * addEntry() adds an entry
 * common(k) gets the k most common
 *
 * 1) When common is called once after all pages have been read
 *   - Naive approach - create a max heap or BST of page , viewed counts.  O(log n) for each add or increment.
 *   - This is too much for an increment.
 *   - So just make a map of page - count.
 *   - Now its O(1) to add.
 *   - at the end do an O(n) scan of the values.
 *
 *
 * 2) When common and add are interleaved
 *   - Make a BST of (page / count) values.
 *   - Increment the count on add.
 *   - pop k times for common
 *
 *  I wound up just doing a sketch of this one because my heap implementation doesn't have a remove node
 *  function and i didn't want to bother writing it. :/ #lazy
 *
 *
 */
public class P08 {

//
//    public class HeapNode implements Comparable<HeapNode> {
//        public String page ;
//        public Integer count ;
//        public HeapNode(String page, Integer count) {
//            this.page = page ;
//            this.count = count ;
//        }
//
//        @Override
//        public int compareTo(HeapNode h) {
//            String me = this.count + this.page ;
//            String you = h.count + h.page ;
//            return me.compareTo(you);
//        }
//    }
//
//    public Heap data ;
//    public Map<String, HeapNode> nodeMap ;
//
//    public P08() {
//        data = new Heap();
//    }
//
//    public List<HeapNode> kCount(int k) {
//        List<HeapNode> out = new ArrayList<>() ;
//
//        for (int i=0; i<k ; i++) {
//            out.add((HeapNode) data.pop());
//        }
//
//        for (HeapNode n: out) {
//            data.push(n);
//        }
//
//        return out ;
//    }
//
//    public  void add(String page) {
//        if (nodeMap.get(page) != null) {
//            nodeMap.get(page).count++ ;
//            data.remove(nodeMap.get(page)) ;
//            data.push(nodeMap.get(page));
//        } else {
//            nodeMap.put(page, new HeapNode(page, 1)) ;
//            data.push(nodeMap.get(page));
//        }
//
//    }


}
