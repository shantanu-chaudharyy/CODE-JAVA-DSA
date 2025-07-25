//Problem statement
//Write a program that asks the user for a number N and a choice C. 
//And then give them the possibility to choose between computing the sum 
//and computing the product of all integers in the range 1 to N (both inclusive).
//
//If C is equal to -
// 1, then print the sum
// 2, then print the product
// Any other number, then print '-1' (without the quotes)

package OperatorsAndForLoop;

import java.util.Scanner;

public class Assignment1_SumOrProduct {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
    	int C = scan.nextInt();
		
		int i =1;
		int sum = 0;
		int Multiply = 1;
		while(i<=N) {
			//		for addition
			if(C==1) {
				sum = sum + i;
			}
			 	
			// for multiplication		
			if (C==2)  {				
				Multiply = Multiply*i;
			}
			i++;
		}
		if(C==1) {
			System.out.println(sum);
		}else if(C==2) {
			System.out.println(Multiply);
		}else {
			System.out.println(-1);
		}
	}
	
	}
