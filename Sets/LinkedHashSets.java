package Sets;
import java.util.*;
public class LinkedHashSets {
    public static void main(String[] args) {
        Set<Integer> set = new LinkedHashSet<>();
        // oreder maintained 
        // not thred safe 
        // duplicates are not allowed 
        set.add(null);
        set.add(1);
        set.add(2);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(6);
        System.out.println(set);
      

    }
}
