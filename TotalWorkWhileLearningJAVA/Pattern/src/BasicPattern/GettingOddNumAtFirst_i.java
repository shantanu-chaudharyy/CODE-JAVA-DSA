package BasicPattern;

import java.util.Scanner;

public class GettingOddNumAtFirst_i {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
	int n = scan.nextInt();
	int i =1;
	while(i<=n) {
		
	
//     	when we have even no. we use 2*i-2.
	      int j =1;
	      int Start = 2*i-2;
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