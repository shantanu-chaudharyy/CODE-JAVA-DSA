//Problem statement
//You have been given a random integer array/list(ARR) and a number X. Find and return the number of triplets in the array/list which sum to X.
//
//Note :
//Given array/list can contain duplicate elements.

package Array;

import java.util.Scanner;

public class Assignment5_TripletSum {
	 public static int findTriplet(int[] arr, int x) {
		   int ans = 0;
		   for(int i = 0; i < arr.length; i++) 
				{
					for(int j = i+1; j<arr.length; j++) 
					{
						for(int k = j + 1; k < arr.length; k++) 
						{
							if(arr[i] + arr[j] + arr[k] == x) {
								ans++;
							}
						}
					}
				}
				return ans;
				
				
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
	            int x =sr.nextInt();
	            System.out.println((Assignment5_TripletSum. findTriplet(arr,x)));
	            
	            t -= 1;
	        }
	    }
	}



