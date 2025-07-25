package Funtions;

import java.util.Scanner;

public class NcR_Using_Funtion {

	
	public static int factorial(int n) {
		
		int ans = 1;
		for(int i = 1; i<=n; i++) {
			
			ans = ans * i;
			
		}
		   return ans;
		
		
	}
	
	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int r = scan.nextInt();
		
		int num = factorial(n);
		int din1 = factorial(r);
		int din2 = factorial(n-r);
		
		int ans = num/(din1*din2);
		System.out.println(ans);
		
		
		
		
	}

}
