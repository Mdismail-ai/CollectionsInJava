package Map;
 import java.util.*;
public class LinkedHashMaps {
    public static void main(String[] args) {
        HashMap<Integer,String> map =new  LinkedHashMap<>();
        Map<Integer,String> map1 =new  LinkedHashMap<>();
        // order is maitained 
        // data stored in the  key- value 
        // keys are uniq one only one null is allowed 
        // valuse are duplicats 
        map.put(1,"Ismail" );
        map.put(null,"Ismail" );
        map.put(2,"Noama" );
        map.put(3,"Adedh" );
        map.put(4,"Aman" );
        map.put(5,"Abrar" );
        System.out.println(map);
        System.out.println(map1);

    }
}
