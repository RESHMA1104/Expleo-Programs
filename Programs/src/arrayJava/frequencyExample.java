package arrayJava;
import java.util.Scanner;

public class frequencyExample {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        boolean[] visited = new boolean[n]; // to track counted elements

        System.out.println("Enter elements:");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for(int i = 0; i < n; i++) {

            if(visited[i] == true)
                continue;

            int count = 1;

            for(int j = i + 1; j < n; j++) {
                if(arr[i] == arr[j]) {
                    count++;
                    visited[j] = true;
                }
            }

            System.out.println(arr[i] + " occurs " + count + " times");
        }

        sc.close();
    }
}
