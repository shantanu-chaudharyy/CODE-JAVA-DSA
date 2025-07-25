//Problem statement
//Ninja was playing with her sister to solve a puzzle pattern. However, even after taking several hours, they could not solve the problem.
//
//A value of N is given to them, and they are asked to solve the problem. Since they are stuck for a while, they ask you to solve the problem. Can you help solve this problem?
//
//Example : Pattern for N = 4
//
//****
// ***     
//  **
//   *

package TEST_1;

import java.util.Scanner;

public class YetAnotherPattern {

	public static void main(String[] args)  
	{
		    Scanner sr = new Scanner(System.in);
			        int t = sr.nextInt();
					        while (t>0)
							        {
									        int n= sr.nextInt();
													for (int i = 0; i < n; i++) 
															{

																		for (int j = 0; j < n; j++) 
																					{

																									if (j >= i) 
																													{
																																		System.out.print("*");
																																						} else {
																																											System.out.print(" ");
																																															}
																																																		}
																																																					System.out.println();
																																																							}
																																																									t-=1;
																																																											
																																																											        }
																																																														}
																																																														}
																																																														