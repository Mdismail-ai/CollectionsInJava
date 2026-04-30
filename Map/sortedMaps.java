package Map;

import java.util.NavigableMap;
import java.util.SortedMap;
import java.util.TreeMap;

public class sortedMaps {
    public static void main(String[] args) {
        
        SortedMap<Integer, String> map = new TreeMap<>();
        // its an interface 
        NavigableMap<Integer, String> map1 = new TreeMap<>();
        //nuls are not alloewd here 
        // sort automatically 
        //null valuse are allowed 
        map.put(1,"Ismail" );
        
        map.put(10,"Noama" );
        map.put(3,"Adedh" );
        map.put(4,"Aman" );
        map.put(5,"Abrar" );
        
        map.remove(1);
        System.out.println(map);
        System.out.println(map.containsValue("Ismail"));
        System.out.println(map.containsKey(4));
     };
    }

