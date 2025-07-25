//Problem statement
//Given a decimal number (integer N), convert it into binary and print.

package OperatorsAndForLoop;

import java.util.Scanner;

public class Assignment5_DecimalToBinary {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		
		if(n==0) {
			System.out.println("0");
		} else {
		
		int pv = 1;  
		int answer = 0; 
		String str = "";
		while(n!=0) {
			
             answer = n%2;
             n = n/2;
 			pv = pv * pv;
		
 			str += Interger.toString(answer); // we store answer value in string.
 			
 			

		}
		for(int i = str.length()-1; i>=0; i--) {    // str.length = we are reading str from reverse side i.e 00101 = 10100
			
			System.out.print(str.charAt(i));
		}
		
		}
		
}
	}
