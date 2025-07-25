package ARRAY2D;

import java.util.Scanner;

public class RowWiseTraversal {

	public static void main(String[] args) {
				
				  Scanner scan = new Scanner(System.in);
				  System.out.println("Enter number of rows");
				  int rows = scan.nextInt();
				  System.out.println("Enter number of colms");
				  int colms =scan.nextInt();
				  
				  int arr[][] = new int[rows][colms];
				  
				  for(int i = 0; i<rows; i++) 
				  {
					  for(int j = 0; j<colms; j++) 
					  {
						 
						  arr[i][j] = scan.nextInt();
					  }
				  }
				 int n = arr.length;
				 int m = arr[0].length;
				 int k = 0;
				 
				 int ans[] = new int[n*m];
				 
				 for(int i = 0; i<n; i++) 
				 {
					 for (int j = 0; j < m; j++) {
						
						 ans[k] = arr[i][j];
						 k++;
						 
					}
				 }
				 for(int i = 0; i<ans.length; i++) 
				 {
					 System.out.print(ans[i]);
				 }
			}
		}

	