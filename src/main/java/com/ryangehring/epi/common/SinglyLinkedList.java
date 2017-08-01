package com.ryangehring.epi.common;

/**
 * Created by ryan on 7/31/17.
 */
public class SinglyLinkedList {

    public SinglyLinkedList() {
        this.root = null ;
    }

    public void addLink(Object payload) {
        Link curr = this.root ;
        if (curr == null) {
            this.root = new Link(payload);
            return ;
        }
        while (curr.getNext() != null) {
            curr = curr.getNext() ;
        }
        curr.setNext(new Link(payload));
    }

    public Link getRoot() {
        return this.root ;
    }
    public Object[] toArray() {
        int len = 0 ;
        Link curr = this.root ;
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

    private Link root ;

    public class Link {
        public Object payload ;
        private Link next ;
        public Link(Object payload) {
            this.payload = payload ;
            this.next = null ;
        }
        public Link getNext() {
            return this.next ;
        }
        public void setNext(Link l) {
            this.next=l ;
        }

    }
}
