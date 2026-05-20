package Package;

class BankAccount
{
	private int accountNumber;
	private String accountHolder;
	private double balance;
	
	public void setAccountDetails(int accountNumber, String accountHolder, double balance) 
	{
		this.accountNumber = accountNumber;
		this.accountHolder = accountHolder;
		this.balance = balance;
	}
	
	public void getAccountDetails()
	{
		System.out.println("Account Number : " + accountNumber);
		System.out.println("Account Holder Name : " + accountHolder);
		System.out.println("Account Balance : " + balance);
	}
	
	public void deposit(double amount)
	{
		balance += amount;
		System.out.println("Account Balance : " + balance);
	}
	
	public void withdraw(double amount)
	{
		if (balance >= amount) {
			balance -= amount;
			System.out.println("Account Balance After Withdraw : " + balance);
		}else {
			System.out.println("insufisent balance..");
		}
	}
	
	
}

public class Project01 {

	public static void main(String[] args) {
		BankAccount BA = new BankAccount();
		BA.setAccountDetails(1234, "Tanmay", 5000);
		
		BA.getAccountDetails();
		
		BA.deposit(10000);
		
		BA.withdraw(5000);

	}

}
