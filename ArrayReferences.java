/*
Illustration of array references and how they behave
*/
public class ArrayReferences {
	public static void main(String[] args) {
		// x and y are two completely separate arrays,
		//  in two different memory locations.  The array
		//  variables x and y are called references; they
		//  store the memory address of index 0 of each
		//  array.
		int[] x = {7, 0, 3, 10, 5};
		int[] y = {7, 0, 3, 10, 5};	// y is a deep copy of x

		if (x == y) {	// Checks whether the memory addresses of x and y are the same (they are not)
			System.out.println("x and y are equal");
		}
		else {
			System.out.println("x and y are not equal");
		}

		if (areEquivalent(x, y)) {	// Calls our areEquivalent method to determine if x and y are the same length, and contain the same elements in the same order (they do)
			System.out.println("x and y are equivalent");
		}
		else {
			System.out.println("x and y are not equivalent");
		}

		// Because x and y refer to two different memory locations,
		//  changing y[0] does *not* affect x[0]
		y[0] = 17;
		System.out.println("y[0] = " + y[0]);		
		System.out.println("x[0] = " + x[0]);

		// This line creates a new array reference named z, which points
		//  to the same address as x.  z is *not* a separate array, but
		//  rather just another reference to the same data stored by x.
		int[] z = x;	// z is a shallow copy of x
		if (x == z) {	// Checks whether the memory addresses of x and z are the same (they are)
			System.out.println("x and z are equal");
		}
		else {
			System.out.println("x and z are not equal");
		}

		// Because x and z refer to the same memory location, changing
		//  z[0] *does* affect x[0]
		z[0] = 17;
		System.out.println("z[0] = " + z[0]);
		System.out.println("x[0] = " + x[0]);
	}

	// This method determines whether the arrays a1 and a2 are
	//  "equivalent" -- i.e., they have the same length, and
	//  contain the same elements in the same order.
	// Parameters:	two int arrays
	// Returns:		true if the parameters are equivalent, false if not
	public static boolean areEquivalent(int[] a1, int[] a2) {
		// First check the length
		if (a1.length != a2.length) {
			return false;
		}

		// Once a method reaches a return statement, it stops
		//  all further execution.  So the only way for this
		//  method to make it here is if a1.length and a2.length
		//  are the same.

		// Now check each a1[i] vs. a2[i]
		for (int i = 0; i < a1.length; i++) {
			if (a1[i] != a2[i]) {
				return false;
			}
		}

		// The only way for the method to make it here is if
		//  a1[i] was *never* != a2[i].  In other words, the arrays
		//  contain the same elements in the same order!
		return true;
	}
}
