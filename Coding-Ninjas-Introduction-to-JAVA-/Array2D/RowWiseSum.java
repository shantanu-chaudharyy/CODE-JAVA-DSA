package Array2D;

import java.util.Scanner;

public class RowWiseSum {

	public static void rowWiseSum(int[][] mat) {
		
if(mat.length==0 || mat[0].length == 0) {
		return;
}

		int m = mat[0].length;//2
		int n = mat.length;//8
	
	
	
	
		for(int i = 0; i<n; i++)// N =8
				  {
					  	int sum = 0;
					  for(int j = 0; j<m; j++) // 2
					  {
						sum += mat[i][j];// 1+2+
						
						  
					  }
					  	System.out.print(sum + " ");
				  }
	System.out.println();


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
            RowWiseSum.rowWiseSum(ar);
        }
    }
}
