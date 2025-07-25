package Pattern1;

import java.util.Scanner;

public class AlphabetPattern2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		int i =1;
		while(i<=n) {
			
			int j = 1;
			char StartingNum = (char) ('A' + i - 1);
			while(j<=n) {
				System.out.print((char)(StartingNum));
				j++;
				StartingNum++;
			}
			System.out.println();
			i++;
		}
		
		
		
		
	}
}