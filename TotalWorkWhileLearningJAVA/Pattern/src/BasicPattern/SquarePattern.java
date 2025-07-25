package BasicPattern;

import java.util.Scanner;

public class SquarePattern {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int n =scan.nextInt();

		int i = 1;
		while( i<=n) {
	int j = 1;
	while(j<=n) {
	System.out.print(i); 
	j++;
	}
	System.out.println();
	i++;

		}
		System.out.println();
		System.out.println();
		
	 i = 1;
		while( i<=n) {
	int j = 1;
	while(j<=n) {
	System.out.print(j); 
	j++;
	}
	System.out.println();
	i++;
	
	
		}
		
		 i = 1;
			while( i<=n) {
		int j = 1;
		while(j<=n) {
		System.out.print(n); 
		j++;
		}
		System.out.println();
		i++;	
			}
		}

	}
