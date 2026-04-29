package Map;

import java.util.*;

public class HashMaps {
    public static void main(String[] args) {
        Map<Integer , String> map = new HashMap<>();
        // order not maintained 
        //data stored in the  key- value 
        //keys are uniq one null is allowed 
        // valuse are duplicats 
        map.put(1,"Ismail" );
        map.put(null,"Ismail" );
        map.put(2,"Noama" );
        map.put(3,"Adedh" );
        map.put(4,"Aman" );
        map.put(5,"Abrar" );
        
        map.remove(1);
        System.out.println(map);
        System.out.println(map.containsValue("Ismail"));
        System.out.println(map.containsKey(null));

    }
}
