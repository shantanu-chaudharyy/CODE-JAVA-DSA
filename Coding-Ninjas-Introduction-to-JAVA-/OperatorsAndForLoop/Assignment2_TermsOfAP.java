//Problem statement
//Write a program to print first x terms of the series 3N + 2 which are not multiples of 4.

package OperatorsAndForLoop;

import java.util.Scanner;

public class Assignment2_TermsOfAP {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	int	n =sc.nextInt();
	
	int x = 1; 
	int sum = 0;
	int i = 1;
	
		while(x<=n)
		{
			sum=(3*i)+2;
			if(sum%4!=0)
			{
				
			
		System.out.print(sum+" ");
			x=x+1;
			}
			i=i+1;
		}
			
	}
}