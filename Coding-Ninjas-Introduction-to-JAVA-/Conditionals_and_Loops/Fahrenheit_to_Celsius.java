//Problem statement
//Given three values - Start Fahrenheit Value (S), End Fahrenheit value (E) and Step Size (W), you need to convert all Fahrenheit values from Start to End at the gap of W, into their corresponding Celsius values and print the table.
//
//Hint : Use type casting

package Conditionals_and_Loops;

import java.util.Scanner;

public class Fahrenheit_to_Celsius {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int S = scan.nextInt();
		int E = scan.nextInt();
		int W = scan.nextInt();

		while (S<=E) {
			
			int c = 5*(S-32)/9;
					
			System.out.println(S+" "+ c);
S=S+W;
		}


			}

		}
