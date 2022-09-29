import java.util.Scanner;

public class ArrayMethods {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		int[] data = {1, 2, 3, 4};
		for (int i = 0; i < data.length; i++) {
			System.out.print(data[i] + " ");
		}
		System.out.println();
		System.out.print("Enter size: ");
		int size = scnr.nextInt();
		int[] resizedArray = resize(data, size);
		
		for (int i = 0; i < resizedArray.length; i++) {
			System.out.print(resizedArray[i] + " ");
		}
	}
	public static void scale(int[] data, int k) {
		for (int i = 0; i < data.length; i++) {
			data[i] *= k;
		}
	}
	public static int[] resize(int[] data, int size) {
		int[] resizedArray = new int[size];
		if (size < data.length) {
			for (int i = 0; i < size; i++) {
				resizedArray[i] = data[i];
			}
		}
		else {
			for (int i = 0; i < data.length; i++) {
				resizedArray[i] = data[i];
			}
			for (int i = data.length; i < size; i++) {
				resizedArray[i] = 0;
			} 
		} 
		return resizedArray;
	}
}