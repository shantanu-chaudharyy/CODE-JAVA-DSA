package Array2D;

import java.util.Scanner;

public class ColumnwiseTraversal {

	  public static int[] printColWise(int [][]a) {
	       
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
	        return arr;
}
	
	  public static void main(String args[]) 
	    {
	        int t, m, n;
	        Scanner sr = new Scanner(System.in);
	        t = sr.nextInt();
	        for (int k = 0; k < t; ++k) 
	        {
	            n = sr.nextInt();
	            m = sr.nextInt();
	            int ar[][] = new int[n][m];
	            for(int i=0;i<n;i++)
	            {
	                for(int j=0;j<m;j++)
	                {
	                    ar[i][j]=sr.nextInt();
	                }
	            }
	            int ans[]= new int[n*m];
	            ans= ColumnwiseTraversal.printColWise(ar);
	           // System.out.print(ans.length);
	            for(int i=0;i<ans.length;i++)
	            {
	                    System.out.print(ans[i]+" ");
	            }
		    System.out.println();
	               
	        }
	    }
	}
