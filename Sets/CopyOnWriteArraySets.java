package Sets;
import java.util.*;
import java.util.concurrent.CopyOnWriteArraySet;
public class CopyOnWriteArraySets {
    
    public static void main(String[] args) {
   
// handles multiple readers, few writers
// thread-safe
// maintains insertion order
// does NOT allow null
    Set<Integer> set = new CopyOnWriteArraySet<>();
    set.add(null);
    set.add(2);
    set.add(232);
    set.add(2);
    set.add(223);
    set.add(223);
    set.add(234);
    set.add(2432);
    System.out.println(set);
    }
}
