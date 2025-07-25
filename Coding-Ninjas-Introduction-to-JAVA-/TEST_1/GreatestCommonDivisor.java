//Problem statement
//You are given two numbers, ‘X’ and ‘Y’. Your task is to find the greatest common divisor of the given two numbers.
//
//The Greatest Common Divisor of any two integers is the largest number that divides both integers.
//
//For Example:
//You are given ‘X’ as 20 and ‘Y’ as 15. The greatest common divisor, which divides both 15 and 20, is 5. Hence the answer is 5.


package TEST_1;

import java.util.Scanner;

public class GreatestCommonDivisor {

	public static void main(String[] args) {
		
			    Scanner sr = new Scanner(System.in);
				        int t = sr.nextInt();
						        while (t>0)
								        {
										        int Temp ,GCD;
												        int Num1 = sr.nextInt();
														        int Num2 = sr.nextInt();
																        while(Num2 != 0)  
																		        {  
																				        Temp = Num2;  
																						        Num2 = Num1 % Num2;  
																								        Num1 = Temp;  
																										        }  
																												        GCD = Num1;  
																														        System.out.println(GCD);  
																																		t--;
																																		        }
																																				        
																																							}
																																							}
																																							