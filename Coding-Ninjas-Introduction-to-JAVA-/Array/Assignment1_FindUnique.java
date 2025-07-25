//Problem statement
//You have been given an integer array/list(ARR) of size N. Where N is equal to [2M + 1].
//
//Now, in the given array/list, 'M' numbers are present twice and one number is present only once.
//
//You need to find and return that number which is unique in the array/list.
//
// Note:
//Unique element is always present in the array/list according to the given condition.

package Array;

import java.lang.reflect.Array;
import java.util.Scanner;

public class Assignment1_FindUnique {

	 public static int findUnique(int[] arr){
			
			Arrays.sort(arr);
			
		for(int i=0; i<arr.length-1; i+=2) {
			
			if(arr[i] != arr[i+1]) {
			
			return arr[i];
			
			
			}

   }
	  return arr[arr.length-1];
 }
	
	
	  public static void main(String[] args)  {
	        Scanner sr = new Scanner(System.in);
	        int t = sr.nextInt();
	        while(t > 0) 
	        {
	            int n=sr.nextInt();
	            int[] arr=new int[n];
	            for (int i =0 ; i<n;i++)
	            {
	                arr[i]=sr.nextInt();
	            }
	            System.out.println(Assignment1_FindUnique. findUnique(arr));
	           
	            t -= 1;
	        }
	    }
	}

