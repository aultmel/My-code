public class ArrayReferences2 {
	public static void main(String[] args) {
		int[] x = {17, 5, -4, 0, 2};
		int[] y = {17, 5, -4, 0, 2}; //	y is a deep copy of x

		if (x == y) {
			System.out.println("x and y are equal");
		}
		else {
			System.out.println("x and y are not equal");
		}
		if (areEquivalent(x, y)) {
			System.out.println("x and y are equivalent");
		}
		else {
			System.out.println("x and y are not equivalent");
		}

		y[0] = -8;
		System.out.println("y[0] = " + y[0]);
		System.out.println("x[0] = " + x[0]);

		int[] z = x;	// z is a shallow copy of x
		if (x == z) {
			System.out.println("x and z are equal");
		}
		else {
			System.out.println("x and z are not equal");
		}

		z[0] = -8;
		System.out.println("z[0] = " + z[0]);
		System.out.println("x[0] = " + x[0]);
	}

	public static boolean areEquivalent(int[] a, int[] b) {
		if (a.length != b.length) {
			return false;
		}

		for (int i = 0; i < a.length; i++) {
			if (a[i] != b[i]) {
				return false;
			}
		}
		return true;
	}
}