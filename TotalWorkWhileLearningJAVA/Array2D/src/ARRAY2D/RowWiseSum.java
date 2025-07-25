	package ARRAY2D;
	
	import java.util.Scanner;
	
	public class RowWiseSum {
	
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
			
			if(arr.length==0 || arr[0].length == 0) {
				return;
		}
	
				int m = arr[0].length;//2
				int n = arr.length;//8
			
			
			
			
				for(int i = 0; i<n; i++)// N =8
						  {
							  	int sum = 0;
							  for(int j = 0; j<m; j++) // 2
							  {
								sum += arr[i][j];// 1+2+
								
								  
							  }
							  	System.out.print(sum + " ");
						  }
			System.out.println();
	
	
			}
	
		}