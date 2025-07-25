//Problem statement
//Write a program to calculate the total salary of a person. 
//The user has to enter the basic salary (an integer) and the grade (an uppercase character), 
//depending upon which the total salary is calculated as:
//
//    Total_salary = Basic + HRA + DA + Allow – PF

package Conditionals_and_Loops;

import java.util.Scanner;

public class Assignment1_Total_Salary {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// input 
		int bSalary = scan.nextInt();
		char grd = scan.next().charAt(0);

		double HRA = bSalary*0.2;
		double DA = bSalary*0.5;
		double PF = bSalary*0.11;
        int allow = 0;
		
		if (grd == 'A') {
			 allow = 1700;
			
		} else if (grd == 'B') {
			 allow = 1500;

		} else  {
			 allow = 1300;
				}
		double totalsalary = (bSalary + HRA + DA + allow-PF);

		int roundsalary = (int)Math.round(totalsalary);
		System.out.println(roundsalary);
			}
		}    
	


	
	