package CGOL;

/**
 * Description :  CGOL using Multithreading method
 * 
 * @author Harini Sriya
 * 
 * @version 1.00 18-11-2019 Implementing all rules of CGOL using Multithreading method
 *          
 *
 */
public class Console extends Thread {

	private int[][] grid;

	public Console(int[][] grid) {

		this.grid = grid;
	}

	public void run() {

		int[][] array = new int[5][5];
		// Calculating the time elapsed so far.
		long startTime = System.nanoTime();

		int aliveNeighbours = 0;
		// Loop through every cell of the every row and column
		for (int row = 1; row < 4; row++) {

			for (int col = 1; col < 4; col++) {
				// Finding how many cells are alive
				aliveNeighbours = 0;

				int l, k;

				for (l = -1; l <= 1; l++) {

					for (k = -1; k <= 1; k++) {

						if (grid[row + l][col + k] == 1) {

							aliveNeighbours++;

						}

					}

				}

				aliveNeighbours = aliveNeighbours - grid[row][col];

				if (aliveNeighbours < 2)

					array[row][col] = 0;

				else if (aliveNeighbours > 3)

					array[row][col] = 0;

				else if (aliveNeighbours == 3)

					array[row][col] = 1;

				else if (aliveNeighbours == 2) {

					if (grid[row][col] == 1) {
						array[row][col] = 1;
					} else
						array[row][col] = 0;
				}
			}
		}
		int d, e;

		System.out.println();

		System.out.println("New Generation:");

		for (d = 0; d < 5; d++) {

			for (e = 0; e < 5; e++) {
				System.out.print("" + array[d][e]);

			}

			System.out.println();

		}

		// Calculating the time 
		long time = System.nanoTime() - startTime;
		System.out.println("Time taken to generate the next Generation execution time: " + time + " ns");

	}
}
