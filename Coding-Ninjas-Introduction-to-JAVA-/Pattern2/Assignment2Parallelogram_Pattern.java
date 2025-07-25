//Problem statement
//Write a program to print parallelogram pattern for the given N number of rows.
//
//For N = 4
//****
// ****
//  ****
//   ****
//
//The dots represent spaces.

package Pattern2;

import java.util.Scanner;

public class Assignment2Parallelogram_Pattern {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		int i =1;
		while(i<=n) {
			
			int j =1;
			while(j<=i-1) {
				System.out.print(" ");
				j++;
			}
			j = 1;
			while(j<=n) {
				System.out.print("*");
				j++;
				
			}
			System.out.println();
			i++;
		} 
		}

	}
