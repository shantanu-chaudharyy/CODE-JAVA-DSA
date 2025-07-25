package Pattern2;

import java.util.Scanner;

public class roughhttt {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		float o = n/2;
		int d = (int) (Math.round(o+1));
		
		int i =1;
		while(i<=d) {
			
		int	j=1;
			while(j<=i) {
				System.out.print(j);
				j++;
			
			}
			j =1;
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
