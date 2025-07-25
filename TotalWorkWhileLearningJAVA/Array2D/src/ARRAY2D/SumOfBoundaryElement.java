package ARRAY2D;

import java.util.Scanner;

public class SumOfBoundaryElement {

	public static void sum(int mat[][], int n, int m)

	{
		if(mat.length == 0) 
		{
			System.out.println(0);
			return ;
		}
		
		n = mat.length;
		m = mat[0].length;

		int uppercol = 0;
		int upperrow = 0;
		int lowercol = m - 1;
		int lowerrow = n - 1;

		int sum = 0;

		for (int i = uppercol; i <= lowercol; i++) {
			sum += mat[upperrow][i];

		}
		upperrow++;

		for (int i = upperrow; i <= lowerrow; i++) {
			sum += mat[i][lowercol];
		}

		lowercol--;
		
		for(int i = lowercol; i >= uppercol; i--) 
		{
			sum += mat[lowerrow][i];
		}
		
		lowerrow--;
		
		for(int i = lowerrow; i>=upperrow; i--) 
		{
			sum += mat[i][uppercol];
		}
		
		 for (int i = 1; i < n - 1; i++) {
	            sum += mat[i][m-1-i];
	        }

	        for (int i = 1; i < n - 1; i++) {
	            if (i != m-1-i) {
	                sum += mat[i][i];
	            }
	        }
		System.out.println(sum);
	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		int m = scan.nextInt();

		int mat[][] = new int[n][m];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				mat[i][j] = scan.nextInt();
			}
		}
		sum(mat, n, m);
	}
	
        
    }

