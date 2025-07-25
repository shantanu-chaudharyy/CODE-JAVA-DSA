package GettingStartWithJava;

import java.util.Scanner;

public class FehToCel {

	public static void main(String[] args) {
Scanner scan = new Scanner(System.in);

System.out.println("Enter Temperature");
int f = scan.nextInt();

System.out.println("Celcius");
int cel = (5*(f-32))/9;

System.out.println(cel);
	}

}
