package While;

import java.util.Scanner;

public class FehToCelc {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int S = scan.nextInt();
		int E = scan.nextInt();
		int W = scan.nextInt();
		
		while (S<=E) {
			
			int c = 5*(S-32)/9;
				
			System.out.println( S + " " + c);
			S+=W;
		}


			}

		}
