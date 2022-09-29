public class Animal {
	private String species;
	private boolean doesFly;
	private int numLegs;
	private double weight;

	public Animal() {
		this("great horned owl", true, 2, 2.5);
	}

	public Animal(String species, boolean doesFly, int numLegs, double weight) {
		setSpecies(species);
		setDoesFly(doesFly);
		setNumLegs(numLegs);
		setWeight(weight);
	}

	// Setter methods (mutators/modifiers)
	public void setSpecies(String species) {
		this.species = species;
	}

	public void setDoesFly(boolean newValue) {
		doesFly = newValue;
	}

	public void setNumLegs(int newValue) {
		numLegs = newValue;
	}

	public void setWeight(double newValue) {
		weight = newValue;
	}

	// Getter methods (accessors)
	public String getSpecies() {
		return species;
	}

	public boolean getDoesFly() {
		return doesFly;
	}

	public int getNumLegs() {
		return numLegs;
	}

	public double getWeight() {
		return weight;
	}



	public void eat(String food, double howMuch) {
		System.out.println("This " + species + " is happily eating " + food + "!");
		weight += howMuch;
	}

	public void eat(Animal victim) {
		eat(victim.species, victim.weight);
	}

	public void sleep() {
		System.out.println("This " + species + " is sleeping!");
	}

	public void defecate() {
		System.out.println("This " + species + " is undoing its eating!");
	}
}