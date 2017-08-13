package com.ryangehring.epi.solutions.c13;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Efficient algorithm for line through the most points.
 * A line is defined as a selection of 2 points.
 * You could select every pair of points possible.
 * The val is how many points lie on the line.
 * This is n^3 in time.
 *
 * But, since we can reduce every line to "slope, reduced intercept" form,
 * we can save the extra n comparisons.
 *
 * Here our hash keys are the string (slopex,slopey,slopez+x,y,z)
 * and the values are point lists.
 * This is a bit sloppy but I basically reduced every line to its
 * slope - intercept notation. Since not all points in three dimensions
 * intersect each axis (orthagonality is possible) I have a nasty looking
 * conditional logic where I select only the axis intersection that exists.
 *
 */
public class P07 {

    public static int gcm(int a, int b) {
        return b == 0 ? a : gcm(b, a % b);
    }

    public static String asFraction(int a, int b) {
        int gcm = gcm(a, b);
        return (a / gcm) + "/" + (b / gcm);
    }


    public static List<Integer[]> mostCollinear(Integer[][] coords) {
        Map<String, List<Integer[]>> store = new HashMap<String, List<Integer[]>>();
        for (int i=0; i< coords.length; i++) {
            Integer[] a = coords[i] ;
            for (int j=i+1; j<coords.length; j++) {
                Integer[] b = coords[j] ;
                Integer normSquared = (b[0] - a[0])*(b[0] - a[0]) + (b[1] - a[1])*(b[1] - a[1]) + (b[2] - a[2])*(b[2] - a[2]);
                Integer xtop = (b[0] - a[0]) ;
                Integer ytop = (b[1] - a[1]) ;
                Integer ztop = (b[2] - a[2]) ;
                String slope = asFraction(xtop*normSquared, normSquared*normSquared) +" "+ asFraction(ytop*normSquared, normSquared*normSquared)+ " " + asFraction(ztop*normSquared, normSquared*normSquared) ;
                int tDeltaNum = 0;
                int tDeltaDenom = 0;
                String intercept ;

                if (xtop != 0) {
                    tDeltaNum = (a[0] *normSquared * normSquared) ;
                    tDeltaDenom = xtop * normSquared ;

                    if ((tDeltaNum / tDeltaDenom) < 0) tDeltaNum = -tDeltaNum ;
                    intercept = asFraction( (a[1]*(normSquared*normSquared*tDeltaDenom) - (ytop*normSquared*tDeltaNum)) , (normSquared*normSquared*tDeltaDenom)) + " " +
                            asFraction( (a[2]*(normSquared*normSquared*tDeltaDenom) - (ztop*normSquared*tDeltaNum)) , (normSquared*normSquared*tDeltaDenom)) ;
                } else if (ytop != 0) {
                    tDeltaNum = (a[1] *normSquared * normSquared) ;
                    tDeltaDenom = ytop * normSquared ;

                    if ((tDeltaNum / tDeltaDenom) < 0) tDeltaNum = -tDeltaNum ;
                    intercept = asFraction( (a[0]*(normSquared*normSquared*tDeltaDenom) - (xtop*normSquared*tDeltaNum)) , (normSquared*normSquared*tDeltaDenom)) + " " +
                            asFraction( (a[2]*(normSquared*normSquared*tDeltaDenom) - (ztop*normSquared*tDeltaNum)) , (normSquared*normSquared*tDeltaDenom)) ;
                } else {
                    tDeltaNum = (a[2] *normSquared * normSquared) ;
                    tDeltaDenom = ztop * normSquared ;

                    if ((tDeltaNum / tDeltaDenom) < 0) tDeltaNum = -tDeltaNum ;
                    intercept = asFraction( (a[0]*(normSquared*normSquared*tDeltaDenom) - (xtop*normSquared*tDeltaNum)) , (normSquared*normSquared*tDeltaDenom)) + " " +
                            asFraction( (a[1]*(normSquared*normSquared*tDeltaDenom) - (ytop*normSquared*tDeltaNum)) , (normSquared*normSquared*tDeltaDenom)) ;
                }


                String key = slope+intercept ;
                if (store.get(key)==null) {
                    store.put(key, new ArrayList<Integer[]>());
                }
                if (!(store.get(key).contains(a))) {
                    store.get(key).add(a);
                }
                if (!(store.get(key).contains(b))) {
                    store.get(key).add(b) ;
                }
                System.out.println(key);
            }
        }
        List<Integer[]> champ = null ;
        for (List<Integer[]> l: store.values()) {
            if (champ == null) {
                champ = l ;
            } else {
                if (champ.size() < l.size() ) {
                    champ = l ;
                }
            }
        }
        return champ ;
    }

}
