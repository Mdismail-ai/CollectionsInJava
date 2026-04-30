package Sets;
import java.util.*;
public class EnumSets {
    public static void main(String[] args) {
            enum Day {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}
    // nulls are not allowes here 
    // faster 
    // only enum types are allowed here 
    // type safty 
    Set<Day> set =  EnumSet.of(Day.MONDAY);
    System.out.println(set);
    }
}