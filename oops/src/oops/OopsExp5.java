package oops;

import java.util.Scanner;

class Company1{
	int cid;
	String cname;
	
	public Company1(int cid , String cname) {
		this.cid = cid;
		this.cname = cname;
	}
	
	public void comDetails() {
		System.out.println("Company ID : " + this.cid);
		System.out.println("Company ID : " + this.cname);
	}
}
public class OopsExp5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("\n ----------- Company Insertion -----------\n");
		
		System.out.println("How many company data you want to insert : ");
		int countCom = sc.nextInt() ;
		
		Company1[] companies = new Company1[countCom];
		
		for(int i = 0; i < countCom; i++) {
			
			System.out.println("\tEnter details of company " + (i + 1) + ":");
			
			System.out.println("Enter company ID : ");
			int cid  = sc.nextInt();
			
			sc.nextLine();
			
			System.out.println("Enter Company Name : ");
			String cname = sc.nextLine();
			
			companies[i] = new Company1(cid , cname);
			
		}
		
		System.out.println("\n ----------- Company Details -----------\n");
		
		for (int i = 0 ; i < countCom; i++) {
			System.out.println("\nCompany " + (i + 1));
			companies[i].comDetails();
			
		}

		sc.close();
	}

}
