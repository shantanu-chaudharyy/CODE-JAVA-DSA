//Problem statement
//Write a program that takes a number as input and prints all its factors except 1 and the number itself.. 
//If the number has only two factors (1 and the number itself), then the program should print -1.

package Conditionals_and_Loops;

import java.util.Scanner;

public class Assignment4_Factors {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);

         // Read the input number
         int n = scanner.nextInt();

         // Find and print the factors
         printFactors(n);

         scanner.close();
 }

 // Function to print factors excluding 1 and the number itself
 static void printFactors(int num) {
         boolean isPrime = true;

         for (int i = 2; i <= num / 2; i++) {
                 if (num % i == 0) {
                         System.out.print(i + " ");
                         isPrime = false;
                 }
         }

         if (isPrime) {
                 System.out.println("-1");
         }
 }
}
