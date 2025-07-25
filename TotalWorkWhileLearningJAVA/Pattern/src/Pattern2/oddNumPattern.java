package Pattern2;
import java.util.Scanner;

public class oddNumPattern {

	
	
	    public static void printPattern(int n) {
	        if (n < 0 || n > 50) {
	            System.out.println("Invalid input");
	            return;
	        }
	        
	        int start = 1;
	        for (int i = 0; i < n; i++) {
	            int num = start;
	            for (int j = 0; j < n; j++) {
	                System.out.print(num);
	                num += 2;
	                if (num > 9) {
	                    num -= 9;
	                }
	            }
	            System.out.println();
	            start += 2;
	            if (start > 9) {
	                start -= 9;
	            }
	        }
	    }

	    public static void main(String[] args) {
	        // Sample Input 1
	        System.out.println("Sample Output 1:");
	        printPattern(3);

	        // Sample Input 2
	        System.out.println("\nSample Output 2:");
	        printPattern(5);
	    }
	}
