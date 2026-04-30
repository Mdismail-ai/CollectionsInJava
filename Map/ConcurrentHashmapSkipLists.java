package Map;

import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ConcurrentSkipListMap;

public class ConcurrentHashmapSkipLists {
    public static void main(String[] args) {
        ConcurrentMap<Integer,String > map = new ConcurrentSkipListMap<>();
        // thread safe
        // sorted manners  
        // nulls are not alloed 
        //probablistic data strure 
        // fast acesss
        map.put(1, "Ismail");
        map.put(2, "Ismail");
        map.put(3, "Ismail");
        map.put(4, "Ismail");
        map.put(null, "Ismail");
        map.put(5, null);

        System.out.println(map);
    }
}
