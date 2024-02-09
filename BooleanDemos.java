public class BooleanDemos {
	public static void main(String[] args) {
		System.out.println(2 < 8);
		System.out.println(1 == 2);
		System.out.println(1 != 2);
		System.out.println(7 > 7);
		System.out.println(7 >= 7);

		System.out.println(1 < 2 && 2 < 3);
		System.out.println(1 < 2 || 2 < 3);
		System.out.println(1 > 2 || 2 < 3);
		System.out.println(1 > 2 && 2 < 3);
		System.out.println(!(4 >= 5 || 5 < 6) && !(2 < 3));
	}
}