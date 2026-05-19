import java.util.Scanner;

interface Payment
{
	void pay(double amt);
}

class UPIPay implements Payment
{

	@Override
	public void pay(double amt) {
		
		System.out.println("Amount payed by UPI : " + amt);	
	}
	
}

class CreditCard implements Payment
{

	@Override
	public void pay(double amt) {
		System.out.println("Amount payed by Credit card : " + amt);	
	}
	
}

class NetBanking implements Payment
{

	@Override
	public void pay(double amt) {
		System.out.println("Amount payed by Net Banking : " + amt);	
	}
	
}
public class Project01 {

	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String option;
		
		do {
			
			System.out.println("Enter the way of payment : ");
			int choice = sc.nextInt();
			System.out.println("------------------------------------------------");

			
			System.out.println("Enter the amount : ");
			double amt = sc.nextInt();

			
			
			System.out.println("----------- Choice Payment Method --------------");
			System.out.println("1. UPI Pay..");
			System.out.println("2. Credit Card Pay.. ");
			System.out.println("3. Net Banking Pay .. ");
			System.out.println("------------------------------------------------");
			
			
			switch(choice)
			{
			case 1:
				System.out.println("You choosed UPI Pay");
				UPIPay upi = new UPIPay();
				upi.pay(amt);
			break;
			
			case 2:
				System.out.println("You choosed Credit Card");
				UPIPay cc = new UPIPay();
				cc.pay(amt);
			break;
	
			case 3:
				System.out.println("You choosed Net Banking");
				UPIPay nb = new UPIPay();
				nb.pay(amt);
			break;
			default : 
				System.out.println("your option is wrong Please Try agin");
	
			}
			System.out.println("------------------------------------------------");

			System.out.println("you want to continue (y/n) : ");
			option = sc.next();
			System.out.println("------------------------------------------------");

		}while((option.equals("y")) || (option.equals("y")));
		
		
		
		
	}

}
