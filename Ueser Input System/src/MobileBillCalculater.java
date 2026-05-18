import java.util.Scanner;

public class MobileBillCalculater {

	public static void main(String[] args) {
		int data;
		int totalBill = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter used data in GB : ");
		data = sc.nextInt();
		
		if(data <= 2) {
			totalBill = (data * 50);
			System.out.print("the total bill of the data is " + totalBill);
		}else if (data <= 3) {
			totalBill = ((data * 50) + ((data - 2) * 75)) ;
			System.out.print("the total bill of the data is " + totalBill);
		}else if (data > 3) {
			totalBill = ((2 * 50)+(1 * 75)+((data - 3) * 100));
			System.out.print("the total bill of the data is " + totalBill);
		}else {
			System.out.println("The given input is Invalid, Please try again");
		}
		
		
	}

}
