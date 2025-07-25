//Problem statement
//Given a character, you need to print the ASCII value of that character.
//
//Example:
//Input: ch = ‘a’
//
//Output: 97
//
//Explanation: ASCII value of ‘a’ is 97.


package HowIsDataStored;

import java.util.Scanner;

public class ASCII_Value {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        char ch = scan.next().charAt(0);
        int ascii = (int) ch; 
        System.out.println(ascii); 

}
}