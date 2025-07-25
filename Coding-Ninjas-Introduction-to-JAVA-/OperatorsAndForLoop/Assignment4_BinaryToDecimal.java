//Problem statement
//Given a binary number as an integer N, convert it into decimal and print.

package OperatorsAndForLoop;

import java.util.Scanner;

public class Assignment4_BinaryToDecimal {
	public static void main(String[] args) {
			

			Scanner scan = new Scanner(System.in);
			int n = scan.nextInt();
			
			int pv = 1;  
			int answer = 0;                                         
			while(n!=0) {
				
				int lastDigit = n%10;
				answer = answer + lastDigit * pv;
				
				n = n/10;
				pv*=2;
			}
			System.out.println(answer);
		}

	}