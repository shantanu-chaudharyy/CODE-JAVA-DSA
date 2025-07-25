//Problem statement
//You have been given an array/list(ARR) of size N. You need to swap every pair of alternate elements in the array/list.
//
//You don't need to print or return anything, just change in the input array itself.


package Array;

import java.util.Scanner;

public class Swap_Alternate {
	
	  public static void swapAlternate(int arr[]) {
	    	
			
			
			for(int i = 1; i<arr.length; i+=2) 
			{ 
				
				int temp = arr[i];
				arr[i] = arr[i-1];
				arr[i-1] = temp;

			}
		
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
            Swap_Alternate.swapAlternate(arr);
            for(int i=0;i<n;i++)
            {
                System.out.print(arr[i]+" ");
            }
            System.out.println();
            t -= 1;
        }
    }
}
