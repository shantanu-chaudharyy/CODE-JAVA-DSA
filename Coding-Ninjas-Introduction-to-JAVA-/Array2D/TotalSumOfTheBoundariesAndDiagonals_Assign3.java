package Array2D;

import java.util.Scanner;

public class TotalSumOfTheBoundariesAndDiagonals_Assign3 {

	public static void totalSum(int[][] mat) {
	if(mat.length == 0) 
		{
			System.out.println(0);
			return ;
		}
		
	   int n = mat.length;
	int 	m = mat[0].length;

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
	 public static void main(String args[]) {
	        int t, N, M;
	        Scanner sr = new Scanner(System.in);
	        t = sr.nextInt();
	        for (int k = 0; k < t; ++k) {
	            N = sr.nextInt();
	            int ar[][] = new int[N][N]; // Swap n and m in array dimensions
	            for (int i = 0; i < N; i++) {
	                for (int j = 0; j < N; j++) {
	                    ar[i][j] = sr.nextInt();
	                }
	            }
	            TotalSumOfTheBoundariesAndDiagonals_Assign3.totalSum(ar);
	        }
	    }
	}
