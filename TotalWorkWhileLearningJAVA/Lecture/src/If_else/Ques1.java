package If_else;

import java.util.Scanner;

public class Ques1 {

	public static void main(String[] args) {
Scanner Scan = new Scanner(System.in);

char ch = Scan.next().charAt(0);

	if (ch>='A' && ch<='Z') {
		
	System.out.println("1");
	} else if(ch>='a' && ch<='z') {
		System.out.println("0");
		
	} else {
		
		System.out.println("-1");
	
	}
	}
	

}
