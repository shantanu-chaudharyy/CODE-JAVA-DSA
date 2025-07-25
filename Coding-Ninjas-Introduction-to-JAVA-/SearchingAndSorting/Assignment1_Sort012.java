//Problem statement
//You are given an integer array/list(ARR) of size N. It contains only 0s, 1s and 2s. 
//Write a solution to sort this array/list in a 'single scan'.
//
//'Single Scan' refers to iterating over the array/list just once or to put it in other words, 
//you will be visiting each element in the array/list just once.
//
//Note:
//1. You need to change in the given array/list itself. Hence, no need to return or print anything. 
//2. You are not allowed to sort the list/array directly.


package SearchingAndSorting;

import java.util.Scanner;

public class Assignment1_Sort012 {
	 public static int[] sort012(int[] arr){

	        int num0 = 0;
	        int num1 = 0;
	        int num2 = 0;


	    for(int i = 0; i < arr.length; i++)
	    {          if(arr[i] == 0) 
	          {
	              num0++;
	          }
	          if(arr[i]==1) 
	          {
	              num1++;
	          }
	           if(arr[i] == 2) 
	           {
	               num2++;
	           }
	        
	       }
	       int k = 0;
	       for(int i = 0; i<num0; i++) 
	       {
	           arr[k] = 0;
	           k++;
	       }
	       for(int i = 0; i<num1; i++) 
	       {
	           arr[k] = 1;
	           k++;
	       }
	       for(int i = 0; i<num2; i++) 
	       {
	           arr[k] = 2;
	           k++;
	       }
	       return arr;
	    }
	   
		
		public static void main(String[] args) {

			Scanner scan = new Scanner(System.in);
			
			int size1 = scan.nextInt();
			int arr[] = new int [size1];
			for(int i = 0; i <size1; i++) {
				arr[i] = scan.nextInt();		
				}
		
			int sort012_[] = sort012(arr);
			System.out.print("[");
			for(int num: sort012_) {
				
				System.out.print(num + ",");
			
			}
			System.out.println("]");
			}
			

		}


