package ARRAY2D;

import java.util.Scanner;

public class Spiral_practice {
	
	public static void Spiral(int matrix[][] , int n , int m) 
	{
		m = matrix[0].length;
		n = matrix.length;
		
		int total = n*m;
		
		int upperRow = 0;
		int lowerRow = n-1;
		int upperColm = 0;
		int lowerColm = m-1;
		
		int count = 0;
		
		while(count < total) 
		{
			for(int i = upperColm; i <= lowerColm; i++) 
			{
				System.out.print(matrix[upperRow][i] + " ");
				count++;
			}
			upperRow++;
			
			for(int i = upperRow; i<=lowerRow; i++) 
			{
				System.out.print(matrix[i][lowerColm] + " ");
				count++;
			}
			lowerColm--;
			
			for(int i = lowerColm; i>=upperColm; i--) 
			{
				System.out.print(matrix[lowerRow][i] + " ");
				count++;
			}
			lowerRow--;
			
			for(int i = lowerRow; i>=upperRow; i-- ) 
			{
				System.out.print(matrix[i][upperColm] + " ");
				count++;
			}
			upperColm++;
		}
	}
	
	public static void main(String[] args) 
	{ 
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		int m = scan.nextInt();

		int matrix[][] = new int[n][m];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				matrix[i][j] = scan.nextInt();
			}
		}
		Spiral(matrix, n, m);
	}

}