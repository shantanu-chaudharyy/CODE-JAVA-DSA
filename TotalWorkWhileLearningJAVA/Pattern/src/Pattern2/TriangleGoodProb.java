package Pattern2;

import java.util.Scanner;

public class TriangleGoodProb {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		int i =1;
		while(i<=n) {
			
			int j =1;
			while(j<=n-i) {
				
			System.out.print(" ");
			j++;
			}
			j=1;
			while(j<=i) {
				
				System.out.print(i+j-1);
			j++;
				
			} 
         	j=1;
         	int Start = 2*i-2;
//         	when we have even no. we use 2*i-2.
			while(j<i) {
				
				System.out.print(Start);
				j++;
				Start--;
			}
			
			System.out.println();
			i++;
			
			}
			
			
		}

	}

