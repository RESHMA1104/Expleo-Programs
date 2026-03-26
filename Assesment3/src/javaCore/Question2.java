package javaCore;
import java.util.*;
public class Question2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		if(s.length() >= 2) {
			System.out.println(s.substring(0,2));
		}
		else if(s.length() == 1) {
			System.out.println(s + "@");
		}
		else {
			System.out.println("@@");
		}
	}
}