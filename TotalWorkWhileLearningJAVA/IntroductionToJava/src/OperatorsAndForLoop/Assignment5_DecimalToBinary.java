//Problem statement
//Given a decimal number (integer N), convert it into binary and print.
//
//Note for C++ coders:
//Do not use the inbuilt implementation of "pow" function. 
//The implementation of that function is done for 'double's and 
//it may fail when used for 'int's, 'long's, or 'long long's. 
//Implement your own "pow" function to work for non-float data types. 
//The given input number could be large, 
//so the corresponding binary number can exceed the integer range.
//So you may want to take the answer as long for CPP and Java. 

package OperatorsAndForLoop;

import java.util.Scanner;

public class Assignment5_DecimalToBinary {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();

		if (n == 0) {
			System.out.println("0");
		} else {

			int pv = 1;
			int answer = 0;
			String str = "";
			while (n != 0) {

				answer = n % 2;
				n = n / 2;
				pv = pv * pv;

				str += Interger.toString(answer); // we store answer value in string.

			}
			for (int i = str.length() - 1; i >= 0; i--) { // str.length = we are reading str from reverse side i.e 00101
															// = 10100

				System.out.print(str.charAt(i));
			}

		}

	}
}
