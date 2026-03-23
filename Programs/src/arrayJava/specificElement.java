package arrayJava;
import java.util.*;
public class specificElement {
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in); 
        System.out.println("Enter number of elements :"); 
        int n = sc.nextInt(); 
        int[] arr = new int[n]; 
        for(int i=0; i<n; i++) { 
            arr[i] = sc.nextInt(); 
        } 
        System.out.println("Enter key : "); 
        int k = sc.nextInt(); 
        for(int i=0; i<n; i++) { 
            if(arr[i] == k) { 
                System.out.println("True"); 
                return; 
            } 
        } 
        System.out.println("False"); 
    } 
}
