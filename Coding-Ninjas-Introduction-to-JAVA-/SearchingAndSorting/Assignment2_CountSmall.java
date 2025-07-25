package SearchingAndSorting;

import java.util.Scanner;

public class Assignment2_CountSmall {

	public static int[] CountSmallArr(int arr1[] , int arr2[]) 
	{
		int result[] = new int[arr1.length];
		for(int i = 0; i < arr1.length; i++) 
		{
			
			int count = 0;
			for(int j = 0; j < arr2.length; j++) 
			{
				if(arr2[j] <= arr1[i]) 
				{
					count++;
				}
			
			}
			  result[i] = count; 
			  
		}

		return result;
	}
	
	public static void main(String[] args) {
    
		Scanner scan = new Scanner(System.in);
		
		int size1 = scan.nextInt();
		int arr1[] = new int[size1];
		
		for(int i = 0; i<size1; i++) 
		{
			arr1[i] = scan.nextInt();
		}
  		
		int size2 = scan.nextInt();
		int arr2[] = new int[size2];
		
		for(int i = 0; i<size2; i++) 
		{
			arr2[i] = scan.nextInt();
		}
        
		int small[] = CountSmallArr(arr1, arr2);
		
		for(int num: small) 
		{
			System.out.println(num);
			
		}
		
	}
	

}

