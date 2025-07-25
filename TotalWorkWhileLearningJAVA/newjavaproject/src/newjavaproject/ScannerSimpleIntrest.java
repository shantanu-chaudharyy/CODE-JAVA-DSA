package newjavaproject;

import java.util.Scanner;

public class ScannerSimpleIntrest {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Principle amount");
		int P = scan.nextInt();
		
	    System.out.println("Rate of intrest");
		int R = scan.nextInt();
		
		System.out.println("Time");
		int T = scan.nextInt();
		
		System.out.println("Simple intrest");
		int SimpleIntrest = (P*R*T)/100;
		
		System.out.println(SimpleIntrest);
		
	}

}
