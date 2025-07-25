package Array2D;

import java.util.Scanner;

public class TransposeOfTtheMatrix_Assign1 {

	public static int[][] transpose(int m, int n, int[][] mat) {

		int result[][] = new int[n][m];
		
		for(int j = 0; j<n; j++) 
		{	
			for(int i = 0; i<m; i++) 
			{
				result[j][i] = mat[i][j];
			}
			
		}
	
		return result;
	}
	
	  public static void main(String args[]) 
	    {
	        int t, m, n;
	        Scanner sr = new Scanner(System.in);
	        t = sr.nextInt();
	        for (int k = 0; k < t; ++k) 
	        {
	            m = sr.nextInt();
	            n = sr.nextInt();
	            int ar[][] = new int[m][n]; // Swap n and m in array dimensions
	            for (int i = 0; i < m; i++) 
	            {
	                for (int j = 0; j < n; j++) 
	                {
	                    ar[i][j] = sr.nextInt();
	                }
	            }
		        int ans[][]=new int[n][m];
	            ans = TransposeOfTtheMatrix_Assign1.transpose(m,n,ar);
	    	    for(int i=0;i<n;i++)
	    	    {	
	        		for(int j=0;j<m;j++)
	        		{
	        			System.out.print(ans[i][j]+" ");
	        		}
			        System.out.println();
		        }
	        }
	    }
	}
