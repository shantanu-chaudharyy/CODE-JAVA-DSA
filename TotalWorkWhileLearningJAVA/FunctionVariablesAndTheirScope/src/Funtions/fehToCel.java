//Sample Input 1:
//0 
//100 
//20
//Sample Output 1:
//0   -17
//20  -6
//40  4
//60  15
//80  26
//100 37
package Funtions;

import java.util.Scanner;

public class fehToCel {

	public static void printFahrenheitTable(int start, int end, int step) {
		
		int i =1;
		int ans = 0;
		while(start <= end) {
			
			ans = (5*(start-32))/9; 
			
			System.out.println(start + " " + ans);
			
			start = start+step;
			
			} 
	
		}
		
		public static void main(String[] args) {

			Scanner s =  new Scanner(System.in);
			
			int start = s.nextInt();
			int end = s.nextInt();
			int step = s.nextInt();
		
			printFahrenheitTable(start, end, step);
					
		}

	}
