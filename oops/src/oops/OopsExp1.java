package oops;

class Employee
{
	int eId = 101;
	String eName = "Tanmay ";
	double eSal = 99999;
	
//	constructor 
	public Employee()
	{
		System.out.println("Employee constructor");
	}
	
	public void empDetails() {
		System.out.println("Employee ID : " + eId);
		System.out.println("Employee Name : " + eName);
		System.out.println("Employee Salary : " + eSal);
	}
}


//main class
public class OopsExp1 {

	public static void main(String[] args) {
		
		Employee e1 = new Employee();
		e1.empDetails();
		
		Employee e2 = new Employee();
		e2.empDetails();

	}

}
