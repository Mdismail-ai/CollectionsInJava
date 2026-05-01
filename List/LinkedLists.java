package List;
import java.util.*;
public class LinkedLists {
    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>(Arrays.asList(1,2,3,1,4,24,1,43,5,45,23,54,23));
        List<Integer> list2 = new LinkedList<>(Arrays.asList(1,2,3,1,4,24,1,43,5,45,23,54,23));
        list.sort(null);
        System.out.println(list);
        System.out.println(list.contains(9));
        System.out.println(list.indexOf(4));
        System.out.println(list.remove(4));
        System.out.println(list.equals(list2));
        System.out.println(list.isEmpty());
        System.out.println(list.lastIndexOf(3));
        // slow acessesing 
         // fast insertion and deleation 

    }
}
