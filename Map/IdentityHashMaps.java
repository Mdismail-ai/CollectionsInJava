package Map;
import java.util.*;
public class IdentityHashMaps {
    public static void main(String[] args) {
     
        //HashMap<Integer, String> map = new IdentityHashMap<Integer, String>();

        IdentityHashMap<Object, String> map1 = new IdentityHashMap<Object, String>();
        //Map<Object, String> map= new HashMap<Object, String>();
        // Not thread-safe
        // Order not maintained
        // Uses reference equality (==) for keys
        // Does NOT allow null keys or null values
        // Works based on object identity (memory address)
        Object a = new String("K");
        Object b = new String("K");
        if(a.equals(b)){
            System.out.println(true);
        }
        map1.put(a,"v-1");
        map1.put(b,"v-1");
        
        System.out.println(map1);
        

    }
}
