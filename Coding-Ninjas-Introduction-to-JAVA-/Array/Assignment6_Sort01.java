//Problem statement
//You have been given an integer array/list(ARR) of size N that contains only integers, 0 and 1. Write a function to sort this array/list. Think of a solution which scans the array/list only once and don't require use of an extra array/list.
//
//Note:
//You need to change in the given array/list itself. Hence, no need to return or print anything. 

package Array;

import java.util.Scanner;

public class Assignment6_Sort01 {
	 public static void sortZeroesAndOne(int[] arr) {
	     
	        int countZero = 0;

	        // Count the number of zeros in the array
	        for (int i = 0; i < arr.length; i++) {
	            if (arr[i] == 0) {
	                countZero++;
	            }
	        }

	        // Fill the array with zeros and ones based on the count
	        for (int i = 0; i < arr.length; i++) {
	            if (i < countZero) {
	                arr[i] = 0;
	            } else {
	                arr[i] = 1;
	            }
	        }
	    }

	    public static void printArray(int arr[]) {
	        for (int i = 0; i < arr.length; i++) {
	            System.out.print(arr[i] + " ");
	        }
	        System.out.println();
	    }


public static void main(String[] args) 
{
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
        Assignment6_Sort01. sortZeroesAndOne(arr);
         for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
       
        t -= 1;
    }
}
}




