package String;

import java.util.Scanner;

public class PrintSubstringLengthWise {
	
	public static void Lengthwise(String str)
	{
		for(int len = 1; len <= str.length(); len++) 
		{
			for(int start = 0; start<=str.length() - len; start++) 
			{
				int end = start+len-1;
				System.out.print(str.substring(start, end+1) + " ");				
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = scan.next();
		
		Lengthwise(str);
	}

}
