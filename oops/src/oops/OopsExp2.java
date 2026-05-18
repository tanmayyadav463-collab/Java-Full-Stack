package oops;

class Emp
{
	int eId = 0;
	String eName = "";
	double eSal = 0;
	
	public Emp(int id , String name, double sal)
	{
		eId = id;
		eName = name;
		eSal  = sal;
	}
	
	public void empDetails() {
		System.out.println("Employee ID : " + eId);
		System.out.println("Employee Name : " + eName);
		System.out.println("Employee Salary : " + eSal);
	}
}


public class OopsExp2 {

	public static void main(String[] args) {
		
		Emp e1 = new Emp(101, "Tanmay", 99999);
		e1.empDetails();
		
		System.out.println("\n-----------------------------\n");
		Emp e2 = new Emp(102, "Rohit", 88888);
		e2.empDetails();

	}

}
