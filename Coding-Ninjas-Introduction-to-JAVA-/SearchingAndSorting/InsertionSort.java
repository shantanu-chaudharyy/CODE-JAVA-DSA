package SearchingAndSorting;

import java.util.Scanner;

public class InsertionSort {

public static int[] takeinput() {
		
		Scanner scan = new Scanner(System.in);
		int size = scan.nextInt();
		int arr[] = new int[size];
		
		for(int i = 0; i < size; i++) {
			
			arr[i] = scan.nextInt();
			
		}
		return arr;
	}
	public static void Inserationsort(int arr[]) 
	{
		for(int i = 1; i< arr.length; i++) 
		{
			int temp = arr[i];
			int j = i-1;
			while(j>=0 && arr[j] > temp) 
			{
				arr[j+1] = arr[j];
				j--;
			
			}
				arr[j+1] = temp;
			
			
			
			
		}
	}
	
	
	public static void main(String[] args) {
		
		int input[] = takeinput();
		Inserationsort(input);
				
		for(int i = 0; i<input.length ; i++) {
			System.out.print(input[i] + " ");
		}

	}

}
