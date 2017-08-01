package com.ryangehring.epi.solutions.c09;

import com.ryangehring.epi.common.SinglyLinkedList;

/**
 * Design a max stack
 * Make 2 stacks, one of new maxes and one of eles.
 *
 *
 */
public class P01 {

    public class MaxStack {

        public SinglyLinkedList data ;
        public SinglyLinkedList maxes ;

        public MaxStack() {
            this.data = new SinglyLinkedList() ;
            this.maxes = new SinglyLinkedList() ;
        }

        public void push( Integer x ) {
            data.push(x);
            Integer latestMax = (Integer) this.maxes.pop() ;
            if (latestMax != null) {
                this.maxes.push(latestMax);
                if (x >= latestMax) {
                    this.maxes.push(x) ;
                }
            } else {
                this.maxes.push(x);
            }
        }

        public Integer pop() {
            Integer out = (Integer) this.data.pop() ;
            if (out == null) return null ;
            Integer latestMax = (Integer) this.maxes.pop() ;
            if (out.equals( latestMax )) return out ;
            this.maxes.push(latestMax) ;
            return out ;
        }
        public Integer getMax() {
            Integer latestMax = (Integer) this.maxes.pop() ;
            if (latestMax != null) this.maxes.push(latestMax);
            return latestMax ;
        }

    }


}
