//Problem statement
//Write a program to input a name(as a single character) and marks of three tests as m1, m2, and m3 
//of a student considering all the three marks have been given in integer format.
//
//Now, you need to calculate the average of the given marks and print it along with the 
//name as mentioned in the output format section.
//
//All the test marks are in integers and hence calculate the average in integer as well. 
//That is, you need to print the integer part of the average only and neglect the decimal part.


package GettingStartedWithJava;

import java.util.Scanner;

public class AvergeMarks {

	public static void main(String[] args) {
		
			Scanner scan = new Scanner(System.in);

		String str = scan.next();

		int m1 = scan.nextInt();
		int m2 = scan.nextInt();
		int m3 = scan.nextInt();

		int avg = (m1+m2+m3)/3;
		System.out.println(str);
		System.out.println(avg);
				

				
			}

		}