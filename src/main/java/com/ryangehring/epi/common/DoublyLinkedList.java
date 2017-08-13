package com.ryangehring.epi.common;

import java.util.Objects;

/**
 * Created by ryan on 7/31/17.
 */
public class DoublyLinkedList {

    public DoublyLinkedList() {
        this.root = null ;
        this.tail = null ;
    }


    public Object[] toArray() {
        int len = 0 ;
        Link curr = this.root ;

        if (curr==null) {return new Object[] {} ;}
        while (curr != null) {
            len++ ;
            curr = curr.getNext() ;
        }

        Object[] out = new Object[len] ;
        curr = this.root ;
        int i= 0 ;
        while (curr != null) {
            out[i] = curr.payload;
            i++ ;
            curr = curr.getNext() ;
        }
        return out ;
    }

    public Link root ;
    public Link tail ;

    public class Link {
        public Object payload ;
        public Object label ;
        public Link next ;
        public Link prev ;
        public Link(Object payload, Object label) {
            this.payload = payload ;
            this.label = label ;
            this.next = null ;
            this.prev = null ;
        }
        public Link getNext() {
            return this.next ;
        }
        public void setNext(Link l) {
            this.next=l ;
        }
        public Link getPrev() {
            return this.prev ;
        }
        public void setPrev(Link l) {
            this.prev=l ;
        }

    }
}
