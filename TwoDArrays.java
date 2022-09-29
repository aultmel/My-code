public class TwoDArrays {
	public static void main(String[] args) {
		int[][] x = new int[3][4];

		x[0][0] = 11;
		x[0][1] = 10;
		x[0][2] = 7;
		x[0][3] = 8;
		x[1][0] = 2;
		x[1][1] = 9;
		x[1][2] = -1;
		x[1][3] = 3;
		x[2][0] = 1;
		x[2][1] = 7;
		x[2][2] = 5;
		x[2][3] = 6;

		int[][] y = {	{3, 48, 1},
						{0, 4, 2, 4},
						{9, 2},
						{11}	};
		for (int i = 0; i < x.length; i++) {
			for (int j = 0; j < x[i].length; j++) {
				System.out.println(x[i][j] + "\t");
			}
			System.out.println();
		}
	}
}