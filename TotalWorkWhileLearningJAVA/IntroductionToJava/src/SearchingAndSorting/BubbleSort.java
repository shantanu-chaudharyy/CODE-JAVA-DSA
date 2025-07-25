//Problem statement
//Sort the given unsorted array 'arr' of size 'N' in non-decreasing order using the selection sort algorithm.

package SearchingAndSorting;

import java.util.Scanner;

public class BubbleSort {
	public static int[] takeinput()

	{
		Scanner scan = new Scanner(System.in);
		int size = scan.nextInt();

		int arr[] = new int[size];

		for (int i = 0; i < size; i++) {
			arr[i] = scan.nextInt();
		}
		return arr;
	}

	public static void BubbleSort(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < arr[i]) {

					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}

	public static void main(String[] args) {

		int input[] = takeinput();

		BubbleSort(input);

		for (int i = 0; i < input.length; i++) {
			System.out.print(input[i] + " ");
		}
	}

}
