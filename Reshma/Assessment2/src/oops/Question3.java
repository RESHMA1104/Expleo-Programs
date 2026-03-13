package oops;
class Employee{
	int employeeId;
	String name;
	String designation;
	double salary;
	public Employee(int employeeId, String name, String designation, double salary) {
		this.employeeId = employeeId;
		this.name = name;
		this.designation = designation;
		this.salary = salary;
	}
	public void displayInfo() {
		System.out.println("Employee ID : "+employeeId);
		System.out.println("Name : "+name);
		System.out.println("Designation : "+designation);
		System.out.println("Salary : "+salary);
	}
	public void increaseSalary(double percentage) {
		salary = salary + (salary * percentage / 100);
		System.out.println("Salary Increased" + percentage +"%");	
	}
	public void increaseSalary(double percentage, double bonus) {
		salary = salary + (salary * percentage / 100);
		System.out.println("Salary Increased : " + percentage +"% bonus :"+bonus);	
	}
}
public class Question3 {
	public static void main(String[] args) {
		Employee emp = new Employee(01, "Reshma", "Tester", 10000);
        System.out.println("Initial Employee Details:");
        emp.displayInfo();
        emp.increaseSalary(10);
        System.out.println("After Percentage Increased:");
        emp.displayInfo();
        emp.increaseSalary(5, 2000);
        System.out.println("After Percentage + Bonus Increased:");
        emp.displayInfo();

	}
}