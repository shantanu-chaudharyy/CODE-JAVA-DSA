		package ARRAY2D;
		
		import java.util.Scanner;
		
		public class Array2d_basic {
			
				public static void main (String[] args) {
				
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
						  System.out.println("Element on" + " "+ i + " "+ "and" +  " "+ j);
						  arr[i][j] = scan.nextInt();
					  }
				  }
				  
				  for(int i = 0; i<rows; i++) 
				  {
					  for(int j = 0; j<colms; j++) 
					  {
						  System.out.print(arr[i][j]);
						  
					  }
					  System.out.println();
				}
				 
			}
		}