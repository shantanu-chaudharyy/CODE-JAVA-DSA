package If_else;

import java.util.Scanner;

public class OddEvenn {
 public static void main(String[] args) {
	 Scanner scan = new Scanner(System.in);
		
		int A = scan.nextInt();
		int rem = A % 2;
		
		if (rem == 0) {
			
			System.out.println("Even");
			
		} else {
			
			System.out.println("Odd");
		}
}
}
