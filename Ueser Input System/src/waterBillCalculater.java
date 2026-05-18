import java.util.Scanner;
public class waterBillCalculater {

	public static void main(String[] args) {
		double units ;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter water units that used : ");
		units = sc.nextDouble();
		
		double billAmount = 0;
		
		if (units < 50) {
			billAmount = units * 2;
			System.out.println("used water units is : " + units);
			System.out.println(billAmount);
		}else if ((units >= 50) && (units < 100)) {
			billAmount = (  (50 * 2) + ((units - 50) * 4)  );
			System.out.println("used water units is : " + units);
			System.out.println(billAmount);
		}else if (units >= 100) {
			billAmount = ( (50 * 2) + (50 * 4 ) + ((units - 100) * 6));
			System.out.println("used water units is : " + units);
			System.out.println(billAmount);
		}else {
			System.out.println("Invalid input, Please try again ");
		}
			
	}

}
