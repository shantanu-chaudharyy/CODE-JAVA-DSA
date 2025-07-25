//Problem statement
//Print the following pattern for the given N number of rows.
//
//Pattern for N = 4
//4444
//333
//22
//1

package Pattern2;

import java.util.Scanner;

public class InvertedNumberPattern {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		int i = 1;
		while(i<=n) {
			
			int j =1;
			
			while(j<=n-i+1) {
				
				System.out.print(n-i+1);
				j++;
				
			}
			System.out.println();
			i++;
		}

		}

	}
