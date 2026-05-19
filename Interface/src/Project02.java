import java.util.Scanner;

interface BankOperations
{
	void deposit(double amount);
	
	void CheckBalance();

	void Withdraw(double amount);
	
	
	
}

class SBI implements BankOperations
{
	double balance = 5000;
	
	@Override
	public void deposit(double amount) {
		balance += amount;
		System.out.println("Deposit : " + amount);
		
	}

	@Override
	public void Withdraw(double amount) {
		 if (amount <= balance) {
	            balance -= amount;
	            System.out.println("Amount Withdrawn: " + amount);
	        } else {
	            System.out.println("Insufficient Balance!");
	        }
	}

	@Override
	public void CheckBalance() {
		System.out.println("Balance  : " + balance);
		
	}
	
}

class HDFC implements BankOperations
{
	double balance = 10000;
	
	@Override
	public void deposit(double amount) {
		System.out.println("Deposit : " + amount);
		
	}

	@Override
	public void Withdraw(double amount) {
		System.out.println("Withdraw : " + amount);
		
	}

	@Override
	public void CheckBalance() {
		System.out.println("Balance  : " + balance);
		
	}
	
}
public class Project02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
        BankOperations bank = null;

        System.out.println("Select Bank:");
        System.out.println("1. SBI");
        System.out.println("2. HDFC");

        int choice = sc.nextInt();

        if (choice == 1) {
            bank = new SBI();
        } else if (choice == 2) {
            bank = new HDFC();
        } else {
            System.out.println("Invalid Bank Selection!");
        }

        System.out.print("Enter Deposit Amount: ");
        double depositAmount = sc.nextDouble();
        bank.deposit(depositAmount);

        System.out.print("Enter Withdraw Amount: ");
        double withdrawAmount = sc.nextDouble();
        bank.Withdraw(withdrawAmount);

        bank.CheckBalance();

        
	}

}
