//Problem statement
//Given three values - Start Fahrenheit Value (S), End Fahrenheit value (E) and Step Size (W), 
//you need to convert all Fahrenheit values from Start to End at the gap of W, 
//into their corresponding Celsius values and print the table.
//Note:
//You don't have to write the main function or take input. 
//It has already been taken care of and you need to just print the integer value . 
//Just write the code that prints Fahrenheit to Celsius table in the function itself.
//Formula is C = (F - 32) * 5/9


package FunctionVariablesAndTheirScope;

import java.util.Scanner;

public class FahrenheitToCelsiusFunction {

public static void printFahrenheitTable(int start, int end, int step) {
		
		int i =1;
		int ans = 0;
		while(start <= end) {
			
			ans = (5*(start-32))/9; 
			
			System.out.println(start + " " + ans);
			
			start = start+step;
			
			} 
	
		}
		
		public static void main(String[] args) {

			Scanner s =  new Scanner(System.in);
			
			int start = s.nextInt();
			int end = s.nextInt();
			int step = s.nextInt();
		
			printFahrenheitTable(start, end, step);
					
		}

	}
