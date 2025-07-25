package While;

import java.util.Scanner;

public class BasicSalary {

	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);
	        
	        // Input 
	        int bSalary = scan.nextInt();
	        char grd = scan.next().charAt(0);

	        // Calculate HRA, DA, PF
	        double HRA = 0.2 * bSalary;
	        double DA = 0.5 * bSalary;
	        double PF = 0.11 * bSalary;
	        
	        // Determine Allowance based on grade
	        int allow;
	        if (grd == 'A') {
	            allow = 1700;
	        } else if (grd == 'B') {
	            allow = 1500;
	        } else {
	            allow = 1300;
	        }
	        
	        // Calculate Total Salary
	        double totalSalary = bSalary + HRA + DA + allow - PF;
	        
	        // Round off and print integral part
	        int roundedSalary = (int) Math.round(totalSalary);
	        System.out.println(roundedSalary);
	        
	    }
	}

