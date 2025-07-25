//Problem statement
//For a given input string(str), find and return the total number of words present in it.
//
//It is assumed that two words will have only a single space in between. 
//Also, there wouldn't be any leading and trailing spaces in the given input string.

package String;

import java.util.Scanner;

public class CountWords {

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
			Scanner sr= new Scanner(System.in);
			String str = sr.nextLine();
			if(str==null)
			{
				str="";
			}
			int count = CountWords.countWords(str);
			System.out.println(count);
		}
	}
