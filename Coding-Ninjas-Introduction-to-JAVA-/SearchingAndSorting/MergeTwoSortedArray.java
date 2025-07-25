//Problem statement
//You have been given two sorted arrays/lists(ARR1 and ARR2) of size N and M respectively, 
//merge them into a third array/list such that the third array is also sorted.

package SearchingAndSorting;

import java.util.Scanner;

public class MergeTwoSortedArray {

	
		public static int[] MergeArray(int arr1[] , int arr2[]) 
		{
			
		    int ans[] = new int[arr1.length + arr2.length];
			
			int i = 0;
			int j = 0;
			int k = 0;
			
			while(i<arr1.length && j<arr2.length) 
			{
				if(arr1[i] < arr2[j]) 
				{
					ans[k] = arr1[i];
					k++;
					i++;
				} else {
					ans [k] = arr2[j];
					k++;
					j++;
				}
			}
			 		while(i<arr1.length) 
			 		{
			 			ans[k] = arr1[i];
						k++;
						i++;
			 		}
			 		while(j<arr2.length) 
			 		{
			 			ans [k] = arr2[j];
						k++;
						j++;
			 		}
			 		return ans;
		}			

			public static void main(String[] args) {
				
				Scanner scan = new Scanner(System.in);
				
				int size1 = scan.nextInt();
				int arr1[] = new int [size1];
				for(int i = 0; i <size1; i++) {
					arr1[i] = scan.nextInt();		
					}
				
				int size2 = scan.nextInt();
				int arr2[] = new int [size2];
				for(int i = 0; i <size2; i++) {
					arr2[i] = scan.nextInt();
					}
			int merge[] = MergeArray(arr1, arr2);
			System.out.print("[");
			for(int num: merge) {
				
				System.out.print(num + ",");
			
			}
			System.out.println("]");
			}
			

		}
