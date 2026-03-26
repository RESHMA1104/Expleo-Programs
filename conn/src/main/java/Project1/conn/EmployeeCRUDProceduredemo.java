package Project1.conn;

import java.util.Scanner;

public class EmployeeCRUDProceduredemo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        EmployeeDAO dao = new EmployeeDAO();

        int choice;

        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Insert Employee");
            System.out.println("2. Display All Employees");
            System.out.println("3. Update Employee Department");
            System.out.println("4. Delete Employee");
            System.out.println("5. Get Employee by ID");
            System.out.println("6. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Enter ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Department: ");
                    String dept = sc.nextLine();

                    dao.insertEmploy(new Employee(id, name, dept));
                    break;

                case 2:
                    dao.displayEmploy();
                    break;

                case 3:
                    System.out.print("Enter Employee ID: ");
                    int upId = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter New Department: ");
                    String newDept = sc.nextLine();

                    dao.updateDepartment(upId, newDept);
                    break;

                case 4:
                    System.out.print("Enter Employee ID to delete: ");
                    int delId = sc.nextInt();

                    dao.deleteEmploy(delId);
                    break;

                case 5:
                    System.out.print("Enter Employee ID: ");
                    int searchId = sc.nextInt();

                    dao.getEmployeeById(searchId);
                    break;

                case 6:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 6);

        sc.close();
    }
}