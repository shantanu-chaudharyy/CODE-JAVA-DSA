//Problem statement
//Print the following pattern for the given N number of rows.
//
//Pattern for N = 5
//E
//ED
//EDC
//EDCB
//EDCBA

package Pattern1;

import java.util.Scanner;

public class ReverseCharPattern {

	public static void main(String[] args) {
		
			Scanner scan = new Scanner(System.in);
			int n = scan.nextInt();
			
			int i =1;
			while(i<=n) {
				
				int j = 1;
				char StartingNum = (char) ('A' + n - 1);
				while(j<=i) {
					
					System.out.print((char)(StartingNum));
					j++;
					StartingNum--;
				}
				System.out.println();
				i++;
			}
			
			
			
		}
	}