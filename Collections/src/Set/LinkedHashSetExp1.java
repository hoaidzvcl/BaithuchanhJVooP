package Set;

import java.util.Set;
import java.util.LinkedHashSet;

public class LinkedHashSetExp1 {
    public static void main(String[] args) {
         Set<String> linkedHashSet = new LinkedHashSet<>();
         linkedHashSet.add("Java");
         linkedHashSet.add("C++");
         linkedHashSet.add("Java");
         linkedHashSet.add("PhP");
         for (String sc : linkedHashSet) {
             System.out.println(sc);
        }
    }
   
}