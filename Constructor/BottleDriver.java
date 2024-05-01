class Bottle
{
	// non static variables

	 String brand;
	 String material;
	 double cap;

	// parameterized constructor

	Bottle(String brand1,String material1,double cap1)
	{
		this. brand=brand1;
		this.material=material1;
		this.cap=cap1;
	}

	// getter method

	 void displayBottle()
	{
		System.out.println();
		System.out.println("************Bottle Details*********");
		System.out.println();
		System.out.println("Brand : "+brand);
		System.out.println("Material : "+material);
		System.out.println("Capacity : "+ cap);
	}

}

class BottleDriver
{
	// main method

	public static void main(String[] args) {

		// object creation 

		Bottle obj=new Bottle ("Bisleri","Plastic",5);

		// non static (getter) method calling

		obj.displayBottle();

		Bottle obj1=new Bottle ("Kinely","steel",5);
		obj1.displayBottle();
	}

}


/* Output : 

************Bottle Details*********

Brand : Bisleri
Material : Plastic
Capacity : 5.0

************Bottle Details*********

Brand : Kinely
Material : steel
Capacity : 5.0          */