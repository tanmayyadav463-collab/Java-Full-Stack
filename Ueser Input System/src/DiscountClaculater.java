import java.util.Scanner;
public class DiscountClaculater {

	public static void main(String[] args) {
//		Calculate final bill amount:
//			• Below ₹1000 → No discount
//			• ₹1000–₹5000 → 10% discount
//			• Above ₹5000 → 20% discount
//			Display final payable amount
		Scanner sc = new Scanner(System.in);
		
		int billAmount;
		int discountedAmount = 0;
		
		System.out.println("Enter your bill amount : ");
		billAmount = sc.nextInt();
		
		if (billAmount < 1000) {
			System.out.println("Sorry, No discount avalible ");
			discountedAmount = billAmount;
		}else if((billAmount >= 1000) && (billAmount < 5000)){
			System.out.println("you got 10% discount on your billing amount");
			discountedAmount = (billAmount - (billAmount * 10 / 100));
		}else if (billAmount >= 5000){
			System.out.println("you got 20% discount on your billing amount");
			discountedAmount = (billAmount - (billAmount * 20 / 100));
		}else {
			System.out.println("Invalid Input");
		}
		System.out.println("the total bill amount after discount is : " + discountedAmount);
	}
}
