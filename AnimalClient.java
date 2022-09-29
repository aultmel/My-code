public class AnimalClient {
	public static void main(String[] args) {
		Animal sloth = new Animal("two-toed sloth", true, 8, 0.02);
		Animal owl = new Animal("great horned owl", true, 2, 2.5);

		// System.out.println(sloth.species);
		System.out.println(sloth.getSpecies());
		System.out.println(sloth.getDoesFly());
		System.out.println(sloth.getNumLegs());
		System.out.println(sloth.getWeight());

		sloth.eat("an unlucky human", 185);
		sloth.sleep();
		sloth.defecate();

		System.out.println(sloth.getWeight());

		System.out.println(owl.getWeight());

		owl.eat("a formerly happy rodent", 0.3);
		System.out.println(owl.getWeight());

		System.out.println(sloth.getWeight());
		sloth.eat(owl);
		System.out.println(sloth.getWeight());
	}
}