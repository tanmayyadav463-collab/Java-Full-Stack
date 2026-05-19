import java.util.Scanner;

interface Employee
{
	void CalculateSalary();
}

class FullTimeEmployee implements Employee
{
	int workingHour;
	double salaryPerHour;
	
	FullTimeEmployee(int workingHour, double salaryPerHour){
		this.workingHour = workingHour;
		this.salaryPerHour = salaryPerHour;
	}
	
	public void CalculateSalary() {
		double salary = workingHour * salaryPerHour;
		
		salary = salary + 2000;
		
		System.out.println("Full Time Employee Salary : " + salary);
		
	}
	
}

class PartTimeEmployee implements Employee
{
	int workingHour;
	double salaryPerHour;
	
	PartTimeEmployee(int workingHour, double salaryPerHour){
		this.workingHour = workingHour;
		this.salaryPerHour = salaryPerHour;
	}
	
	public void CalculateSalary() {
		double salary = workingHour * salaryPerHour;
		
		System.out.println("Part Time Employee Salary : " + salary);
		
	}
	
}
public class Project05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Employee emp = null;
		
		System.out.println("Select Employee Type : ");
		System.out.println("1. Full Time Employee");
		System.out.println("2. Part Time Employee");
		
		int option = sc.nextInt();
		
		System.out.println("Enter Working hours : ");
		int workingHour = sc.nextInt();
		
		System.out.println("Enetr Salary Per Hour : ");
		double salaryPerHour = sc.nextDouble();
		
		switch(option) {
		case 1 : 
			System.out.println("For full Time Employee");
			emp = new FullTimeEmployee(workingHour,salaryPerHour);
			break;
			
		case 2: 
			System.out.println("For Part Time Employee");
			emp = new PartTimeEmployee(workingHour,salaryPerHour);
			break;
		default : 
			System.out.println("invalid selection");
			System.exit(0);
		}
		emp.CalculateSalary();
	}

}
