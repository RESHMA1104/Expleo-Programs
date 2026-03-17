package collections;
import java.util.*;
public class SetExample {
    public static void main(String[] args) {
        Set<String> s = new HashSet<>();
        // Adding elements
        s.add("Java");
        s.add("Hello");
        s.add("Programming");
        s.add("World");
        String result = "";
        // Using iterator
        Iterator<String> it = s.iterator();
        while (it.hasNext()) {
            String value = it.next();
            System.out.println("Elements in the Set : " + value);
            result += value + " ";
        }
        System.out.println("Concatenated result: " + result.trim());
    }
}