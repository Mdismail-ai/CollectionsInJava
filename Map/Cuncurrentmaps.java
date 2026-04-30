package Map;

 import java.util.concurrent.ConcurrentHashMap;
 import java.util.concurrent.ConcurrentMap;
public class Cuncurrentmaps{
public static void main(String[] args) {
    // Thread-safe
    // Allows safe concurrent reads/writes
    // ConcurrentMap is a interface
    ConcurrentMap<Integer ,String> map = new ConcurrentHashMap<Integer,String>();
    map.put(1, "One");
    map.putIfAbsent(1, "New One"); // won't overwrite

        System.out.println(map);
}
}

