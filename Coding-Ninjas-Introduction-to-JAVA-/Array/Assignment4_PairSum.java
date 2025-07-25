//Problem statement
//You have been given an integer array/list(ARR) and a number X. Find and return the total number of pairs in the array/list which sum to X.
//
//Note:
//Given array/list can contain duplicate elements. 

package Array;

import java.util.Scanner;

public class Assignment4_PairSum {

	public static int pairSum(int arr[], int x) {
		 int count = 0;
				for(int i = 0; i < arr.length-1; i++) {
					
					
					for(int j = i+1; j<arr.length; j++) {
						
						
						if(arr[i] + arr[j] == x) {
							count = count +1;
						}
					
					}
					
				}
		return count;
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
        System.out.println((Assignment4_PairSum. pairSum(arr,x)));
        
        t -= 1;
    }
}
}



