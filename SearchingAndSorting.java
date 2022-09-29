import java.util.Arrays;

public class SearchingAndSorting {
	public static void main(String[] args) {
		int[] stuff = {-3, -1, 4, 10, 24, 31};
		
		// for (int i = 0; i < stuff.length; i++) {
		// 	binarySearch(stuff, stuff[i]);
		// }

		for (int x : stuff) {
			System.out.println(binarySearch(stuff, x));
		}
		System.out.println(binarySearch(stuff, -2));
		System.out.println(binarySearch(stuff, 8));
		System.out.println(binarySearch(stuff, 30));
		System.out.println(binarySearch(stuff, -10));
		System.out.println(binarySearch(stuff, 50));

		int[] stuff2 = {17, 4, 11, 3, -2, 21, 5};
		System.out.println(Arrays.toString(stuff2));
		selectionSort(stuff2);
		System.out.println(Arrays.toString(stuff2));
	}
	public static int binarySearch(int[] stuff, int key) {
		int left = 0;
		int right = stuff.length - 1;

		while (left <= right) {
			int mid = (left + right) / 2;

			if (key == stuff[mid]) {
				return mid;
			}
			else if (key < stuff[mid]) {
				right = mid - 1;
			}
			else {
				left = mid + 1;
			}
		}
		return -1;
	}

	public static void selectionSort(int[] x) {
		for (int j = 0; j < x.length - 1; j++) {
			int min = x[j];
			int minIndex = j;
			for (int i = j; i < x.length; i++) {
				if (x[i] < min) {
					min = x[i];
					minIndex = i;
				}
			}

			x[minIndex] = x[j];
			x[j] = min;
		}
	}
}