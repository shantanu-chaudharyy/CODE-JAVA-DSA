package ARRAY2D;

import java.util.Scanner;

public class ColumnwiseTraversal {

	public static void main(String[] args) {
	
	 Scanner scan = new Scanner(System.in);
	  System.out.println("Enter number of rows");
	  int rows = scan.nextInt();
	  System.out.println("Enter number of colms");
	  int colms =scan.nextInt();
	  
	  int a[][] = new int[rows][colms];
	  
	  for(int i = 0; i<rows; i++) 
	  {
		  for(int j = 0; j<colms; j++) 
		  {
			 
			  a[i][j] = scan.nextInt();
		  }
	  }
	  int n = a[0].length;//3
	   int m = a.length;//3
	   int k = 0;

		int arr[] = new int[n*m];

	   for (int i = 0; i < n; i++) //3
	   {

		for (int j = 0; j < m; j++) {//3
			
			arr[k] = a[j][i];
			k++;
		}   
	   }
	   for(int i = 0; i<arr.length; i++) 
		 {
			 System.out.print(arr[i]);
		 }

        
   

	}
}