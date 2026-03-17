package JavaCore;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Mobiles implements Comparable<Mobiles> {
	private String name;

	private int ram;

	private int price;

	public Mobiles(String name, int ram, int price) {
		super();
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

	public void setName(String name) {
		this.name = name;
	}

	public void setRam(int ram) {
		this.ram = ram;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public int compareTo(Mobiles o) {
		// TODO Auto-generated method stub
		if (this.ram < o.getRam()) {
			return 1;
		}

		return -1;
	}

}

class PrieCompare implements Comparator <Mobiles>
{
	public int compare(Mobiles m1 , Mobiles m2 )
	{
		if (m1.getPrice() < m2.getPrice()) return -1;
		
		if (m1.getPrice() > m2.getPrice()) return 1;
		
		return 0;
	}
}

class NameCompare implements Comparator <Mobiles>
{
	public int compare (Mobiles m1 , Mobiles m2)
	{
		return m1.getName ().compareTo(m2.getName());
	}
}

public class ComparatorExample {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		List <Mobiles> list = new  ArrayList<>();
		
		list.add(new Mobiles ("Readmi",16,8000));
		
		list.add(new Mobiles ("Apple",8,100));
		
		list.add(new Mobiles ("Samsung",4,800));
		
		System.out.println("Sorted by price");
		
		PrieCompare priceCompare = new PrieCompare();
		
		Collections.sort(list , priceCompare);
		
		for (Mobiles mb : list)
		{
			System.out.println(mb.getName() + "\t" + mb.getRam() + "\t" + mb.getPrice());
		}

	}

}