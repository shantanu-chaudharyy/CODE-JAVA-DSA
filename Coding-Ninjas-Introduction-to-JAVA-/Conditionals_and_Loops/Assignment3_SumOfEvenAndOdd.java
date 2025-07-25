//Problem statement
//Write a program to input an integer 'n' and print the sum of all its even digits and the sum of all its odd digits separately.
//
//
//
//Digits mean numbers, not places! That is, if the given integer is "132456", even digits are 2, 4, and 6, and odd digits are 1, 3, and 5.
//
//Constraints
//0<= 'n' <=10000

package Conditionals_and_Loops;

import java.util.Scanner;

public class Assignment3_SumOfEvenAndOdd {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int num = s.nextInt();

		int evenSum = 0, oddSum = 0;

		while (num > 0) {
			int last = num % 10;
			if (last % 2 == 0) {
				evenSum += last;
			} else {
				oddSum += last;
			}
			num = num / 10;
		}
		System.out.println(evenSum + " " + oddSum);
	}
}