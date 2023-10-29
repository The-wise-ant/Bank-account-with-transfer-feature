
public class Main {

	public static void main(String[] args) {

		
		BankAccount tom = new BankAccount("Tom");
		tom.deposit(500.0);
		
		BankAccount sandy = new BankAccount("Sandy");
		sandy.deposit(200.0);
		
		tom.transfer(100.0, sandy);
		sandy.withdraw(50.0);
		sandy.withdraw(600.0);
		
		System.out.println(sandy.getBalance());


	}

}
