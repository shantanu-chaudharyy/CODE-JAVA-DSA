//Problem statement
//You have been given a random integer array/list(ARR) of size N, and an integer X. 
//You need to search for the integer X in the given array/list using 'Linear Search'.
//
//You have been required to return the index at which X is present in the array/list. 
//If X has multiple occurrences in the array/list, then you need to return the 
//index at which the first occurrence of X would be encountered. 
//In case X is not present in the array/list, then return -1.
//
//'Linear search' is a method for finding an element within an array/list. 
//It sequentially checks each element of the array/list until a match is found or the whole array/list has been searched.

package Array;

import java.util.Scanner;

public class LinearSearch {

	  public static int linearSearch(int arr[], int x) {

		    for (int i = 0; i < arr.length; i++) {
		        if (arr[i] == x) {
		            return i; // Return the index of the first occurrence of x
		        }
		    }
		    return -1; // Return -1 if x is not found
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
            int val = sr.nextInt();
            System.out.println(LinearSearch.linearSearch(input,val));
            t -= 1;
        }
    }
}