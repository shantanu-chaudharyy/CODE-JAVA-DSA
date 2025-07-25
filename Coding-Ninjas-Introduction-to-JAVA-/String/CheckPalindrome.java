package String;

import java.util.Scanner;

public class CheckPalindrome {

public static Boolean CheckPalin(String str) 
	
	
	{
		boolean result = true;
		int i = 0;
		int j = str.length()-1;
		while( i<=j) 
		{
			if(str.charAt(i) != str.charAt(j)) 
				{
				   return false;				
			}
			i++;
			j--;
		}
		
		return true;
		
	}
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String str = scan.next();
		boolean s = CheckPalin(str);
		System.out.println(s);
	}

}
