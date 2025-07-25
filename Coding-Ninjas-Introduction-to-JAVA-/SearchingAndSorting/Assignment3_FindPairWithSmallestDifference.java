//Problem statement
//Given two unsorted arrays of non-negative integers, 'arr1' and 'arr2' of size 'N' and 'M', respectively. 
//Your task is to find the pair of elements (one from each array), 
//such that their absolute (non-negative) difference is the smallest, and return the min difference.

package SearchingAndSorting;

import java.util.Scanner;

public class Assignment3_FindPairWithSmallestDifference {
	 public static int smallestDifferencePair(int []arr1, int n, int []arr2, int m) {
         

         int p = 0, q = 0; 
                 int minDiff = Math.abs(arr1[0] - arr2[0]); 
                         for (int i = 0; i < arr1.length - 1; i++)  
                                 {  
                                             int index = i;  
                                                         for (int j = i + 1; j < arr1.length; j++){  
                                                                         if (arr1[j] < arr1[index]){  
                                                                                             index = j;  
                                                                                                             }  
                                                                                                                         }  
                                                                                                                                     int smallerNumber = arr1[index];   
                                                                                                                                                 arr1[index] = arr1[i];  
                                                                                                                                                             arr1[i] = smallerNumber;  
                                                                                                                                                                     }
                                                                                                                                                                             for (int i = 0; i < arr2.length - 1; i++)  
                                                                                                                                                                                     {  
                                                                                                                                                                                                 int index = i;  
                                                                                                                                                                                                             for (int j = i + 1; j < arr2.length; j++){  
                                                                                                                                                                                                                             if (arr2[j] < arr2[index]){  
                                                                                                                                                                                                                                                 index = j;  
                                                                                                                                                                                                                                                                 }  
                                                                                                                                                                                                                                                                             }  
                                                                                                                                                                                                                                                                                         int smallerNumber = arr2[index];   
                                                                                                                                                                                                                                                                                                     arr2[index] = arr2[i];  
                                                                                                                                                                                                                                                                                                                 arr2[i] = smallerNumber;  
                                                                                                                                                                                                                                                                                                                         }  
                                                                                                                                                                                                                                                                                                                                 while (p < n && q < m) { 
                                                                                                                                                                                                                                                                                                                                             minDiff = Math.min(minDiff, Math.abs(arr1[p] - arr2[q])); 
                                                                                                                                                                                                                                                                                                                                                         if (arr1[p] < arr2[q]) { 
                                                                                                                                                                                                                                                                                                                                                                         p++; 
                                                                                                                                                                                                                                                                                                                                                                                     } else {
                                                                                                                                                                                                                                                                                                                                                                                                     q++; 
                                                                                                                                                                                                                                                                                                                                                                                                                 } 
                                                                                                                                                                                                                                                                                                                                                                                                                         } 
                                                                                                                                                                                                                                                                                                                                                                                                                                 return minDiff; 

                                                                                                                                                                                                                                                                                                                                                                                                                                     }
                                                                                                                                                                                                                                                                                                                                                                                                                                     
public static void main(String[] args)
{
    Scanner sr = new Scanner(System.in);
    int t= sr.nextInt();
    while(t > 0)
    {
        int n=sr.nextInt();
        int m = sr.nextInt();
        int a[] = new int[n];
        for(int i = 0 ; i<n ;i++)
        {
            a[i] = sr.nextInt();
        }
        
        int b[] =new int[m];
        //int index=0;
        for(int i=0;i<m;i++)
        {
            b[i]=sr.nextInt();
        }
        int ans;
        ans =Assignment3_FindPairWithSmallestDifference.smallestDifferencePair(a, n, b, m);
        System.out.println(ans);
        t = t-1;
    }
}
}

                                                                                                                                                                                                                                                                                                                                                                                                                                     