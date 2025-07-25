//Problem statement
//You have been given an empty array(ARR) and its size N. The only input taken from the user will be N and you need not worry about the array.
//
//Your task is to populate the array using the integer values in the range 1 to N(both inclusive) in the order - 1,3,5,.......,6,4,2.
//
//Note:
//You need not print the array. You only need to populate it.

package Array;

import java.util.Scanner;

public class ArrangeNumberInTheArray {

	  public static void arrange(int[] arr, int n) {
	    	// Your code goes here
	        
	        // Initialize variable k to track the current index in arr
	        int k=0;
	        
	        // Fill arr with odd numbers starting from 1 up to n
	        for(int i=0;i<=n;i++) {
	            if(i%2!=0) { // Check if i is odd
	                arr[k]=i; // Assign i to the current index k in arr
	                k++; // Increment k to move to the next index in arr
	            }
	        }
	        
	        // Fill arr with even numbers starting from n down to 2
	        for(int i=n;i>=1;i--) {
	            if(i%2==0) { // Check if i is even
	                arr[k]=i; // Assign i to the current index k in arr
	                k++; // Increment k to move to the next index in arr
	            }
	        }
	        
	        // Initialize variable i for printing elements of arr
	        int i=0;
	        
	        // Print the elements of arr until i is less than k
	        while(i>k) {
	            System.out.print(arr[i]); // Print the element at index i in arr
	            i++; // Increment i to move to the next element in arr
	        }
	    }
	
	 public static void main(String[] args)  {
	        Scanner sr = new Scanner(System.in);
	        int t = sr.nextInt();
	        while(t > 0) 
	        {
	            int n=sr.nextInt();
	            int[] arr=new int[n];
	            ArrangeNumberInTheArray.arrange(arr, n);
	            for(int i=0;i<n;i++)
	            {
	                System.out.print(arr[i]+" ");
	            }
	            System.out.println();
	            t -= 1;
	        }
	    }
	}

