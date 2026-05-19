import java.util.Scanner;

interface FoodDelivery 
{
	void orderFood(String item, int qty);

	
}

class Zomato implements FoodDelivery
{
	@Override
	public void orderFood(String item, int qty)
	{
		int price = 200;
		int bill = price * qty;
		
		System.out.println("------------ Zomato Order -------------");
		System.out.println("Food Item : " + item);
		System.out.println("Quantity : " + qty);
		System.out.println("Total Bill : " + bill);
		System.out.println("Order Confirmed via Zomato!");
	}
	
}

class Swiggy implements FoodDelivery
{
	@Override
	public void orderFood(String item, int qty)
	{
		int price = 180;
		int bill = price * qty;
		
		System.out.println("------------ Swiggy Order -------------");
		System.out.println("Food Item : " + item);
		System.out.println("Quantity : " + qty);
		System.out.println("Total Bill : " + bill);
		System.out.println("Order Confirmed via Swiggy!");
	}
	
}
public class Project03 {


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Select the Food Delivery App : ");
		System.out.println("1. Zomato");
		System.out.println("2. Swiggy");
		
		System.out.println("Enter the Choice");
		int choice = sc.nextInt();
		sc.nextLine();
		
		System.out.print("Enter Food Item: ");
        String item = sc.nextLine();
		
		System.out.println("Enter Quantity : ");
		int qty = sc.nextInt();
		
		FoodDelivery fd;
		
		if(choice == 1)
		{
			fd = new Zomato();
		}else {
			fd = new Swiggy();
		}
		
		fd.orderFood(item, qty);


	}

}
