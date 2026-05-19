import java.util.Scanner;

interface SmartDevice
{
	void turnOn();
	
	void turnOff();
	
}

class Fan implements SmartDevice
{

	@Override
	public void turnOn() {
		System.out.println("Turn On the fan ");
	}

	@Override
	public void turnOff() {
		System.out.println("Turn Off the fan ");
		
	}
	
}

class Light implements SmartDevice
{

	@Override
	public void turnOn() {
		System.out.println("Turn On the Light ");
	}

	@Override
	public void turnOff() {
		System.out.println("Turn Off the Light ");
		
	}
	
}

class AC implements SmartDevice
{

	@Override
	public void turnOn() {
		System.out.println("Turn On the AC ");
	}

	@Override
	public void turnOff() {
		System.out.println("Turn Off the AC ");
		
	}
	
}
public class Project04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		SmartDevice device = null;
		
		System.out.println("------------- Select Device ------------");
		System.out.println("1. Fan");
		System.out.println("2. Light");
		System.out.println("3. AC");
		
		System.out.println("Select Device : ");
		int option = sc.nextInt();
		
		switch(option) {
		case 1:
			device  = new Fan();
			break;
		case 2 :
			device = new Light();
			break;
		case 3:
			device = new AC();
			break;
		default :
			System.out.println("Invalid Divice Selection");
			System.exit(0);
		}
		
		System.out.println("--------- Select an Oprreation---------");
		System.out.println("1. Turn On");
		System.out.println("2. Turn Off");
		
		int opreation = sc.nextInt();
		
		switch (opreation) {
		case 1 :
			device.turnOn();
			break;
		case 2 :
			device.turnOff();
			break;
		default :
			System.out.println("Invalid selection");
		}
	}

}
