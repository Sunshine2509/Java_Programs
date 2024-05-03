
// Java Program for creating an object of Laptop class

class Laptop
{
	// Global variables

	int brand;
	String modelNumber;
	String price;
	int ram;
	String rom;
	String processor ; 
	String type;
	

	// User defined method for displaying Laptop information

	public void displayLaptopDetails()
	{
		System.out.println("*********Laptop Details***********");
		System.out.println("Laptop Brand : "+ brand);
		System.out.println("Model Number  : "+ modelNumber);
		System.out.println("Laptop Price  : "+ price);
		System.out.println("RAM : "+ ram);
		System.out.println("ROM : "+ rom);
		System.out.println("Processor : "+ processor);
		System.out.println("Type : "+ type);
		
	}
}

// class which having main method()

class LaptopDriver
{
	public static void main(String[] args) {
		
	
	// Creating the object of Laptop class

	Company obj1= new Laptop();

	obj1.brand="HP";
	obj1.modelNumber="HP12345"	;
	obj1.price=50000;
	obj1.ram=16;
	obj1.rom=512;
	obj1.processor="i7";
	obj1.type="Gaming";
	

	obj1.displayCompanyDetails();

	// Creating multiple object for storing multiple records

	Company obj2= new Laptop();

	obj2.brand="HP";
	obj2.modelNumber="HP6789"	;
	obj2.price=90000;
	obj2.ram=16;
	obj2.rom=512;
	obj2.processor="i7";
	obj2.type="Coading";
	


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