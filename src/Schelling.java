import java.util.Random;

public class Schelling {
	
	private static final int N = 9;
	private static final long seed = 100;
	private static int[][] grid;

	public static void main(String[] args) {
		grid = new int[N][N];
		populateGrid();
		printGrid();
	}
	
	private static void populateGrid() {
		final Random rng = new Random(seed);
		for (int[] row : grid) {
			for (int cell : row) {
				cell = rng.nextInt(2);
			}
		}
	}
	
	private static void printGrid() {
		for (int[] row : grid) {
			for (int cell : row) {
				System.out.print(cell + " ");
			}
			System.out.println();
		}
	}

}
