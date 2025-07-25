//Problem statement
//Print the following pattern for the given number of rows.
//
//Note: N is always odd.
//
//
//Pattern for N = 5
//   *
//  ***
// *****
//  ***
//   *
//The dots represent spaces.

package Pattern2;

import java.util.Scanner;

public class DimondOfStars {
	 public static void main(String[] args) {
		    Scanner scan = new Scanner(System.in);
				int n = scan.nextInt();
				float o = n/2;
				int d = (int) (Math.round(o+1));
				
				int i =1;
				while(i<=d) {
//				upper triangle	first space;
					int j =1;
					while(j<=d-i) {
						
						System.out.print(" ");
						j++;
					}
//					left triangle
					j=1;
					while(j<=i) {
						System.out.print("*");
						j++;
					}
//					right triangle
					j =1;
					
					while(j<=i-1) {
						System.out.print("*");
						j++;
						
					}			
					System.out.println();
					i++; }
//					lower triangle
//					
				i =1;
				while(i<=d-1) {
//					lower triangle space
					int j=1;
					while(j<=i) { 
						System.out.print(" ");
						j++;
										
					}
//					lower triangle left star
					j=1;
					while(j<=d-i) {
						System.out.print("*");
						j++;
					}
//					rigth side star
					j=1;
					while(j<=d-i-1) {
						System.out.print("*");
						j++;
					}
					System.out.println();
					i++;
					
					
				}
			}

		}
		    
		    