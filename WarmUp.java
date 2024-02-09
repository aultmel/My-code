public class WarmUp {
	public static void main(String[] args) {
		System.out.println(max(1000, 4, -3));
		System.out.println(max(4, 1002, -3));
		System.out.println(max(4, -3, 1001));
		int[] num = {1, 2, 3, 4};
		int[] num1 = {1, 2, -1};
		int[] num2 = {1, 3, 5, 7};
		System.out.println(countEvens(num));
		System.out.println(countEvens(num1));
		System.out.println(countEvens(num2));
	}
	public static int max(int a, int b, int c) {
		int highestVal = a; 
		if (b > a) {
			highestVal = b;
		}
		if (c > a && c > b) {
			highestVal = c;
		}
		return highestVal;
	}
	public static int countEvens(int[] numbers) {
		int count = 0;
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] % 2 == 0) {
				count++;
			}
		}
		return count;
	}
}