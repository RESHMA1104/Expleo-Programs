package sql.mySql;
import java.sql.*;
import java.util.Scanner;
public class MenuDriven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
        	System.out.println("CRUD Operations:");
            System.out.println(" 1.Insert");
            System.out.println(" 2.Display ");
            System.out.println(" 3.Update ");
            System.out.println(" 4.Delete ");
			System.out.println("5.Exit ");
			System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter ID: ");
                    int id = sc.nextInt();
                    System.out.print("Enter Name: ");
                    String name = sc.next();
                    System.out.print("Enter Course: ");
                    String course = sc.next();
                    System.out.print("Enter Email: ");
                    String email = sc.next();
                    InsertDemo.insert(id, name, course, email);
                    break;
                case 2:
                    jdbc1.display();
                    break;

                case 3:
                    System.out.print("Enter Name: ");
                    String uname = sc.next();

                    System.out.print("Enter new Course: ");
                    String ucourse = sc.next();

                    System.out.print("Enter new Email: ");
                    String uemail = sc.next();

                    jdbc2.update(uname, ucourse, uemail);
                    break;

                case 4:
                    System.out.print("Enter Name: ");
                    String dname = sc.next();

                    jdbc3.delete(dname);
                    break;

                case 5:
                    System.exit(0);
            }
        }
    }
}