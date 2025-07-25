
package While;

import java.util.Scanner;

public class Rught2 {

	public static void main(String[] args) {
		 
		
		        Scanner scanner = new Scanner(System.in);

		        // Read the input number
		        int n = scanner.nextInt();

		        // Initialize variables
		        int i = 2;
		        boolean foundFactors = false;

		        // Find factors using while loop
		        while (i <= n / 2) {
		            if (n % i == 0) {
		                System.out.print(i + " ");
		                foundFactors = true;
		            }
		            i++;
		        }

		        // Check if factors were found
		        if (!foundFactors) {
		            System.out.println("-1");
		        }
		    }
		}
