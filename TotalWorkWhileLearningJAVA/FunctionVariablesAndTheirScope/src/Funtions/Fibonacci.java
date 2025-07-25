package Funtions;

import java.util.Scanner;

public class Fibonacci {
	
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
//			System.out.println(c);
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