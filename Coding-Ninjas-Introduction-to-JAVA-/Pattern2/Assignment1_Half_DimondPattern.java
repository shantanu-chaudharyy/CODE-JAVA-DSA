//Problem statement
//Write a program to print N number of rows for Half Diamond pattern using stars and numbers
//
//Note : There are no spaces between the characters in a single line.

package Pattern2;

import java.util.Scanner;

public class Assignment1_Half_DimondPattern {

	public static void main(String[] args) {
		
		       Scanner scan = new Scanner(System.in);
		        int n = scan.nextInt();
		        System.out.println("*");

		        // Upper half of the diamond
		        int i = 1;
		        while (i <= n) {
		            System.out.print("*");
		            int j = 1;
		            while (j <= i) {
		                System.out.print(j);
		                j++;
		            }
		            j = i - 1;
		            while (j >= 1) {
		                System.out.print(j);
		                j--;
		            }
		            System.out.print("*");
		            System.out.println();
		            i++;
		        }

		        // Lower half of the diamond
		        i = n - 1; // Start from n-1 for the lower half
		        while (i >= 1) {
		            System.out.print("*");
		            int j = 1;
		            while (j <= i) {
		                System.out.print(j);
		                j++;
		            }
		            j = i - 1;
		            while (j >= 1) {
		                System.out.print(j);
		                j--;
		            }
		            System.out.print("*");
		            System.out.println();
		            i--;
		        }
		        System.out.println("*");
		    }
		}
