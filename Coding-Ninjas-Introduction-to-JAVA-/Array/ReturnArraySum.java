//Problem statement
//Given an array/list(ARR) of length N, you need to find and return the sum of all the elements in the array/list.

package Array;

import java.util.Scanner;

public class ReturnArraySum {

public static int sum(int[] arr) {
	
		
		int sum = 0;
		for(int i = 0; i < arr.length; i++) {
			
			sum = sum + arr[i];
				
		} 
	return sum;
		
	}
        
		public static void main(String[] args)  {
	        Scanner sr = new Scanner(System.in);
	        int t = sr.nextInt();
	        while(t > 0) 
	        {
	            int size = sr.nextInt();
	            int[] input = new int[size];
	            for (int i = 0; i < size; ++i) 
	            {
	                input[i] = sr.nextInt();
	            }
	            System.out.println(ReturnArraySum.sum(input));
	            t -= 1;
	        }
	    }
	}
