package List;
import java.util.*;
public class ArrayLists {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1,23,4,34,32,43,4,23));
        List<Integer> list1 = new ArrayList<>(Arrays.asList(1,23,4,34,32,43,4,23));
        // fast access 
        //slow insertion and deleteation 
        list.add(20);
        System.out.println(list.contains(23));
        System.out.println(list.equals(list1));
        System.out.println(list.get(0));
        System.out.println(list.subList(0, 7));
        System.out.println(list.size());
        System.out.println(list.stream().skip(5));
        
        list.sort(null);
        System.out.println(list);

    }
}
