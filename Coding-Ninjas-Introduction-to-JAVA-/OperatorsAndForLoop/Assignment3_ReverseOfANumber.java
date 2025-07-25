//Problem statement
//Write a program to generate the reverse of a given number N. Print the corresponding reverse number.
//
//Note : If a number has trailing zeros, then its reverse will not include them. 
//For e.g., reverse of 10400 will be 401 instead of 00401.

package OperatorsAndForLoop;

import java.util.Scanner;

public class Assignment3_ReverseOfANumber {
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	        int N = sc.nextInt();
	        
	        int reversedNum = 0;
	        
	        if (N == 0) {
	            System.out.println(0);
	        } else {
	            while (N != 0) {
	                int digit = N % 10;
	                if (digit != 0 || reversedNum != 0) {
	                    reversedNum = reversedNum * 10 + digit;
	                }
	                N /= 10;
	            }
	            
	            System.out.println(reversedNum);
	        }
	    }
	}