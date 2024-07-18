  class Computer
{
	String brand;
	String type;
	double price;
	int generation;
	int totalComponent;

	Cpu cpu=new Cpu("i3","Desktop CPU",3,8,443,44444);
	Monitor monitor=new Monitor("HP",2,3,5,6);
	Keyboard keyboard=new Keyboard("i3","Desktop CPU",3,8,true);

	Computer (String brand,String type,double price,int generation,int totalComponent)
	{
		this.brand=brand;
		this.type=type;
		this.price=price;
		this.generation=generation;
		this.totalComponent=totalComponent;
	}

	public void displayComputer()
	{
	System.out.println("*******COMPUTER Details**********");
	System.out.println("Brand :"+brand);
	System.out.println("Type"+type);
	System.out.println("Price :"+price);
	System.out.println("Total number of component"+totalComponent);
}
}


class Cpu
{
	// non static variable

	String processor;
	String type;
	int clockSpeed;
	int ram;
	int rom;
	double price;
	

	//parameterized Constructor of Cpu class

	Cpu(String processor, String type ,int clockSpeed,int ram, int rom,double price)
	{
		this.processor=processor;
		this.type=type;
		this.clockSpeed=clockSpeed;
		this.ram=ram;
		this.rom=rom;
		this.price=price;
	}

	// user defined method to display the Cpu details

	public void displayCPU()
	{
		System.out.println("*********CPU Details************");
		System.out.println();
		System.out.println("Processor :"+processor);
		System.out.println("Type :"+type);
		System.out.println("ClockSpeed :"+clockSpeed+" GHz");
		System.out.println("RAM :"+ ram +" gb");
		System.out.println("ROM :"+rom+" gb");
	}
}

	
	class Monitor
{
	// non static variable

	String brand;
	double screenSize;
	double price;
	int brightness;
	int noOfPorts;
	


	//parameterized Constructor of Monitor class

	Monitor(String brand, double screenSize ,double price,int brightness, int noOfPorts)
	{
		this.brand=brand;
		this.screenSize=screenSize;
		this.price=price;
		this.brightness=brightness;
		this.noOfPorts=noOfPorts;
	}

	// user defined method to display the Monitor details

	public void displayMonitor()
	{
		System.out.println("*********Monitor Details************");
		System.out.println();
		System.out.println("Brand :"+brand);
		System.out.println("Screen Size :"+screenSize+" inch");
		System.out.println("Price :"+price+"Rs");
		System.out.println("Brightness :"+ brightness +" cd/m2");
		System.out.println("Number of ports :"+noOfPorts);
	}
}

	class Keyboard
{
	// non static variable

	String brand;
	String color;
	double size;
	double price;
	boolean wirelessConnectivity;
	

	//parameterized Constructor of Keyboard class

	Keyboard(String brand, String color ,double size,double price, boolean wirelessConnectivity)
	{
		this.brand=brand;
		this.color=color;
		this.size=size;
		this.price=price;
		this.wirelessConnectivity=wirelessConnectivity;
	}

	// user defined method to display the Keyboard details

	public void displayKeyboard()
	{
		System.out.println("*********Keyboard Details************");
		System.out.println();
		System.out.println("Brand :"+brand);
		System.out.println("Color :"+color);
		System.out.println("size :"+size+" inch");
		System.out.println("Price :"+ price +" Rs");
		System.out.println("wirelessConnectivity :"+wirelessConnectivity);
	}



}

class ComputerDriver
{
	public static void main(String[] args) {
		Computer obj=new Computer("A","A",4,2,4);
		obj.cpu.displayCPU();
		obj.monitor.displayMonitor();
		obj.keyboard.displayKeyboard();
		
	}
}