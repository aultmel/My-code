public class VariableDemos {
	public static void main(String[] args) {
		int x = 7;
		int y = x;

		System.out.println("x = " + x + ", y = " + y);
		x = 14;
		System.out.println("x = " + x + ", y = " + y);

		// Swap the values of x and y
		int oldX = x;
		x = y;
		y = oldX;
		System.out.println("x = " + x + ", y = " + y);

		x = x + 1;
		System.out.println("x = " + x + ", y = " + y);

		x += 1;
		x++;
		++x;
		y = y % 6;
		System.out.println("x = " + x + ", y = " + y);

		y %= 2;
		System.out.println("x = " + x + ", y = " + y);
		
	}
}