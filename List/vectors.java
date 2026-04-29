package List;
import java.util.*;
public class vectors {
    public static void main(String[] args) {
        List<Integer> list = new Vector<>(Arrays.asList(1,3,4,345,5,4325,23,54));
        list.add(90);
        list.addFirst(99);
        list.addLast(null);
        list.get(0);
        list.set(5, 90);
        list.remove(0);
        System.out.println(list);
        // same as the ArrayList but it's thread safe 
        // fast 
        //insertion and deleteion  slow in same cases 
    }
}
