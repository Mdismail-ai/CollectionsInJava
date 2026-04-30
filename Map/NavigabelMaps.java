package Map;
import java.util.*;
public class NavigabelMaps {
    public static void main(String[] args) {
        NavigableMap<Integer, String> map = new TreeMap<>();
         map.put(1,"Ismail" );
        
        map.put(10,"Noama" );
        map.put(3,"Adedh" );
        map.put(4,"Aman" );
        map.put(5,"Abrar" );
        // find closest things fast 
        map.remove(1);
        System.out.println(map);
        System.out.println(map.containsValue("Ismail"));
    }
}
