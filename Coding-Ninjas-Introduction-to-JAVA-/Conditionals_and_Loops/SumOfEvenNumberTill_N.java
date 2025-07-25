//Problem statement
//Given a number N, print sum of all even numbers from 1 to N.

package Conditionals_and_Loops;

import java.util.Scanner;

public class SumOfEvenNumberTill_N {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();

		int i = 1;
		int sum =0; 
		while (i<=n) {

			if (i%2==0) {
				sum = sum +i;
				i++;
			}
		i++;

		}
		System.out.println(sum);

			}

		}