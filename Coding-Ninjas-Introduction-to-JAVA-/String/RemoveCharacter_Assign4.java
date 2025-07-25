package String;

import java.util.Scanner;

public class RemoveCharacter_Assign4 {

	public static String removeAllOccurrencesOfChar(String str, char ch) {
		String result = "";//
		for(int i = 0; i<str.length(); i++) //a
		{
			if(ch!=str.charAt(i)) //a!=b
			{
				result+=str.charAt(i); // b
			}
		}
		return result;
}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		Character ch = scan.next().charAt(0);

		String output = removeAllOccurrencesOfChar(str, ch);
		System.out.println(output);
	}

}
