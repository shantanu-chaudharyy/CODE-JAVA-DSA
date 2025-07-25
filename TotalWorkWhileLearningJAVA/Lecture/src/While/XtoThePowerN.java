package While;

import java.util.Scanner;

public class XtoThePowerN {

	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);
	        int x = scan.nextInt();
	        int n = scan.nextInt();

	        int count = 0;
	        int ans = 1;
	        
	        while (count<n) {
	        	
	        	ans = ans*x;
	        		count++;	
	        }
	System.out.println(ans);
	}

}

//Scanner scan = new Scanner(System.in);
//int x = scan.nextInt();
//int n = scan.nextInt();
//
//int a = (int)Math.pow(x, n);
//System.out.println(a);