import java.util.Scanner;
public class movieTicketPriceClaculater {

	public static void main(String[] args) {
//		Calculate total ticket cost based on age:
//		• Age < 12 → ₹100
//		• Age 12–60 → ₹200
//		• Age > 60 → ₹150
//		Take number of tickets and calculate total cost.
			
		Scanner sc = new Scanner(System.in);
		
		int age;
		int numbersOfTickets;
		int price = 0;
		int totalCost;
		
		System.out.println("Enter your age : ");
		age = sc.nextInt();
		
		System.out.println("Enter number of tickets : ");
		numbersOfTickets = sc.nextInt();
		
		if (age < 12) {
			price = 100;
		}else if ((age >= 12) && (age < 60)) {
			price = 200;
		}else if (age >= 60) {
			price  = 150;
		}else {
			System.out.println("Invalid Information, Please try again");
		}
		
		totalCost = price * numbersOfTickets;
		System.out.println("total price of the tickets is :  " + totalCost);
	}

}
