package oops;
class Employee1
{
	int empId ;
	String empName;
	double empSalary;
	
	public Employee1(int empId , String empName, double empSalary)
	{
		this.empId = empId;
		this.empName =empName;
		this.empSalary = empSalary;
	}
	
	public void empDetails()
	{
		System.out.println("Emp ID : " + this.empId);
		System.out.println("Emp Name : " + this.empId);
		System.out.println("Emp Salary :" + this.empSalary);
	}
}
public class OopsExp3 {

	public static void main(String[] args) {
		Emp e1 = new Emp(101, "Tanmay", 99999);
		e1.empDetails();
		
		System.out.println("\n-------------------------------\n");
		Emp e2 = new Emp(102, "Kartik", 88888);
		e2.empDetails();

	}

}
