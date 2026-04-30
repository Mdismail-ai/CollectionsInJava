package Sets;

import java.util.*;
import java.util.concurrent.ConcurrentSkipListSet;

public class ConcurrentHashSetSkip {
    public static void main(String[] args) {
        Set<Integer> set = new ConcurrentSkipListSet<>();
        // nulls are not allowed 
        // set.add(null);
        // fast 
        // probablistic data struture 
        // order not maintained 
        // thred safe 
        set.add(1);
        set.add(11);
        set.add(123);
        set.add(13);
        set.add(14);
        set.add(15);
        set.add(17);
        set.add(18);
        set.add(19);
        System.out.println(set);
    }

}


//Level 2:      1 -------- 10 -------- 100
// Level 1:   1 ---- 5 ---- 10 ---- 50 ---- 100
// Level 0: 1 - 3 - 5 - 7 - 10 - 20 - 50 - 100
