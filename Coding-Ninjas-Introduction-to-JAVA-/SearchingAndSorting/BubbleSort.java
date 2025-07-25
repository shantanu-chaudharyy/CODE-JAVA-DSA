package SearchingAndSorting;

import java.util.Scanner;

public class BubbleSort {

		public static void bubbleSort(int[] arr, int n) {
		for(int i = 0; i < arr.length-1; i++) 
			{
			
				for (int j = i + 1; j < arr.length; j++) 
				{
					if(arr[j] < arr[i]) 
					{
						int temp = arr[i];
						 arr[i] = arr[j];
						 arr[j] = temp;
					}
					
				 }
				
				
						
			}
		}
		public static void main(String[] args) {
			Scanner sc= new Scanner(System.in);
			int n = sc.nextInt();
			int[] arr = new int[n];
			for(int i=0;i<n;i++)
			{
				arr[i] = sc.nextInt();
			}
			BubbleSort.bubbleSort(arr, n);
				for(int i=0;i<n;i++)
				{
						System.out.print(arr[i]+" ");
				}
			
		}
	}