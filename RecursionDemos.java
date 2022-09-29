public class RecursionDemos {
	public static void main(String[] args) {
		for (int i = 0; i <= 50; i++) {
			System.out.println("fibo(" + i + ") = " + fibo(i));
		}
	}

	public static int factorial(int n) {
		if (n == 1) {
			return 1;
		}
		else {
			return n * factorial(n-1);
		}
	}

	public static int fibo(int n) {
		if (n == 0) {
			return 0;
		}
		else if (n == 1) {
			return 1;
		}
		else {
			return fibo(n - 1) + fibo(n - 2);
		}
	}
}