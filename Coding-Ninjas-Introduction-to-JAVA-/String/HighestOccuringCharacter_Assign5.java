package String;

import java.util.Scanner;

public class HighestOccuringCharacter_Assign5 {

	public static char highestOccuringChar(String str) {
		//Your code goes here
	int [] arr = new int[256];
		for(int i=0; i<str.length(); i++) {
		arr[str.charAt(i)] += 1;
		}

		int max =-1;
		char c = ' ';
		for(int i=0; i<str.length(); i++) {
		if(max < arr[str.charAt(i)]) {
		max = arr[str.charAt(i)];
		c = str.charAt(i);
		}
		}
		return c;
	}
	
	public static void main(String[] args) {
		Scanner sr = new Scanner(System.in);
		String str = sr.nextLine();
		char ans = highestOccuringChar(str);
		System.out.println(ans);
		
	}
}