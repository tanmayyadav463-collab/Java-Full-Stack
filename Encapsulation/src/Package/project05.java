package Package;

class Mobile
{
	private String brand;
	private String model;
	private double price;
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		if(price < 0) {
			System.out.println("Invalid Price Data");
		}else {
			this.price = price;
		}
	}
}
public class project05 {

	public static void main(String[] args) {

		Mobile m = new Mobile();
		
		m.setBrand("Realmi");
		m.setModel("P1 Super 5G");
		m.setPrice(15000);
		
		System.out.println("Mobile Brand : " + m.getBrand());
		System.out.println("Mobile Model : " + m.getModel());
		System.out.println("Mobile Price : " + m.getPrice());
		

	}

}
