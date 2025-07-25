package Funtions;

import java.util.Scanner;

public class NcR {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int a = scan.nextInt();
		
		int num = 1;
		for(int i = 1; i<=n; i++) {
			
			num = num*i;
			
		}
		int din1 = 1;
		for(int i = 1; i<=a; i++) {
			
			din1 = din1*i;
		}
		int din2 = 1;
		for(int i = 1; i<=n-a; i++) {
			
			din2 = din2*i;
		}
		int ans = num/(din1*din2);
	System.out.println(ans);
	}

}
