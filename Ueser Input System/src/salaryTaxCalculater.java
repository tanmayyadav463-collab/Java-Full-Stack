import java.util.Scanner;
public class salaryTaxCalculater {

	public static void main(String[] args) {
//		Accept monthly salary and calculate tax:
//			• Up to ₹25,000 → No tax
//			• ₹25,001–₹50,000 → 10% tax
//			• Above ₹50,000 → 20% tax
//			Display net salary after tax.
		
		int salary;
		int netSalary = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your monthly salary : ");
		salary = sc.nextInt();
		
		if (salary <= 25000) {
			System.out.println("No tax applicable on salary");
			netSalary = salary;
		}else if ((salary > 25000) && (salary <= 50000)) {
			netSalary = salary - (salary * 10/100);
			System.out.println("total tax on salary is 10%");
		}else if (salary > 50000) {
			netSalary = salary - (salary * 20/100);
			System.out.println("total tax on salary is 10%");

		}
		System.out.println("Total salary after tax didction is : " + netSalary);
		
	}

}
