//Problem statement
//Write a program to find x to the power n (i.e. x^n). Take x and n from the user. You need to print the answer.
//
//Note : For this question, you can assume that 0 raised to the power of 0 is 1



package Conditionals_and_Loops;

import java.util.Scanner;

public class Assignment5_FindPowerOfTheNumber {

	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);
	        int x = scan.nextInt();
	        int n = scan.nextInt();

	        int a = (int)Math.pow(x, n);
	        System.out.println(a);
	}

}

     