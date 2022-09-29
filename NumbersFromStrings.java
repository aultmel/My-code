public class NumbersFromStrings {
	public static void main(String[] args) {
		String stuff = "98379495738";

		for (int i = 0; i < stuff.length(); i++) {
			char c = stuff.charAt(i);
			int intValue = (int)c - '0';
			System.out.println(intValue);
		}
	}
}