
class Static_NonStatic
{
	// global variable

	String str="Hiii I am global";

	// non static method 

	void m1()
	{
		System.out.println("Hello from m1()");
	}

	// non static parameterized method

	void add(int num1, int num2)
	{
		System.out.println("Addition : "+(num1+num2));
	}
	// static method

	static void m2()
	{
		System.out.println("Hii  I am static method m2()");
	}

	// non static method created for control of execution 

	void excControl()
	{
		// local variable

		String str="Hiii I am local";

		// calling method using current object reference

		this.add(20,20);

		// calling non static method using current object reference

		this.m2();

		// non static method can directly call to  non static context.
		m1();

		// printing local variable(both local and global variable have same name so compiler print local for global it must have object reference)

		System.out.println(str);

		System.out.println(this);  // This statement prints the reference address of current address.

		// printing global variable by giving object reference using this keyword.

		System.out.println(this.str);

	}

	// main method

	public static void main(String[] args) {

		// creation of object

		Static_NonStatic obj=new Static_NonStatic();

		// calling non static method by the object reference.

		obj.excControl();

		System.out.println(obj); // This statement prints the reference address of object.
		
	}
}


/* Output :  

Addition : 40
Hii  I am static method m2()
Hello from m1()
Hiii I am local
Constructor_Overloading@5b2133b1
Hiii I am global
Constructor_Overloading@5b2133b1       */