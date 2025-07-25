package While;

import java.util.Scanner;

public class SumOfEvenOdd {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		
		int OddSum = 0;
		int EvenSum = 0;
		
		while(num>0) {
			
			int last = num % 10;
			if (last % 2 == 0) {
				
				EvenSum = EvenSum + last;
			} else { 
			    OddSum = OddSum + last;				
			}
			num = num / 10;
			}
			System.out.println(EvenSum + " " + OddSum);
		}

}



//while (num > 0) {
	// Checks if num is greater than zero to enter the loop.
	// At this point, num = 132456.
	// int last = num % 10;
	// Extracts the last digit by calculating the remainder of num divided by 10.
	// last = 132456 % 10 = 6.
	// if (last % 2 == 0) {
	// Checks if last is even.
	// Since 6 % 2 == 0, it's true.
	// evenSum += last;
	// Adds last to evenSum.
	// evenSum = 0 + 6 = 6.
	// } else { oddSum += last; }
	// This part is skipped since the last digit was even.
	// num = num / 10;
	// Removes the last digit by integer division by 10.
	// num = 132456 / 10 = 13245.
	// Repeat from step 4
	// The loop continues, with num = 13245.
	// Next Iteration: last = 13245 % 10 = 5
	// This digit is odd.
	// oddSum = 0 + 5 = 5.
	// num = 13245 / 10 = 1324.
	// Next Iteration: last = 1324 % 10 = 4
	// This digit is even.
	// evenSum = 6 + 4 = 10.
	// num = 1324 / 10 = 132.
	// Next Iteration: last = 132 % 10 = 2
	// This digit is even.
	// evenSum = 10 + 2 = 12.
	// num = 132 / 10 = 13.
	// Next Iteration: last = 13 % 10 = 3
	// This digit is odd.
	// oddSum = 5 + 3 = 8.
	// num = 13 / 10 = 1.

	// RafiqulNext Iteration: last = 1 % 10 = 1
	// This digit is odd.
	// oddSum = 8 + 1 = 9.
	// num = 1 / 10 = 0.
	// Exiting Loop
	// Since num is now zero, the loop ends.
	// System.out.println(evenSum + " " + oddSum);
	// Outputs the results, printing 12 9.
	// This indicates evenSum = 12 and oddSum = 9.
