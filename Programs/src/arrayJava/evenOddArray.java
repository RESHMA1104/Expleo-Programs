package arrayJava; 
public class evenOddArray { 
    public static void main(String[] args) { 
        int[] even = new int[5]; 
        int[] odd = new int[5]; 
        int eIndex = 0; 
        int oIndex = 0; 
        int evenSum = 0; 
        int oddSum = 0; 
        for(int i = 1; i <= 10; i++) { 
            if(i % 2 == 0) { 
                even[eIndex++] = i; 
                evenSum += i; 
            } 
            else 
            { 
                odd[oIndex++] = i; 
                oddSum += i; 
            } 
        } 
        System.out.print("Even Numbers: "); 
        for(int num : even) { 
            System.out.print(num + " "); 
        } 
        System.out.println("\nEven Sum = " + evenSum); 
        System.out.print("Odd Numbers: "); 
        for(int num : odd) { 
            System.out.print(num + " "); 
        } 
        System.out.println("\nOdd Sum = " + oddSum);
    } 
}
