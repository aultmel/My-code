public class CarClient {
	public static void main(String[] args) {
		Car porsche = new Car("Porsche", "Cayman GTS", "black", 80700);
		Car toyota = new Car("Toyota", "Corolla", "red", 19500);
		porsche.displayCarInfo();
		toyota.displayCarInfo();
		porsche.paint("green");
		toyota.paint("blue");
		porsche.travel(7500);
		toyota.travel(5000);
		porsche.setPrice(72000);
		toyota.setPrice(15000);
		porsche.displayCarInfo();
		toyota.displayCarInfo();
	}
}