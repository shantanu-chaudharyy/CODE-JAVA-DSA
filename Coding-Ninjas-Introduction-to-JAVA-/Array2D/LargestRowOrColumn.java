package Array2D;

import java.util.Scanner;

public class LargestRowOrColumn {

	public static void findLargest(int mat[][]){
		int maxm = Integer.MIN_VALUE;
			boolean InRow = true;
			int IndX = 0;

	if(mat.length == 0) 
	{
		System.out.println("row" + " " + 0 + " " + maxm) ;
		return;
	}

		
			int sum;
			
			int n = mat.length;
			int m = mat[0].length;
			
			 for(int i = 0; i<n; i++) 			
			 {
				  sum = 0;
				 for(int j = 0; j<m; j++) 
				 {
					 sum += mat[i][j];
				 }
				 
				 if(sum > maxm) 
				 {
					 maxm = sum;
					 IndX = i;
				 }
				 
			 }
			
			  
			 for(int j = 0; j<m; j++) 
			 {
				 sum = 0;
				 for(int i = 0; i<n; i++) 
				 {
					 sum+=mat[i][j];
				 }
				 
				 if(sum > maxm) 
				 {
					 maxm = sum;
					 IndX = j;
					 InRow = false;
				 }
			 }
			 
			 System.out.println((InRow ? "row " : "column ") + IndX + " " + maxm);
	    
		}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		int m = scan.nextInt();

		int mat[][] = new int[n][m];

		int k = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				mat[i][j] = scan.nextInt();
			}
		}

		findLargest(mat);
	}

}
