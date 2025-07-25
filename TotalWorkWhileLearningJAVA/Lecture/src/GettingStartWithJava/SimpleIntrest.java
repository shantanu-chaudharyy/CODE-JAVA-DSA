package GettingStartWithJava;

import java.util.Scanner;

public class SimpleIntrest {

	public static void main(String[] args) {
Scanner scan = new Scanner(System.in);

System.out.println("Enter Principle Amount");
int P = scan.nextInt();

System.out.println("Enter Rate");
int R = scan.nextInt();

System.out.println("Enter Time");
int T = scan.nextInt();

System.out.println("Simple Intrest");
int S = (P*R*T)/100;

System.out.println(S);
	}

}
