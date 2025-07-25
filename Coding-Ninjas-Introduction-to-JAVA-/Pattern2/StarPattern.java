//Problem statement
//Print the following pattern
//
//Pattern for N = 4
//   *
//  ***
// *****
//******* 
//
//Hint
//As taught in the video, you just have to modify the code so that instead of printing numbers, it should output stars ('*').
//The dots represent spaces.

package Pattern2;

import java.util.Scanner;

public class StarPattern {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		int i =1;
		while(i<=n) {
			
			int j=1;
			while(j<=n-i) {
				System.out.print(" ");
				j++;
			}
			j=1;
			while(j<=i)
			{
				System.out.print("*");
				j++;
			}
			j=1;
			while(j<=i-1) {
				System.out.print("*");
				j++;
			}
			System.out.println();
			i++;
		}

	}

}
