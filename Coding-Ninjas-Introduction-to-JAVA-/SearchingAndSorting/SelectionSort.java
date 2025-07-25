package SearchingAndSorting;

import java.util.Scanner;

public class SelectionSort {

public static int[] takeinput() {
		
		Scanner scan = new Scanner(System.in);
		int size = scan.nextInt();
		int arr[] = new int[size];
		
		for(int i = 0; i < size; i++) {
			
			arr[i] = scan.nextInt();
			
		}
		return arr;
	}

public static void SelectionSort(int arr[]) 
 {
	// The loop traverses from 0th till n-1 index
		for(int i = 0; i < arr.length-1; i++) 
		{
			// we are assuming min value as arr[i] and its index as minimum
			int min = arr[i];
			int minIndex = i;
			//now to find the actual minimum value to swap it will the assumed we are comparing it
			// from 1st till last index
			for(int j = i+1; j < arr.length; j++) 
			{ 
				//at the end of this loop we will have our required minimum value and minimum index
				if(arr[j] < min) 
				{
					min = arr[j];
					minIndex = j;
				}
				
			}
			// now since we got the minimum value and minimum index we need 
			// to swap it with the assumed

					int temp = arr[i];
					arr[i] = arr[minIndex];
					arr[minIndex] = temp;
		} 
	
 }

	public static void main(String[] args) {
	
		int input[] = takeinput();
	
		SelectionSort(input);
		
		for(int i =0; i < input.length; i++) 
		{
			System.out.print(input[i] + " ");
		}
	}

}
