//Problem statement
//Given a number N, find its square root. You need to find and print only the integral part of square root of N.
//
//For eg. if number given is 18, answer is 4.

package OperatorsAndForLoop;

import java.util.Scanner;

public class Assignment6_SquareRoot {
public static void main(String[] args) {
		

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		int a = (int) Math.sqrt(n);
		System.out.println(a);
	}

}
