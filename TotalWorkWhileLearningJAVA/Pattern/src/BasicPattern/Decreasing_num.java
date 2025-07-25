package BasicPattern;

import java.util.Scanner;

public class Decreasing_num {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		int i =1;
		while(i<=n) {
			
	int 	j =1;
		int start = i - 1;
		while(j<=i-1) {
			System.out.print(start);
			j++;
			start--;
		}
		System.out.println();
		i++;
	}
	}
}