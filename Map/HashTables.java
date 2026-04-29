package Map;

import java.util.*;

public class HashTables {
    public static void main(String[] args) {
        Map<Integer , String> map = new Hashtable<>();
    
        // not key and valuse not aloes the null values 
        // thread safe  
        map.put(1,"Ismail" );
        //map.put(null,"Ismail" ); not alowed
        //map.put(1,null ); not alloes
        map.put(2,"Noama" );
        map.put(3,"Adedh" );
        map.put(4,"Aman" );
        map.put(5,"Abrar" );
        
        map.remove(1);
        System.out.println(map);
        System.out.println(map.containsValue("Ismail"));
        System.out.println(map.containsKey(5));
    }
}
