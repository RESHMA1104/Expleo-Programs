package arrayJava;

public class specificElement {
    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50};  // predefined array
        int k = 30;                        // predefined key

        boolean found = false;

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == k) {
                found = true;
                break;
            }
        }

        if(found) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}
