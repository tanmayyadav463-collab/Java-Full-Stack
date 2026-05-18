
class Employee
{
	String name;
	double salary;
	
	void setEmployee(String n, double s) 
	{
		name = n;
		salary = s;
	}
	
	void displayEmployee()
	{
		System.out.println("Employee Name : " + name );
		System.out.println("Employee Salary : " + salary );
	}
	
}

class manager extends Employee 
{
	String department;
	
	void setManager(String dept)
	{
		department = dept;
	}
	
	void displayManager()
	{
		displayEmployee();
		System.out.println("Department : " + department);
	}
}



public class Project01 {

	public static void main(String[] args) {
		
		manager m = new manager();
		
		m.setEmployee("Tanmay", 50000);
		m.setManager("IT");
		
		m.displayManager();

	}

}
