//Problem statement
//Given an integer N, print all the prime numbers that lie in the range 2 to N (both inclusive).
//
//Print the prime numbers in different lines.


package OperatorsAndForLoop;

import java.util.Scanner;

public class AllPrimeNumber {

	public static void main(String[] args) {
		Scanner scan =  new Scanner(System.in);
        int n= scan.nextInt();

      
        for(int i =2; i<=n; i++) {

                   int count = 0;
                
                 for(int j =2;j<=i;j++) {

                if(i%j==0) 
                count++;
              

                   }if(count==1) 
                   System.out.println(i);
    

        }




}
}
