package Leetcode;

import java.util.Scanner;

public class ReverseWordsInAString {
//      01234567890
//EX:	HE IS A BOY
//	    BOY IS A HE
//   	12345678901
	 public static String ReverseWord(String s) 
	 {
		 int i = s.length()-1;//3
		 int StartIndex = i;//3
		 int End = s.length();//3
		 String result = "";// BOY A IS
		 
		 while( i>=0) 
		 {
			 if(s.charAt(i) == ' ') //3
			 {
				 
				 result = result + s.substring(i + 1, End) + " ";// 4 TO 6
				 
				 End = 	i; // 3
			 }
			 i--;
		 }
		
		result = result + s.substring(i + 1, End) ;// 4 TO 6
		 
		
return result;
		}
	
	public static void main(String[] args) {

Scanner scan = new Scanner(System.in);
String s = scan.nextLine();
String sa = ReverseWord(s);
System.out.print(sa);
	}

}
