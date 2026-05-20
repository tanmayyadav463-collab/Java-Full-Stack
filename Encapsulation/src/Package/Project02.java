package Package;


class Student
{
	private int stdRollNumber;
	private String stdName;
	private int stdMarks;
	
	public int getStdRollNumber() {
		return stdRollNumber;
	}
	
	public void setStdRollNumber(int stdRollNumber) {
		this.stdRollNumber = stdRollNumber;
	}
	
	public String getStdName() {
		return stdName;
	}
	
	public void setStdName(String stdName) {
		this.stdName = stdName;
	}
	
	
	
	public int getStdMarks() {
		return stdMarks;
	}
	
	public void setStdMarks(int stdMarks) {
		if (stdMarks > 0 && stdMarks <= 100) {
			this.stdMarks = stdMarks;
		}else {
			System.out.println("invalid Marks data..");
		}
	
	
		
	}
	
	
}
public class Project02 {

	public static void main(String[] args) {
		Student s = new Student();
		
		s.setStdRollNumber(101);
		s.setStdName("Tanamy Yadav");
		s.setStdMarks(98);
		
		System.out.println("Roll Number: " + s.getStdRollNumber());
		System.out.println("Name: " + s.getStdName());
		System.out.println("Marks: " + s.getStdMarks());

	}

}
