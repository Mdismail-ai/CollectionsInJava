package Sets;
import java.util.*;
public class HashSets {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        // dublicates are not allowed 
        // null are allowed  But only one null is allowed
        // not thread sefe 
        set.add(915);
        set.add(92);
        set.add(93);
        set.add(94);
        set.add(9);
        set.add(null);
        System.out.println(set);

    }
}
