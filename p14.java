//  Mark Villa
//  4/20/18
//  In Flight Entertainment System
//  O(n) time, O(n) space. 

import java.util.*;

public class P14 {

    public boolean isAvailable(Integer flightLength , Integer[] movies) {
        Map<Integer, Integer> sums = new HashMap<Integer, Integer>();
        for (Integer movieLength : movies) {
            if (sums.get(movieLength) != null) return true ;
            sums.put(flightLength - movieLength, 1) ;
        }
        return false;
    }

}
