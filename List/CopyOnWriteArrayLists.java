package List;

import java.util.concurrent.CopyOnWriteArrayList;

import java.util.*;

public class CopyOnWriteArrayLists {
    public static void main(String[] args) {
        List<Integer> list = new CopyOnWriteArrayList<>();
        list.add(10);
        list.add(20);

        System.out.println(list);
        //Thread-safe list
        //Best for multiple readers + few writers

    }
}