package List;

import java.util.List;
import java.util.Stack;

public class Stackss {
    public static void main(String[] args) {
        List<Integer> list =new  Stack<>(); // act normal as the list 
        Stack<Integer> list1 =new  Stack<>();
        // in the stack Last in Fast Out this is how the  stack works 
        list.add(10);
        list.add(100);
        list.contains(10);
        list.set(1, 20);
        list.remove(0);
        list1.push(30);
        list1.push(300);
        list1.push(60);
        list1.push(80);
        list1.push(900);
        list1.push(70);
        list1.pop();
        System.out.println(list1);
        System.err.println(list);
    }
}
