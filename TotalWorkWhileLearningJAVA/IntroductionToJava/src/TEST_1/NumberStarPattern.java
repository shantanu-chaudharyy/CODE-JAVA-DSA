//Problem Statement:
//	
//Ninja was playing with her sister to solve a puzzle pattern. However, even after taking several hours, they could not solve the problem.
//
//A value of N is given to them, and they are asked to solve the problem. Since they are stuck for a while, they ask you to solve the problem. Can you help solve this problem?
//
//Example : Pattern for N = 4
//
//****
// ***     
//  **
//   *
//Detailed explanation ( Input/output format, Notes, Images )
//Constraints:
//1 <= T <= 50
//1 <= N <= 300
//
//Time Limit: 1 sec

package TEST_1;

import java.util.Scanner;

public class NumberStarPattern {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int n, i, j;
		n = s.nextInt();
		for (i = 1; i <= n; i++) {
			for (j = n; j > 0; j--) {
				if (j == i)
					System.out.print("*");
				else
					System.out.print(j);
			}
			System.out.println();
		}

	}
}
