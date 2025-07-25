// arr1 = {1,3,5} 
// arr2 = {2,4,6}
//
// i=2
// j=2
// k=4
//
// arr1[i] < arr2[j]
// 5 < 6
//
// ans[] = {1,2,3,4,5,6}

package Merge2Array;

import java.util.Scanner;

public class Marge2Array {

public static int[] MergeArray(int arr1[] , int arr2[]) 
{
	
    int ans[] = new int[arr1.length + arr2.length];
	
	int i = 0;
	int j = 0;
	int k = 0;
	
	while(i<arr1.length && j<arr2.length) 
	{
		if(arr1[i] < arr2[j]) 
		{
			ans[k] = arr1[i];
			k++;
			i++;
		} else {
			ans [k] = arr2[j];
			k++;
			j++;
		}
	}
	 		while(i<arr1.length) 
	 		{
	 			ans[k] = arr1[i];
				k++;
				i++;
	 		}
	 		while(j<arr2.length) 
	 		{
	 			ans [k] = arr2[j];
				k++;
				j++;
	 		}
	 		return ans;
}			

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int size1 = scan.nextInt();
		int arr1[] = new int [size1];
		for(int i = 0; i <size1; i++) {
			arr1[i] = scan.nextInt();		
			}
		
		int size2 = scan.nextInt();
		int arr2[] = new int [size2];
		for(int i = 0; i <size2; i++) {
			arr2[i] = scan.nextInt();
			}
	int merge[] = MergeArray(arr1, arr2);
	System.out.print("[");
	for(int num: merge) {
		
		System.out.print(num + ",");
	
	}
	System.out.println("]");
	}
	

}
