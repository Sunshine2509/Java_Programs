class Car
{
	String brand;
	String model;
	String type;
	double price;
	int seatingCapacity;
	Engine engine;
	// (Second Way) Engine engine;

	//(First Way ) Engine engine =new Engine (120,1.2,"Petrol",16,4);

	Car(String brand, String model, String type , double price, int seatingCapacity)// (Second Way)(double horsePower, double capacity, String engineType, double mileage, int noOfPistons))
	{
		this.brand=brand;
		this.model=model;
		this.type=type;
		this.price=price;
		this.seatingCapacity=seatingCapacity;

		// (Second Way) this.engine=new Engine( horsePower, capacity, engineType,  mileage, noOfPistons);
		//this.


	}

	public  void displayCar()
	{
		System.out.println("*********CAR DETAILS***********");
		System.out.println("Brand :"+brand);
		System.out.println("Model :"+ model);
		System.out.println("Type :"+type);
		System.out.println("Price :"+price);
		System.out.println("seatingCapacity :"+seatingCapacity);
	}
}