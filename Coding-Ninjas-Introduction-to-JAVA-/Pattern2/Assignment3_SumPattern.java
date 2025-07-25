//Problem statement
//Write a program to print triangle of user defined integers sum.

package Pattern2;

import java.util.Scanner;

public class Assignment3_SumPattern {
	public static void main(String[] args) {
		  Scanner scanner = new Scanner(System.in);
				        
				   
				        int N = scanner.nextInt();
				  

				        int i = 1;
				        while (i <= N) {
				            int j = 1;
				            int sum = 0; // Reset sum for each line
				            while (j <= i) {
				                System.out.print(j);
				                if (j < i) {
				                    System.out.print("+");
				                }
				                sum += j;
				                j++;
				            }
				            System.out.println("=" + sum);
				            i++;
				        }
				    }
				}
