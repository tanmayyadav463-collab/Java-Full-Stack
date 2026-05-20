package Package;

import java.util.Scanner;

class ATM
{
	private int pin;
	private double balance;
	
	ATM(double balance){
		this.balance = balance;
	}
	
	public void setPin(int pin) 
	{
		this.pin = pin;
	}
	
	public boolean verifyPin(int enteredPin) 
	{
		return this.pin == enteredPin;
	}
	
	public void Withdraw(int enteredPin, double amount) {
		
		if(verifyPin(enteredPin)) {
			if(amount <= balance) {
				balance -= amount;
				System.out.println("withdrawal successful..");
				System.out.println("Remining Balance : " + balance);
			}else {
				System.out.println("Insuffisent balance");
			}
		}else {
			System.out.println("Incorrect PIN");
		}
	}
	
	public void showBalance(int enteredPin) {
		if(verifyPin(enteredPin)) {
			System.out.println("Account Balance : " + balance);
		}else {
			System.out.println("Invalid pin");
		}
	}
	
}
public class project04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		ATM atm = new ATM(10000);
		
		atm.setPin(2255);
		
		System.out.println("Enter PIN : ");
		int userPin = sc.nextInt();
		
		System.out.println("Enter the Withdrawal Amount : ");
		double amount = sc.nextDouble();
		
		atm.Withdraw(userPin, amount);
		
		atm.showBalance(userPin);

	}

}
