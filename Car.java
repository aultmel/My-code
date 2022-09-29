public class Car {
	private String make;
	private String model;
	private String color;
	private double price;
	private double mileage;

	public Car() {
		this("Honda", "The Mystery Machine", "blue and green", 10.00);
	}

	public Car(String make, String model, String color, double price) {
		double mileage = 0.0;
		this.make = make;
		this.model = model;
		this.color = color;
		this.price = price;
	}

	public void setPrice(double p) {
		price = p;
	}

	public void paint(String c) {
		color = c;
	}

	public void displayCarInfo() {
		System.out.format("This car is a %s %s %s that costs $%.2f with %.2f miles on it.", color, make, model, price, mileage);
		System.out.println();
	}

	public void travel(double distance) {
		System.out.println("This car is traveling for " + distance + " miles.");
		mileage += distance;
	}

}