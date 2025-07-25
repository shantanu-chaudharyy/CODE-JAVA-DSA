package Array2D;

import java.util.Scanner;

public class RowWiseTraversal {

	  public static int[] printRowWise(int [][]a) {
		  
		  	int n = a.length;//length of row - 2
				int m = a[0].length; //length of cols - 4
				//a=[1 2 3]
				//    [4 5 6]
				int k = 0;

				  int arr[] = new int[n*m]; 


				  for(int i = 0; i<n; i++)// N =2
				  {
					  for(int j = 0; j<m; j++) // 4
					  {
						arr[k] = a[i][j];//1,2,3,4
						k++; 
						  
					  }
	
				}
				 return arr;
					}
	
	public static void main(String[] args) {

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
		            ans= RowWiseTraversal.printRowWise(ar);
		           // System.out.print(ans.length);
		            for(int i=0;i<ans.length;i++)
		            {
		                    System.out.print(ans[i]+" ");
		            }
			    System.out.println();
		               
		        }
		    }
	}
}
