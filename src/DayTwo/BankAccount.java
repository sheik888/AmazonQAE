package DayTwo;

public class BankAccount {
	public  String accountNumber;
	public String accountHolder;
	public double Balance;
	public java.lang.String accountHolder1;
	public BankAccount(String accountNumber, String accountHolder, double initialBalance) {
		this.accountHolder = accountNumber;
		this.accountHolder = accountHolder;
		this.Balance = initialBalance;	
		
	}
	 void deposit(double amount) {
		if(amount > 0) {
			Balance += amount;
			System.out.println("Deposit: $" + amount);
		}
		else {
			System.out.println("Invalid deposit amount");
			
		}
	 }
	 public boolean withdraw(double amount) {
		if (amount > 0 && amount <= Balance) {		
			Balance -= amount;
			System.out.println("withdrawn: $" + amount);
			return true;
			}
	 else { 
		 
		 System.out.println("Insufficient Balance or Invalid withdrawal amount.");
		return false;
	 }
	 }


	 public double getBalance() {
	return this.Balance;
}

	
	 public void displayAccountInfo() {
	System.out.println("Account Number:" + this.accountNumber);
	System.out.println("Account Holder: " + this.accountHolder);
	System.out.println("Balance: $" + this.getBalance());
}


	 public static void main(String[] args) {
	
	BankAccount account = new BankAccount("919010012345717", "Musthafa", 1000.0);
	
	
	account.deposit(200.000);
	account.withdraw(100.00);
	account.withdraw(1200.00);
	
	account.displayAccountInfo();
	
}
	
}