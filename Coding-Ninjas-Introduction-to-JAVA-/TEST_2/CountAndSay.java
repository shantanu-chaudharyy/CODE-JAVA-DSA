package TEST_2;

import java.util.Scanner;

public class CountAndSay {

	  public static String writeAsYouSpeak(int n) 
	    {
	      String current = "1";

	      for(int i = 1; i<n; i++) {
	          StringBuilder next = new StringBuilder();
	          int count =1;
	          char prevChar = current.charAt(0);

	          for(int j = 1; j<current.length(); j++) {
	              char currentChar = current.charAt(j);
	              if(currentChar == prevChar) {
	                  count++;
	              }else{
	                  next.append(count).append(prevChar);
	                  count = 1;
	                  prevChar = currentChar;
	              }
	          }
	          next.append(count).append(prevChar);
	          current = next.toString();
	      }
	      return current;
	    }
	
public static void main(String[] args) {

    Scanner s = new Scanner(System.in);

    int t = s.nextInt();
    StringBuffer sb = new StringBuffer();

    while (t-- > 0) {
        int n = s.nextInt();
        String ans = CountAndSay.writeAsYouSpeak(n);
        sb.append(ans + "\n");
    }
    System.out.print(sb);
}
}
