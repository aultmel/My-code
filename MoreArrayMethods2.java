public class MoreArrayMethods2 {
	public static void main(String[] args) {
		int[] image = {8, 4, 12, 16, 2, 10};
		printArray(image);
		int[] smoothed = smooth(image);

		printArray(smoothed);

		int[] image2 = {8, 4};
		printArray(image2);
		int[] smoothed2 = smooth(image2);
		printArray(smoothed2);
	}
	public static int linearSearch(String[] collection, String key) {
		for (int i = 0; i < collection.length; i++) {
			if (collection[i].equals(key)) {
				return i;
			}
		}
		return -1;
	}
	public static String[] combineArrays(String[] a, String[] b) {
		String[] c = new String[a.length + b.length];

		for (int i = 0; i < a.length; i++) {
			c[i] = a[i];
		}
		for (int i = 0; i < b.length; i++) {
			c[a.length + i] = b[i];
		}
		return c;
	}
	public static void printArray(String[] x) {
		for (int i = 0; i < x.length; i++) {
			System.out.print(x[i] + " ");
			System.out.println();
		}
	}
	public static void printArray(int[] x) {
		for (int i = 0; i < x.length; i++) {
			System.out.print(x[i] + " ");
		}
		System.out.println();
	}

	public static void showChart(String[] labels, int[] data, int maxWidth) {
		if (labels.length == data.length) {
			int max = findMax(data);
			for (int i = 0; i < labels.length; i++) {
				System.out.format("%12s", labels[i] + " ");
				for (int j = 0; j < (double)data[i] / max * maxWidth; j++) {
					System.out.print("-");
				}
				System.out.println(data[i]);
			}
		}
		else {
			System.out.println("Inconsistent lengths in labels and data");
		}
	}

	public static int findMax(int[] x) {
		int max = x[0];
		for (int i = 1; i < x.length; i++) {
			if (x[i] > max) {
				max = x[i];
			}
		}
		return max;
	}

	public static void reverse(int[] x) {
		for (int i = 0; i < x.length / 2; i++) {
			int temp = x[i];
			x[i] = x[x.length - 1 - i];
			x[x.length - 1 - i] = temp;
		}	
	}
	public static int[] smooth(int[] image) {
		int[] result = new int[image.length];
		if (image.length == 1) {
			result[0] = image[0];
		}
		else {
			for (int i = 1; i < image.length - 1; i++) {
				result[i] = (image[i - 1] + image[i] + image[i + 1]) / 3	;
			}
			result[0] = (image[0] + image[1]) / 2;
			result[image.length - 1] = (image[image.length - 2] + image[image.length - 1]) / 2;
		}
		return result;
	}
}