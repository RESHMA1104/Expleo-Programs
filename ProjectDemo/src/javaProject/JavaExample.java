package javaProject;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
public class JavaExample {
		public static void main(String[] args)throws ParseException {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter Movie ID : ");
			int id = sc.nextInt();
			sc.nextLine();
			System.out.println("Enter Movie Name : ");
			String name = sc.nextLine();
			System.out.println("Enter Movie Description : ");
			String des = sc.nextLine();
			System.out.println("Enter Movie Language : ");
			String lan = sc.nextLine();
			System.out.println("Enter Movie Genre : ");
			String gen = sc.nextLine();
			System.out.println("Enter Movie release date (dd/mm/yyyy) : ");
			String date = sc.next();
			SimpleDateFormat moviereleasedate = new SimpleDateFormat("dd/MM/yyyy");
			Date moviedate = moviereleasedate.parse(date);
			System.out.println("Enter Movie seat cost : ");
			float cost = sc.nextFloat();
			System.out.println("ENTERED MOVIE DETAILS ARE");
			System.out.println("Movie ID : "+id);
			System.out.println("Movie Name : "+name);
			System.out.println("Movie Description : "+des);
			System.out.println("Movie Language : "+lan);
			System.out.println("Movie Genre : "+gen);
			System.out.println("Movie release date : "+date);
			System.out.println("Movie Seat Cost : "+cost);
		}
	}