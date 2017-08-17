package com.ryangehring.epi.solutions.c17;

import java.util.Map;

/**
 * Created by ryan on 8/16/17.
 */
public class P03 {



    public static int staticBinomialCoef(int n, int k) {
        if (k==0 || k==n) return 1 ;
        if (n==1) return 1 ;
        return staticBinomialCoef(n-1, k) + staticBinomialCoef(n-1, k-1) ;

    }



    public static int dynamicBinomialCoef(int n, int k, Map<String, Integer> store) {
        if (k==0 || k==n) return 1 ;
        if (n==1) return 1 ;
        if (store.containsKey(n+"-"+k)) return store.get(n+"-"+k);

        store.put(n+"-"+k, staticBinomialCoef(n-1, k) + staticBinomialCoef(n-1, k-1)) ;
        return store.get(n+"-"+k);

    }

}
