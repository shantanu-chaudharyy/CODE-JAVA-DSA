package Funtions;

import java.util.Scanner;

public class Prime2toN {
	
public static boolean IsPrime(int n) {
		
		int d =2;
		while(d<n) {
			
			if(n%d==0) {
				
				return false;				
			}
			d++;
			
		} 
		return true;
		
	}
	
public static void Prime2toN(int n) {
	
	for(int i =2 ; i<=n; i++ ) {
		
		boolean isIPrime = IsPrime(i);
		if(isIPrime) {
			System.out.println(i);
		}
	}
	
	
}


	public static void main(String[] args) {
		Prime2toN(100);
		
	}

}
