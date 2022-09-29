import java.util.Random;

public class RandomDemo {
	public static void main(String[] args) {
		Random matt = new Random();
		int result = matt.nextInt();
		System.out.println(result);
		result = matt.nextInt(6);
		System.out.println(result);
		result = matt.nextInt(6) + 1;
		System.out.println(result);
		result = matt.nextInt(6) + 1;
		System.out.println(result);
		result = matt.nextInt(6) + 1;
		System.out.println(result);
		result = matt.nextInt(6) + 1;
		System.out.println(result);

	}
}