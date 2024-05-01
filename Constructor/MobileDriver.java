class Mobile
{
	String brand;
	String model;
	int ram;
	int rom;
	 double price;

	  Mobile(String brand, String model, int ram, int rom, double price)

	  {
	  	this.brand=brand;
	  	this.model=model;
	  	this.ram=ram;
	  	this.rom=rom;
	  	this.price=price;

	  }

	  void displayMobile()
	  {
	  	System.out.println("Mobile details");
	  	System.out.println("Brand : "+brand);
	  	System.out.println("Model : "+model);
	  	System.out.println("Ram : "+ram);
	  	System.out.println("Rom : "+rom);
	  	System.out.println("Price : "+ price);
	  }

}
class MobileDriver
{
	public static void main(String[] args) {
		Mobile obj1=new Mobile("Samsung","ABC123",16,512,13000);
		obj1.displayMobile();
		
		Mobile obj2=new Mobile("Samsung","ABC124",8,256,8000);
		obj2.displayMobile();
	}
}