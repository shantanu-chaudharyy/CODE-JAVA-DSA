package GettingStartWithJava;

import java.util.Scanner;

public class Logical {

	public static void main(String[] args) {
Scanner scan = new Scanner(System.in);

int a = scan.nextInt();
int b = scan.nextInt();
int c = scan.nextInt();
// && is used as and 
boolean isLargest = (a>=b) && (a>=c);

// || is used as or 
	System.out.println(isLargest);
	System.out.println((a>=b) || (a>=c));
	System.out.println(!(a>=b));
	}

}
