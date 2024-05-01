
/* Copy Constructor : A copy constructor in java is a constructor that 
					  creates an object using another object of the same class. 



	Steps to  create copy constructor : 1) First we need to have an object of class
										2) We need to declare constructor that takes an object as input parameter
										3) While creating a object we need to pass a previous object as an argument*/


class Marker
{
	// non-static (instance ) variable

	String brand;
	String type;
	String color;
	boolean refilable;
	double price;

	// Parameterized constructor

	Marker(String brand, String type, String color, boolean refilable, double price )
	{
		this.brand=brand;
		this.type=type;
		this.color=color;
		this.refilable=refilable;
		this.price=price;
	}

	// non staic method to display marker's details.

	void displayMarker()
	{
		System.out.println("********Marker Details********");
		System.out.println("Brand : "+ brand);
		System.out.println("Type : "+ type);
		System.out.println("Color : "+color);
		System.out.println("Refilable : "+refilable);
		System.out.println("Price :"+price);


	}

	// Copy constructor for marker class

	Marker(Marker obj)
	{
		this.brand=obj.brand;
		this.type=obj.type;
		this.color=obj.color;
		this.refilable=obj.refilable;
		this.price=obj.price;
	}
}



class Copy_Constructor
{

	// main method

	public static void main(String[] args) {

		// Data initialization using constructor and object.

		Marker obj=new Marker("Camlin","White Board","Red",true,100);

		obj.displayMarker();

		// new object using copy constructor

		Marker obj1=new Marker(obj);

		obj1.displayMarker();

		
	}
}

/*  Output : 

********Marker Details********
Brand : Camlin
Type : White Board
Color : Red
Refilable : true
Price :100.0
********Marker Details********
Brand : Camlin
Type : White Board
Color : Red
Refilable : true
Price :100.0   */