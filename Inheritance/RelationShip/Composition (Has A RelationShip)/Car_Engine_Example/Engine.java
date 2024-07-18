class Engine
{
	double horsePower;
	double capacity;
	String engineType;
	double mileage;
	int noOfPistons;

	Engine(double horsePower, double capacity, String engineType, double mileage, int noOfPistons)
	{
		this.horsePower=horsePower;
		this.capacity=capacity;
		this.engineType=engineType;
		this.mileage=mileage;
		this.noOfPistons=noOfPistons;
	}

	public void displayEngine()
	{
		System.out.println("*********Engine Details*********");
		System.out.println("Horse Power :"+horsePower);
		System.out.println("Capacity :"+capacity);
		System.out.println("Engine Type :"+ engineType);
		System.out.println("Mileage :"+mileage);
		System.out.println("Number of Pistons :"+ noOfPistons);
	}
}