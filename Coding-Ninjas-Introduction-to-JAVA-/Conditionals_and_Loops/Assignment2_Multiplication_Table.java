//Problem statement
//Write a program that generates a multiplication table for a given integer.



package Conditionals_and_Loops;

import java.util.Scanner;

public class Assignment2_Multiplication_Table {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();

		int i = 1;
		while(i<=10) {

		System.out.println(n*i);	
				i++;
		}	

			}
		}
			