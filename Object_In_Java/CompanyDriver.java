
// Java Program for creating an object of Company class

class Company
{
	// Global variables

	int companyId;
	String companyName;
	String companyLocation;
	int no_Of_Employees;
	String companyType;
	

	// User defined method for displaying company information

	public void displayCompanyDetails()
	{
		System.out.println("*********Company Details***********");
		System.out.println("Company Id : "+ companyId);
		System.out.println("Company Name : "+ companyName);
		System.out.println("Company Location : "+ companyLocation);
		System.out.println("Number of Employees : "+ no_Of_Employees);
		System.out.println("Company Type : "+ companyType);
		
	}
}

// class which having main method()

class CompanyDriver
{
	public static void main(String[] args) {
		
	
	// Creating the object of Company class

	Company obj1= new Company();

	obj1.companyId=1;
	obj1.companyName="TCS"	;
	obj1.companyLocation="Pune";
	obj1.no_Of_Employees=10000;
	obj1.companyType="IT ";
	

	obj1.displayCompanyDetails();

	// Creating multiple object for storing multiple records

	Company obj2= new Company();

	obj2.companyId=2;
	obj2.companyName="EPAM"	;
	obj2.companyLocation="Banglore";
	obj2.no_Of_Employees=100000;
	obj2.companyType="IT ";


	obj2.displayCompanyDetails();
}
}

/* Output : 

	Compile time : Success

	Runtime :  

*********Company Details***********

Company Id : 1
Company Name : TCS
Company Location : Pune
Number of Employees : 10000
Company Type : IT

*********Company Details***********

Company Id : 2
Company Name : EPAM
Company Location : Banglore
Number of Employees : 100000
Company Type : IT       */