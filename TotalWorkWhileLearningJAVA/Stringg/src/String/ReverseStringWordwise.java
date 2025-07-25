package String;

import java.util.Scanner;

public class ReverseStringWordwise {

	  public static String reverseWordWise(String str) {
	        //he is a boy
	        int end = str.length();//11
	        int i = str.length() - 1;//10
	        String output = "";
	        while (i >= 0) {//5 >=0 
	            if (str.charAt(i) == ' ') {
	                output = output + str.substring(i + 1, end) + " ";//boy a is 
	                end = i;//7
	            }
	            i--;
	        }
	        output += str.substring(i + 1, end); //he 
	        return output;
	    }
	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		String result = reverseWordWise(input);
		
		System.out.println(result);

	}

}
