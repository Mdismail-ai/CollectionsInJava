package Map;
import java.util.*;
public class WeakHashMaps {
    public static void main(String[] args) {
        
        Map<Integer,String> map =new  WeakHashMap<>();
        Map<Object,String> map1 =new  WeakHashMap<>();
          //Automatic removal of entries when keys are no longer strongly referenced
          //Uses weak references for keys (not strong references like HashMap)
          //Entries are removed by Garbage Collector (GC) automatically
          //Values are strongly referenced (only keys are weak)
          
        map.put(1,"Ismail" );
        map.put(null,"Ismail" );
        map.put(2,"Noama" );
        map.put(3,"Adedh" );
        map.put(4,"Aman" );
        map.put(5,"Abrar" );
        System.out.println(map);
        System.out.println(map1);


        
//working of the weak hash map 
        Object a = new String("K-1");
        Object b = new String("K-2");
        map1.put(a,"v-1");
        map1.put(b,"v-1");
        a = null ;

         System.gc();

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(8000);
                } catch (Exception e) {
                   System.err.println(e);
                }
               
            }
        };
        System.out.println(map1);
        
    }
}
