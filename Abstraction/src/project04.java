abstract class Payment
{
	void paymentStatus () {
		System.out.println("Payment in Process....");
	}
	abstract void makePayment(); 
}

class UPIPayment extends Payment
{

	void makePayment() 
	{
		System.out.println("Payment done by UPI ..");
	}

	
}

class CreditCardPayment extends Payment
{
	
	void makePayment() {
		System.out.println("Payment Doen by Credit Card ..");
		
	}
}

class NetBankingPayment extends Payment
{

	void makePayment() {
		System.out.println("Payment Doen by Net Banking ..");
	}
	
}
public class project04 {

	public static void main(String[] args) {
		
		UPIPayment UPI = new UPIPayment();
		UPI.makePayment();

		CreditCardPayment CCard = new CreditCardPayment();
		CCard.makePayment();
		
		NetBankingPayment netBank = new NetBankingPayment();
		netBank.makePayment();
	}

}
