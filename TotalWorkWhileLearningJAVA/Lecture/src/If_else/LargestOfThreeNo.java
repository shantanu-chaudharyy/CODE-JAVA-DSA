package If_else;

import java.util.Scanner;

public class LargestOfThreeNo {

	public static void main(String[] args) {

Scanner scan = new Scanner(System.in);

int a = scan.nextInt();
int b = scan.nextInt();
int c = scan.nextInt();

if (a>= c && a>=b){
	System.out.println(a + " " + "is greaater");
	
	} else if  (b>=a && b>=c) 
	{	
			System.out.println(b+ " " + "is greaater");
		} else {
			
			System.out.println(c+ " " + "is greaater");
		}
	}
	}


