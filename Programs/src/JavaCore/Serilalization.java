package JavaCore;
import java.io.*;
class Employee implements Serializable {
    public int empId;
    public String empName;
    // Parameterized constructor
    public Employee(int id, String name) {
        this.empId = id;
        this.empName = name;
    }
}
public class Serilalization {
    public static void main(String[] args) {
        Employee object = new Employee(1, "Ram");
        String filename = "file.ser";
        // Serialization
        try {
            FileOutputStream file = new FileOutputStream(filename);
            ObjectOutputStream out = new ObjectOutputStream(file);
            out.writeObject(object);
            out.close();
            file.close();
            System.out.println("Object has been serialized");
        }
        catch(IOException e) {
            System.out.println("IOException is caught: " + e);
        }
        Employee object1 = null;

        // Deserialization
        try {
            FileInputStream file = new FileInputStream(filename);
            ObjectInputStream in = new ObjectInputStream(file);

            object1 = (Employee) in.readObject();

            in.close();
            file.close();

            System.out.println("Object has been deserialized");
            System.out.println("Employee Id = " + object1.empId + 
                               " Employee Name = " + object1.empName);
        }
        catch(IOException e) {
            System.out.println("IOException is caught: " + e);
        }
        catch(ClassNotFoundException e) {
            System.out.println("ClassNotFoundException is caught: " + e);
        }
    }
}