package HowIsDataStored;

import java.util.Scanner;

public class AsciiVal {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        char ch = scan.next().charAt(0);
        int ascii = (int) ch; 
        System.out.println(ascii); 
	}

}
