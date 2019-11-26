package CGOL;

import java.util.Scanner;

/**
 * Description :  CGOL using Multithreading method
 * 
 * @author Harini Sriya
 * 
 * @version 1.00 18-11-2019 Implementing all rules of CGOL using Multithreading method
 *          
 *
 */

public class Multi {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int grid[][] = new int[5][5];

		int row = 0, col = 0;

		for (row = 0; row < 5; row++) {

			for (col = 0; col < 5; col++) {

				System.out.println("Enter a value 0 or 1 at grid[" + row + "][" + col + "]");

				grid[row][col] = sc.nextInt();

			}

		}

		System.out.println("Original Generation:");

		for (row = 0; row < 5; row++) {

			for (col = 0; col < 5; col++) {

				System.out.print("" + grid[row][col]);

			}

			System.out.println("");

		}

		Console cr = new Console(grid);
		cr.start();

	}

}
