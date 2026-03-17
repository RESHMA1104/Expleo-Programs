package JavaCore;
import java.util.*;
class Mobile implements Comparable<Mobile> {
    private String name;
    private int ram;
    private int price;
    public Mobile(String name, int ram, int price) {
        this.name = name;
        this.ram = ram;
        this.price = price;
    }
    public String getName() {
        return name;
    }
    public int getRam() {
        return ram;
    }
    public int getPrice() {
        return price;
    }
    // compareTo method (sorting based on price)
    @Override
    public int compareTo(Mobile m) {
        return this.price - m.price;   // ascending order
    }
}
public class ComparableExample {
    public static void main(String[] args) {
        List<Mobile> mobilelist = new ArrayList<>();
        mobilelist.add(new Mobile("Redmi", 16, 800));
        mobilelist.add(new Mobile("Apple", 8, 1000));
        mobilelist.add(new Mobile("Samsung", 4, 600));
        Collections.sort(mobilelist);
        System.out.println("Mobiles after sorting:");
        System.out.println("Name\tRam\tPrice");
        for (Mobile mb : mobilelist) {
            System.out.println(mb.getName() + "\t" + mb.getRam() + "\t" + mb.getPrice());
        }
    }
}