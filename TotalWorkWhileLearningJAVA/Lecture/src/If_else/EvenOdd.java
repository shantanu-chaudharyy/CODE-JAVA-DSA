package If_else;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		
		if (a>=b && a>=c) {
			
			System.out.println(a);
			 return;
		}
		if ( b>=a && b>=c ) { 
			
			System.out.println(b);
			
		} else { 
			System.out.println(c);
		}
		 
	
		
	}

}
