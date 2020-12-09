import java.util.ArrayList;
import java.util.Scanner;

public class Company {

	static int numOfCompanies = 0;

	public Company() {
	//Company name 
	Scanner in = new Scanner(System.in);
	System.out.println("Name of Company: ");
	ArrayList<String> nameOfCompany = new ArrayList<String> ();
	String companyName = in.nextLine();
	nameOfCompany.add(companyName);
	

	
	numOfCompanies++;
	}
	
	public void CalcCompanyStats() {
		
	}
	//be able to work out ROI from last 5 years
	//then average
	//annual d/e ratio from last 5 years 
	//then average 
    //workout profit margins
	//public or private 
	//Future FCFE
	//intrinsic value of company
	//Intrinsic value of stock

	
}
