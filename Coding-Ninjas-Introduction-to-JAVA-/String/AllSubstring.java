package String;

import java.util.Scanner;

public class AllSubstring {

	public static void PrintsubString(String str) 
	{
		for(int i = 0; i < str.length(); i++) 
		{
			for(int j = i+1; j < str.length()+1; j++) 
			{
				 String substr=str.substring(i,j);
     System.out.println(substr);
			}
		}
	}
	
public static void main(String[] args) {
	
	Scanner scan = new Scanner(System.in);
	String str = scan.next();
	
	PrintsubString(str);
}
}
