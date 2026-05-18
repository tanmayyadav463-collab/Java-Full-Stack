import java.util.Scanner;
public class parkingFeeCalculater {
	public static void main(String[] args) {
//		Calculate parking charges based on hours:
//			• First 2 hours → ₹20/hour
//			• Next 3 hours → ₹30/hour
//			• Above 5 hours → ₹50/hour
//			Reject negative hours
		
		Scanner sc = new Scanner(System.in);
		
		double hours;
		double totalFees = 0;
		
		System.out.println("Enter your parking hours : ");
		hours = sc.nextDouble();
		
		if(hours < 2) {
			totalFees = (hours * 20);
			System.out.println("you park your car for " + hours);
		}else if (hours <= 3) {
			totalFees = ((2 * 20) + (hours - 2) * 30);
			System.out.println("you park your car for " + hours);
		}else if (hours > 3) {
			totalFees = ((2* 20)+(3 * 30)+((hours - 5) * 50));
			System.out.println("you park your car for " + hours);
		}else {
			System.out.println("Invalid Information, Please try again");
		}
			System.out.println("the total praking charges is : " + totalFees);
	}
}
