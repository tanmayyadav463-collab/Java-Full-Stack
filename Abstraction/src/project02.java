abstract class FoodOrder
{
	void orderDetails() {
		System.out.println("Food Order Placed");
	}
	
	abstract void prepareFood();
}

class PizzaOrder extends FoodOrder
{
	void prepareFood() {
		System.out.println("prepare Pizza...");
	}
}

class BurgerOrder extends FoodOrder
{
	void prepareFood() {
		System.out.println("prepare Burger...");
	}
}

class BiryaniOrder extends FoodOrder
{
	void prepareFood() {
		System.out.println("prepare Biryani...");
	}
}
public class project02 {

	public static void main(String[] args) {
		
		PizzaOrder p = new PizzaOrder();
		p.orderDetails();
		p.prepareFood();
		
		System.out.println();
		
		BurgerOrder B = new BurgerOrder();
		B.orderDetails();
		B.prepareFood();
		
		System.out.println();

		BiryaniOrder b = new BiryaniOrder();
		b.orderDetails();
		b.prepareFood();
		
		
	}

}
