package String;

import java.util.Scanner;

public class ReverseEachWord_EasyApproch {
//       01234567890
//	EX ; ABC DEF GHI
//	     12345678901
	public static void ReverseEachWordd(String str) 
	{
		int start = 0;
		String result = "";
		
		for(int i = 0; i<=str.length(); i++) 
		{
			if(i == str.length() || str.charAt(i) == ' ') 
			{
				int end = i;
				String word = str.substring(start, end);
				
				for(int j = word.length() - 1; j>=0; j--) 
				{
					result += word.charAt(j);
				}
				if(i<str.length()) 
				{
					result += " ";
				}
				start = end +1;
			}
		}
	
		
		System.out.println(result);
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		ReverseEachWordd(str);
	}

}
