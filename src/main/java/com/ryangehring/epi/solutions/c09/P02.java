package com.ryangehring.epi.solutions.c09;

import com.ryangehring.epi.common.SinglyLinkedList;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by ryan on 7/31/17.
 */
public class P02 {
    public static Double evaluateRPN(String rpn) {
        String[] x = rpn.split(",") ;
        SinglyLinkedList stackOfResults = new SinglyLinkedList() ;

        for (String s : x) {
            System.out.println(Arrays.toString(stackOfResults.toArray() ));
            if (s.equals("+")) {
                Double a = (Double) stackOfResults.pop() ;
                Double b = (Double) stackOfResults.pop() ;
                stackOfResults.push(a+b) ;
            } else if (s.equals("*")) {
                Double a = (Double) stackOfResults.pop() ;
                Double b = (Double) stackOfResults.pop() ;
                stackOfResults.push(a*b) ;
            } else if (s.equals("/")) {
                Double a = (Double) stackOfResults.pop() ;
                Double b = (Double) stackOfResults.pop() ;
                stackOfResults.push(a/b) ;

            } else if (s.equals("-")) {
                Double a = (Double) stackOfResults.pop() ;
                Double b = (Double) stackOfResults.pop() ;
                stackOfResults.push(a-b) ;
            } else {
                stackOfResults.push(Double.parseDouble(s)) ;
            }
        }

        return (Double) stackOfResults.pop();

    }
}
