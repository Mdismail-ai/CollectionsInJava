package Sets;
import java.util.*;
public class SortedSets {
    public static void main(String[] args) {
        // soterd set also a interface 
        // nulls are not alloed here 
        // natural sorting 
        Set<Integer> set = new TreeSet<>();
        // set.add(null);
        set.add(10);
        set.add(1);
        set.add(101);
        set.add(102);
        set.add(104);
        set.add(105);
        set.add(1);
        set.add(108);
        set.add(109);
        System.out.println(set);
    }
}
