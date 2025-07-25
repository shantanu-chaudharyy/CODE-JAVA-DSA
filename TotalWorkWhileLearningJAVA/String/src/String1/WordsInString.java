package String1;

import java.util.Scanner;

public class WordsInString {

	public static int countWords(String str) {	
		if(str.length()==0)
        {
            return 0;
        }
        int spaces=0;
        for (int i = 0; i < str.length(); i++)
        {
            if (str.charAt(i)==' ')
            {
                spaces++;
            }
        }
        return spaces+1;

    }

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		int s = countWords(str);
		System.out.println(s);
	}

}
