// Problem statement
// Given a matrix, ‘A’ of size ‘N’ * ‘M’, you must traverse the matrix row-wise.
// You must return an integer array of size ‘N’ * ‘M’ denoting the row-wise traversal of the matrix.
// Constraints :
// 1 <= T <= 10
// 1 <= N * M <= 10^5
// 1 <= A[ i ][ j ] <= 10^9
// Time Limit: 1 sec
// For example:
// Input :
// A = [ [1, 2, 3], [4, 5, 6] ]
// Output :
// 1 2 3 4 5 6
// Explanation: 
// For the given matrix, the first row is [1, 2, 3], and the second is [4, 5, 6].
// For row-wise traversal, you must traverse the first row and then the second.
// Constraints :
// 1 <= T <= 10
// 1 <= N * M <= 10^5
// 1 <= A[ i ][ j ] <= 10^9
// Time Limit: 1 sec
// For example:
// Input :
// A = [ [1, 2, 3], [4, 5, 6] ]
// Output :
// 1 2 3 4 5 6
// Explanation: 
// For the given matrix, the first row is [1, 2, 3], and the second is [4, 5, 6].
// For row-wise traversal, you must traverse the first row and then the second.
// Input Format:
// First-line contains 'T,' denoting the number of Test cases.
// For each Test case:
// The first line contains two integers, ‘N' and ‘M’.
// The following ‘N’ lines have ‘M’ integers each, denoting the matrix ‘A’.
// Output Format:-
// You must return the array with elements in order of row-wise traversal.
// Note:-
// You don’t need to print anything. Just implement the given function.

public class Solution {
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
		}
