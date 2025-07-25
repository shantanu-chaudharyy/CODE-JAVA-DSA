package GettingStartWithJava;

import java.util.Scanner;

public class SimpleIntrest1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int P = scan.nextInt();
		double R = scan.nextDouble();
		int T = scan.nextInt();

		int S = (int) (P*R*T)/100;

		System.out.println(S);
	}

}
