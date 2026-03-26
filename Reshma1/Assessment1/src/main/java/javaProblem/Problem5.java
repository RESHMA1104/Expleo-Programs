package javaProblem;
import java.util.*;
public class Problem5 {
	public static int processScore(int score) {
	        int replace = -1;
	        if (score % 2 == 0) {
	            replace = 0;
	        }
	        if (score % 2 != 0) {
	            if (replace < 1) {
	                replace = 1;
	            }
	        }
	        if (score % 8 == 0) {
	            if (replace < 2) {
	                replace = 2;
	            }
	        }
	        if (score % 10 == 3) {
	            if (replace < 3) {
	                replace = 3;
	            }
	        }
	        if (score % 9 == 0) {
	            if (replace < 4) {
	                replace = 4;
	            }
	        }
	        return replace;
	    }
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        int[] originalScore = new int[100];   
	        int[] modifiedScore = new int[100];
	        int count = 0;
	        System.out.println("Enter the scores:");
	        while (true) {
	            int score = scanner.nextInt();
	            if (score < 0) {
	                break;
	            }
	            originalScore[count] = score;
	            modifiedScore[count] = processScore(score);
	            count++;
	        }
	        System.out.println("Scores before processing:");
	        for (int i = 0; i < count; i++) {
	            System.out.print(originalScore[i] + " ");
	        }
	        System.out.println("\nScores after processing:");
	        for (int i = 0; i < count; i++) {
	            System.out.print(modifiedScore[i] + " ");
	        }
	    }
	}