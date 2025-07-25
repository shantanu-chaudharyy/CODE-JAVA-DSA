package BubbleSorting;

import java.util.Scanner;

public class ROUGH {
	
	public static int[] Takeinput() 
	{
		Scanner scan = new Scanner(System.in);
		int size = scan.nextInt();
	
		int arr[] = new int [size];
		
		for(int i = 0; i < size; i++) 
		{
			arr[i] = scan.nextInt();
		}
		return arr;
		
	}
	
	public static void Bubblesort(int arr[]) 
	{
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
		
		int input[] = Takeinput();
		Bubblesort(input);
		
		for(int i = 0; i < input.length; i++) 
		{
			System.err.print(input[i] + " ");
		}

	}

}
