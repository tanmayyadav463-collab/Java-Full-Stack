
public class IfElseLadder {

	public static void main(String[] args) {
		
		int marks = 64;
		
		if ((marks <= 100) && (marks >= 85)) {
			System.out.println("A+ Grade");
		}
		else if ((marks < 85) && (marks >= 75)) {
			System.out.println("A Grade");
		}
		else if ((marks < 75) && (marks >= 60)) {
			System.out.println("B Grade");
		}
		else if ((marks < 60) && (marks >= 45)) {
			System.out.println("C Grade");
		}
		else if ((marks < 45) && (marks >= 37)) {
			System.out.println("D Grade");
		}
		else {
			System.out.println("Fail");
		}


	}

}
