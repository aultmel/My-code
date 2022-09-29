public class BankAccountClient {
	BankAccount student = new BankAccount("Poor College Student");

	BankAccount duck = new BankAccount("Scrooge McDuck", 50000, false, 2.15);

	student.deposit(500);

	duck.withdraw(8000);

	student.setInterestRate(student.getInterestRate() + 0.5);
	duck.setInterestRate(duck.getInterestRate() + 0.5);
}