//Problem statement
//Print the following pattern for the given number of rows.
//
//Pattern for N = 4
//   1
//  232
// 34543
//4567654
//
//The dots represent spaces.
         
package Pattern2;

import java.util.Scanner;

public class TriangleOfNumbers {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		int i =1;
		while(i<=n) {
			//  for space
			int j =1;
			while(j<=n-i) {
				
			System.out.print(" ");
			j++;
			}
			//  for first triangle
			j=1;
			while(j<=i) {
				
				System.out.print(i+j-1);
			j++;
				
			} 
			// for remaining part
         	j=1;
			 int o = 2*i-2;
			while(j<i) {
				
				System.out.print(o);
				j++;
				o--;
			}
			
			System.out.println();
			i++;
			
			}
			
			
		}

	}

