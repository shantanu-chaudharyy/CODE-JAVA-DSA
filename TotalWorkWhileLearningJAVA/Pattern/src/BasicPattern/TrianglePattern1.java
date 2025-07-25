package BasicPattern;

import java.util.Scanner;

public class TrianglePattern1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
	int	i=1;
		while(i<=n) {
			int j =1 ;
			int startingNum = i;
			while (j<=i) {
				System.out.print(startingNum);
				startingNum++;
				j++;
				
			}
			System.out.println();
			i++;
		}

	}

}
