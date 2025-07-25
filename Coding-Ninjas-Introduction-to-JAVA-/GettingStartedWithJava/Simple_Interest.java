//Problem statement
//Take the principal amount, rate of interest, and the time period as input and calculate the Simple Interest.
//
//Note: Print the answer as integer value.


package GettingStartedWithJava;

import java.util.Scanner;

public class Simple_Interest {

	public static void main(String[] args) {
		
			Scanner scan = new Scanner(System.in);
			int P = scan.nextInt();
			double R = scan.nextDouble();
			int T = scan.nextInt();

			int S = (int) (P*R*T)/100;

			System.out.println(S);
				}
			}