package String1;

import java.util.Scanner;

public class SubStringLecture {

	public static void SubString(String str) 
	{
	
		for(int i=0;i<str.length();i++)
	      {
	          System.out.print(str.substring(i));
	      }
	}
	
	public static void main(String[] args) {
		
		Scanner scan =  new Scanner(System.in);
		String str = scan.next();
		
		SubString(str);
	}

}
