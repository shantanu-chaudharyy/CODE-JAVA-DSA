package String;

import java.util.Arrays;
import java.util.Scanner;

public class CheckPermutation {

public static boolean Permutation(String str1, String str2) {

if(str1.length() != str2.length()){
	return false;
}
int n = str1.length();//5

char c1[] = new char[n];//5

for(int i =0; i<n ; i++){
	char ch = str1.charAt(i);//abcde
    c1[i]=ch;
}

char c2[] = new char[n];//5

	for(int i =0; i<n ; i++){
	char ch = str2.charAt(i);//baedc
  c2[i]=ch;
}

Arrays.sort(c1);//abcde
Arrays.sort(c2);//abcde

return Arrays.equals(c1 , c2);

}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str1 = scan.next();
		String str2 = scan.next();

	boolean s=  Permutation(str1, str2);
	System.out.println(s);
	}

}
