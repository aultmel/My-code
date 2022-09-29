public class MethodsAndReferences {
	public static void main(String[] args) {
		int x = 20;
		System.out.println("in main: x = " + x);
		doSomething(x);
		System.out.println("in main: x = " + x);

		int[] y = {10, 20, 30};
		System.out.println("in main: y[0] = " + y[0]);
		doSomething(y);
		System.out.println("in main: y[0] = " + y[0]);
	}
	public static void doSomething(int x) {
		System.out.println("in doSomething: x = " + x);
		x = 13;
		System.out.println("in doSomething: x = " + x);
	}

	public static void doSomething(int[] x) {
		System.out.println("in doSomething: x[0] = " + x[0]);
		x[0] = 13;
		System.out.println("in doSomething: x[0] = " + x[0]);
	}
}