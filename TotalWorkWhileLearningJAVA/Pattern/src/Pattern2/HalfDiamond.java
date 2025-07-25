package Pattern2;

import java.util.Scanner;

public class HalfDiamond {
    public static void main(String[] args) {
		
	
	Scanner scan = new Scanner(System.in);
	int n = scan.nextInt();
	
//	System.out.println("*");
//	int i =1;
//	while(i<=n) {
//		System.out.print("*");
//	int	j=1;
//		while(j<=i) {
//			System.out.print(j);
//			j++;
//		
//			}
//		j =1;
//		int start = i - 1;
//		while(j<=i-1) {
//			System.out.print(start);
//		
//			j++;
//			start--;
//		}
//		System.out.print("*");
//		System.out.println();
//		i++;
//		}
//	i =1;
//	int start =n- i + 1;
//	while(i<=n) {
//		System.out.print("*" );
//		int j = 1;
//		while(j<=n-i+1) {
//			System.out.print(start);
//			j++;
//			
//		}
//		System.out.print("*");
//	
//		System.out.println();
//		i++;
//	}
//	System.out.println("*");
//
//		}
// }

	
    System.out.println("*");

    // Upper half of the diamond
    int i = 1;
    while (i <= n) {
        System.out.print("*");
        int j = 1;
        while (j <= i) {
            System.out.print(j);
            j++;
        }
        j = i - 1;
        while (j >= 1) {
            System.out.print(j);
            j--;
        }
        System.out.print("*");
        System.out.println();
        i++;
    }
    i = 1;
    while (i <= n-1) {
        System.out.print("*");
        int j = 1;
      
        while (j <= i) {
            System.out.print(j);
            j++;
        }
        j=i-1;
        while(j>=1) {
        	System.out.print(j);
        	j--;
        }
        System.out.print("*");
        System.out.println();
        i--;
    }
    System.out.println("*");
}
}
