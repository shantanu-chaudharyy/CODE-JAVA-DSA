package Selection_Sorting;

import java.util.Scanner;

public class rough {

public static int[] takeinput() {
		
		Scanner scan = new Scanner(System.in);
		int size = scan.nextInt();
		int arr[] = new int[size];
		
		for(int i = 0; i < size; i++) {
			
			arr[i] = scan.nextInt();
			
		}
		return arr;
	}
public static void Searchingsort(int arr[]) 
   	{
	for(int i = 0; i < arr.length-1; i++) 
	{
		
		int min = arr[i];
		int minIndex = i;
	
		for(int j = i+1; j < arr.length; j++) 
		{ 
			if(arr[j] < min) 
			{
				min = arr[j];
				minIndex = j;
			}
			
		}
		
				int temp = arr[i];
				arr[i] = arr[minIndex];
				arr[minIndex] = temp;
	}
   	}
	
	public static void main(String[] args) {
	
		int input[] = takeinput();
		
		Searchingsort(input);
				
		for(int i =0; i < input.length; i++) 
		{
			System.out.print(input[i] + " ");
		}
	}

}
