package Pattern1;

import java.util.Scanner;

public class AlphabetPattern1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		int i = 1;
		while(i<=n) {
			
			int j=1;
			while(j<=n) {
				
				 System.out.print((char)('A' + j - 1));
				j++;
			}
			System.out.println();
			i++;
		}

	}

}
