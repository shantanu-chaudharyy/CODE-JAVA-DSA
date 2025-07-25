package BasicPattern;

import java.util.Scanner;

public class Roughhhh {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		String str = scan.next();
		
		int i = 1;
		while(i<=n) {
			int j=1;
			while(j<=i) {
				
				System.out.println(j + ":" + " " + str);
				j++;
			}
			i++;
		}
	}
		
	
}
