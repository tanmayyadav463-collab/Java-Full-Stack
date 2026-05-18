import java.util.Scanner;

public class bankWithdrawalCharges {

	public static void main(String[] args) {
//		Calculate withdrawal charges:
//			• First ₹10,000 → No charge
//			• Next ₹10,000 → 2% charge
//			• Above ₹20,000 → 5% charge
//			Display total deduction.
		
		int withdrawalAmount;
		int totalWithdrawalAmount = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the withdrawal Amount : ");
		withdrawalAmount = sc.nextInt();
		
		if (withdrawalAmount < 10000) {
			totalWithdrawalAmount = withdrawalAmount;
			System.out.println("No charges on the withdrawal");
		}else if(withdrawalAmount >= 10000) {
			totalWithdrawalAmount = ((withdrawalAmount - 10000) +  withdrawalAmount - (withdrawalAmount * (2/100))); 
		}
		System.out.println(totalWithdrawalAmount);
	}

}
