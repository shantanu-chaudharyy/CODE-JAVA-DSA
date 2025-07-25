package Pattern2;

import java.util.Scanner;

public class Parrallelogram1 {

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
