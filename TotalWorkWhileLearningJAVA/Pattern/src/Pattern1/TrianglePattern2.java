package Pattern1;

import java.util.Scanner;

public class TrianglePattern2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		int i =1;
		while(i<=n) {
			
			int j = 1;
			int k =1;
			while(j<=i) {
				System.out.print(i - k + 1);
				j++;
				k++;
			}
			System.out.println();
			i++;
		}
	}

}
