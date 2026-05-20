package Package;

class Employee{
	private int empId;
	private String empName;
	private double empSalary;
	
	
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public double getEmpSalary() {
		return empSalary;
	}
	public void setEmpSalary(double empSalary) {
		if(empSalary < 0) {
			System.out.println("Invalid Salary Details");
		}else {
			this.empSalary = empSalary;
		}
		
	}
	
	
}
public class project03 {

	public static void main(String[] args) {
		Employee e = new Employee();
		
		e.setEmpId(101);
		e.setEmpName("Tanmay");
		e.setEmpSalary(50000);
		
		System.out.println("Employee ID : " + e.getEmpId());
		System.out.println("Employee Name : " + e.getEmpName());
		System.out.println("Employee Salary : " + e.getEmpSalary());
	
	}

}
