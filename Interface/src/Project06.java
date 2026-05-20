import java.util.Scanner;

interface CabService
{
	void bookCab(String pickUp, String drop);
}

class Uber implements CabService{
	int ratePerKm = 20;
	
	@Override
	public void bookCab(String pickUp, String drop) {
		System.out.println("Uber cab is booked .."); 
		System.out.println("Pick Up Location is : " + pickUp);
		System.out.println("Drop Location is : " + drop);
	}
	
	void CalculateFaer(double distance)
	{
		double fare = distance * ratePerKm;
		System.out.println("Total Fare : " + fare);
	}
}

class Rapido implements CabService{
	int ratePerKm = 10;
	
	@Override
	public void bookCab(String pickUp, String drop) {
		System.out.println("Uber cab is booked .."); 
		System.out.println("Pick Up Location is : " + pickUp);
		System.out.println("Drop Location is : " + drop);
	}
	
	void CalculateFaer(double distance)
	{
		double fare = distance * ratePerKm;
		System.out.println("Total Fare : " + fare);
	}
}

class Ola implements CabService{
	int ratePerKm = 15;
	
	@Override
	public void bookCab(String pickUp, String drop) {
		System.out.println("Uber cab is booked .."); 
		System.out.println("Pick Up Location is : " + pickUp);
		System.out.println("Drop Location is : " + drop);
	}
	
	void CalculateFaer(double distance)
	{
		double fare = distance * ratePerKm;
		System.out.println("Total Fare : " + fare);
	}
}
public class Project06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("----------- Cab Booking System -----------");
		System.out.println("1. Uber");
		System.out.println("2. Rapido");
		System.out.println("3. Ola");
		
		System.out.println("Enter the option : ");
		int option = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Enter the Pick Up Location : ");
		String pickUp = sc.nextLine();
				
		System.out.println("Enter the Drop Location : ");
		String drop = sc.nextLine();
		
		System.out.println("Enter the Distance in Km : ");
		int distance = sc.nextInt();
		
		switch(option) {
		case 1: 
			Uber u = new Uber();
			u.bookCab(pickUp, drop);
			u.CalculateFaer(distance);
			break;
		case 2:
			Rapido r = new Rapido();
			r.bookCab(pickUp, drop);
			r.CalculateFaer(distance);
			break;
		case 3:
			Ola o = new Ola();
			o.bookCab(pickUp, drop);
			o.CalculateFaer(distance);
			break;
			default:
				System.out.println("Invalid Option please try agin");
		}

	}

}
