package String;

import java.util.Scanner;

public class ReverseStringWordWise {
	public static String reverseWordWise(String input) {
	       int i = input.length()-1;//3
			 int StartIndex = i;//3
			 int End = input.length();//3
			 String result = "";// BOY A IS
			 
			 while( i>=0) 
			 {
				 if(input.charAt(i) == ' ') //3
				 {
					 
					 result = result + input.substring(i + 1, End) + " ";// 4 TO 6
					 
					 End = StartIndex; // 3
				 }
				 i--;
			 }
			 if(i<0) 
			 {
				 result = " ";
				 }
			 
			
	return result;
	    }
	

		public static void main(String[] args) {

			Scanner scan = new Scanner(System.in);
			String input = scan.nextLine();
			String result = reverseWordWise(input);
			
			System.out.println(result);

		}

	}
