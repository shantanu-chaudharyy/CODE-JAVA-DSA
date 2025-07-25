package Array2D;

import java.util.Scanner;

public class PrintSpiral {


public class Solution {

	public static void spiralPrint(int matrix[][]){
if (matrix == null || matrix.length == 0) {
			return;
		}

	 int n = matrix.length; // Added: getting the number of rows
        int m = matrix[0].length; // Added: getting the number of columns
        
        int total = n * m; // total elements in the matrix

        int upperRow = 0;
        int lowerRow = n - 1;
        int upperColm = 0;
        int lowerColm = m - 1;

        int count = 0;

        while (count < total) {
            // Traverse from left to right along the top row
            for (int i = upperColm; i <= lowerColm && count < total; i++) { // Fixed: should be i <= lowerColm
                System.out.print(matrix[upperRow][i] + " ");
                count++;
            }
            upperRow++;

            // Traverse from top to bottom along the right column
            for (int i = upperRow; i <= lowerRow && count < total; i++) { // Fixed: should be i <= lowerRow
                System.out.print(matrix[i][lowerColm] + " ");
                count++;
            }
            lowerColm--;

            // Traverse from right to left along the bottom row
            for (int i = lowerColm; i >= upperColm && count < total; i--) { // Fixed: should be i >= upperColm
                System.out.print(matrix[lowerRow][i] + " ");
                count++;
            }
            lowerRow--;

            // Traverse from bottom to top along the left column
            for (int i = lowerRow; i >= upperRow && count < total; i--) { // Fixed: should be i >= upperRow
                System.out.print(matrix[i][upperColm] + " ");
                count++;
            }
            upperColm++;
        }
	}
        public static void main(String[] args) {
    		Scanner scan = new Scanner(System.in);

    		int n = scan.nextInt();
    		int m = scan.nextInt();

    		int matrix[][] = new int[n][m];

    		for (int i = 0; i < n; i++) {
    			for (int j = 0; j < m; j++) {
    				matrix[i][j] = scan.nextInt();
    			}
    		}
    		spiralPrint(matrix, n, m);
    	}

}}
