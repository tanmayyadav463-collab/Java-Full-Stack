package oops;

class Company
{
	int cid ;
	String cname;

	public Company(int cid , String cname )
	{
		this.cid = cid;
		this.cname = cname;
	}
	
	public void comDetails ()
	{
		System.out.println("Company Id : " + this.cid);
		System.out.println("Company Name : " + this.cname);
	}
}
public class OopsExp4 {

	public static void main(String[] args) {
		
		Company c1 = new Company(1243, "abc company");		
		c1.comDetails();
	}

}
