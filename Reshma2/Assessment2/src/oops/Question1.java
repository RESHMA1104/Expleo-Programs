package oops;
import java.util.*;
class Customer {
    private int id;
    private String name;
    private char gender;
    public Customer(int id, String name, char gender) {
        this.id = id;
        this.name = name;
        this.gender = gender;
    }
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public char getGender() {
        return gender;
    }
    public String toString() {
        return name + "(" + id + ")";
    }
}
class Account {
    private int id;
    private Customer customer;
    private double balance = 0.0;
    public Account(int id, Customer customer, double balance) {
        this.id = id;
        this.customer = customer;
        this.balance = balance;
    }
    public int getId() {
        return id;
    }
    public Customer getCustomer() {
        return customer;
    }
    public double getBalance() {
        return balance;
    }
    public void deposit(double amount) {
        balance += amount;
        System.out.println("AMOUNT DEPOSITED SUCESSFULLY!!");
    }
    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("AMOUNT WITHDRAWN SUCCESSFULLY!!");
        } else {
            System.out.println("AMOUNT WITHDRAWN EXCEEDS THE CURRENT BALANCE!");
        }
    }
}
public class Question1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Customer c = new Customer(901233, "PETER", 'm');
        Account ac = new Account(3456, c, 0.0);
        System.out.println("ACCOUNT DETAILS");
        System.out.println("ACCOUNT_ID " + ac.getId());
        System.out.println("CUSTOMER_ID " + c.getId());
        System.out.println("CUSTOMER_NAME : " + c.getName());
        System.out.println("CUSTOMER_GENDER : " + c.getGender());
        System.out.println("ACCOUNT_BALANCE : " + ac.getBalance());
        int OPTION;
        do {
            System.out.println("PLEASE SELECT ONE OPTION FROM BELOW");
            System.out.println("1.WITHDRAW");
            System.out.println("2. DEPOSIT");
            System.out.println("3. CHECK BALANCE");
            System.out.println("4. EXIT");
            System.out.print("OPTION: ");
            OPTION = sc.nextInt();
            switch (OPTION) {
                case 1:
                    System.out.print("ENTER AMOUNT TO WITHDRAW: ");
                    double withdrawamount = sc.nextDouble();
                    ac.withdraw(withdrawamount);
                    break;
                case 2:
                    System.out.print("ENTER AMOUNT TO DEPOSIT: ");
                    double depositamount = sc.nextDouble();
                    ac.deposit(depositamount);
                    break;
                case 3:
                    System.out.println("CURRENT BALANCE: " + ac.getBalance());
                    break;
                case 4:
                    System.out.println("THANK YOU FOR BANKING WITH US!!");
                    break;
                default:
                    System.out.println("INVALID OPTION!");
            }

        } while (OPTION != 4);

       
    }
}