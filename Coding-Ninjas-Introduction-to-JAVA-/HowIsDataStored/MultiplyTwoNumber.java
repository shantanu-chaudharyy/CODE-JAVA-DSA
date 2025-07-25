//Problem statement
//Write a code which takes two integers "F1" and "F2" as inputs and print their product .


package HowIsDataStored;

import java.util.Scanner;

public class MultiplyTwoNumber {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		long f1 = scan.nextLong();
		long f2 = scan.nextLong();

		long a = f1*f2;

		System.out.println(a);
			
			}
		}