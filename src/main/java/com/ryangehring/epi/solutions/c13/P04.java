package com.ryangehring.epi.solutions.c13;

import com.ryangehring.epi.common.DoublyLinkedList;

import java.util.Arrays;

/**
 * Created by ryan on 8/12/17.
 */
public class P04 {

    public int capacity  ;
    public int size = 0 ;
    public int safety = 10 ;
    public DoublyLinkedList.Link[] cache ;
    public DoublyLinkedList data ;


    public int hashString(String s) {
        int hash = 7;
        for (int i = 0; i < s.length(); i++) {
            hash = hash*31 + s.charAt(i);
        }
        return hash % (capacity*safety);
    }

    public P04() {
        capacity = 10;
        cache = new DoublyLinkedList.Link[capacity*safety] ;
        data = new DoublyLinkedList();
    }

    public void put(String k, Integer v) {
        System.out.println(Arrays.toString(data.toArray()));
        if (size >= capacity) {
            size--;
            DoublyLinkedList.Link temp = data.root ;
            data.root = temp.next ;
            cache[hashString((String) temp.label)] = null ;
        }


        DoublyLinkedList.Link temp = data.tail ;
        data.tail = data.new Link(v, k);
        data.tail.prev = temp ;

        if (temp == null) {
            data.root = data.tail ;
        } else {
            temp.next = data.tail ;
        }
        cache[hashString(k)] = data.tail ;
        size++ ;

    }

    public Integer get(String k) {
        DoublyLinkedList.Link outLink = cache[hashString(k)] ;
        if (outLink == null) return null ;
        if (outLink.prev == null) {
            data.root = outLink.next ;
        }
        if (outLink.next == null) {
            data.tail = outLink ;
        }
        if (outLink.prev != null) {
            outLink.prev.next = outLink.next;
        }
        if (outLink.next != null) {
            outLink.next.prev = outLink.prev ;
        }
        if (outLink != data.tail) {
            outLink.prev = data.tail;
            data.tail.next = outLink ;
            data.tail = outLink ;
        }
        return (Integer) outLink.payload ;
    }


}
