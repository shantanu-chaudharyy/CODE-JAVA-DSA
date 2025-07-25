package BinarySearch;

import java.util.Scanner;

public class BinarySearch1 {

	public static int[] takeinput() {
		
		Scanner scan = new Scanner(System.in);
		int size = scan.nextInt();
		int arr[] = new int[size];
		
		for(int i = 0; i < size; i++) {
			
			arr[i] = scan.nextInt();
			
		}
		return arr;
	}
	
	public static int BinarySearch(int arr[]) {
		
		Scanner scan = new Scanner(System.in);
		int target = scan.nextInt();
		
		int start = 0;
		int end = arr.length-1;
		while(start<=end) {
			int mid = (start + end)/2;
			
			if(arr[mid] == target) {
				
				return mid;
			} else if(target > arr[mid]) {
				
				start = mid +1;
			} else {
				end = mid - 1;
			}
		
		}
		return -1;
	}
	
	
	public static void main(String[] args) {
		
		int arr[] = takeinput();
		int s = BinarySearch(arr);
        System.out.println(s);
	}

}
