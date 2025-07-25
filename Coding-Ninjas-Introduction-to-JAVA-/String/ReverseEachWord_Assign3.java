package String;

import java.util.Scanner;

public class ReverseEachWord_Assign3 {

	public static String reverseEachWord(String str) 
	{
//		0123456789012
//		CODING NINJAS
//		1234567890123
		String ans = "";
		String reverse = "";

		for(int i = 0; i<str.length(); i++) 
		{
			if(str.charAt(i) != ' ') 
			{
				reverse = str.charAt(i) + reverse;
				
			}else { 
				ans += reverse+" ";
				reverse="";
			}
		}
		ans+=reverse;
		return ans;
	}
	
	
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        
       String s = reverseEachWord(str);
       System.out.println(s);
	}
}