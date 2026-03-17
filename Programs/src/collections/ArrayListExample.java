package collections;
import java.util.*;
public class ArrayListExample{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many names do you want to input? ");
        int n = sc.nextInt();
        sc.nextLine(); 
        ArrayList<String> names = new ArrayList<>();
        // Input names
        for (int i = 1; i <= n; i++) {
            System.out.print("Enter name #" + i + ": ");
            String name = sc.nextLine();
            names.add(name);
        }
        // Display names longer than 5 characters
        System.out.println("\nNames longer than 5 characters:");
        for (String name : names) {
            if (name.length() > 5) {
                System.out.println(name);
            }
        }
        sc.close();
    }
}