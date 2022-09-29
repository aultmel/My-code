public class Pixels {
	public static void main(String[] args) {
		int[][] rectangle = { {8, 9, 10}, {6, 7, 8}, {4, 5, 6}, {7, 8, 9} };
		printArray(rectangle);
		int[][] rotatedRectangle = rotate(rectangle);
		printArray(rotatedRectangle);
	}
	public static void printArray(int[][] rectangle) {
		for (int i = 0; i < rectangle.length; i++) {
			for (int j = 0; j < rectangle[i].length; j++) {
				System.out.print(rectangle[i][j] + " ");
			}
			System.out.println();
		}
	}
	public static int[][] rotate(int[][] rectangle) {
		int[][] rotatedRectangle = new int[rectangle[0].length][rectangle.length];
		for (int i = 0; i < rotatedRectangle.length; i++) {
			for (int j = 0; j < rotatedRectangle[i].length; j++) {
				rotatedRectangle[i][j] = rectangle[rectangle.length - 1- j][i];
			}
		}
		return rotatedRectangle;
	}
}