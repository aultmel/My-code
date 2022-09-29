/*
Some more examples of methods involving arrays.
*/

public class MoreArrayMethods {
	public static void main(String[] args) {
		// Two arrays of string values
		String[] names = {"Aladdin", "Jasmine", "Abu", "Jafar", "Iago", "Genie", "Prince Ali", "Raja", "Iago", "Carpet"};
		String[] names2 = {"Bob", "Cal", "Don", "John", "Top", "Jan", "Fran", "Sue", "Jen", "Pam"};

		// Search the names array for various values
		System.out.println(linearSearch(names, "Jasmine"));
		System.out.println(linearSearch(names, "Iago"));
		System.out.println(linearSearch(names, "The Sultan"));

		// Combine the names and names2 arrays into a larger array, and
		//  print that larger array
		printArray(combineArrays(names, names2));
	}


	// This method searches the specified string array for a certain
	//  target value, called a key.
	// Linear search works simply by checking every element starting
	//  from index 0 to see if it matches the key.
	// Parameters:	an array of string values
	//				a target string (key) to search for
	// Returns:		the index of the key's first occurrence in the array
	//				 if found, or -1 if not found
	public static int linearSearch(String[] collection, String key) {
		// Look through each index of collection...
		for (int i = 0; i < collection.length; i++) {
			if (collection[i].equals(key)) {
				return i;
			}
		}

		// The only possible way to get to this point in the method
		//  is for the loop to run through the array without ever
		//  returning i.  This means the key was never found
		//  in the array.
		return -1;
	}


	// Combines two string arrays into a larger string array.
	// Parameters:	two arrays of strings
	// Returns:		an array containing the combined elements of both arguments,
	//				 in the same order that they appeared within each argument
	public static String[] combineArrays(String[] a, String[] b) {
		// Create a new array of the proper length
		String[] c = new String[a.length + b.length];

		// Copy all of a's elements into c
		for (int i = 0; i < a.length; i++) {
			c[i] = a[i];
		}

		// Copy all of b's elements into result
		for (int i = 0; i < b.length; i++) {
			c[i + a.length] = b[i];
		}

		return c;
	}


	// Prints the elements of a string array on a single line,
	//  with a space after each element.
	// Parameters:	an array of strings
	// Returns:		none
	public static void printArray(String[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}
}
