//Problem statement
//Create a function that determines whether a given number N belongs to the Fibonacci sequence. 
//If N is found in the Fibonacci sequence, the function should return true; otherwise, it should return false.

package FunctionVariablesAndTheirScope;

import java.util.Scanner;

public class FibonacciMember {

	
		public static boolean checkMember(int n) {
			if (n<=1) {
				return true;
			}

			
			int a = 0;
			int b = 1;
			int c=0;
			
			int i = 0;
			while(a+b<=n) {
				
				 c = a+b;
//				System.out.println(c);
				a=b;
				b=c;
				if(b==n) {
				    return true;
				}
			}
				return false;
			}
			

		

			public static void main(String[] args) {
				Scanner s = new Scanner(System.in);
				int n = s.nextInt();
				System.out.println(checkMember(n));
			}

	}