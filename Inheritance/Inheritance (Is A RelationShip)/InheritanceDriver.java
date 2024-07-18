
/* Inheritance : Inheritance in java is a mechanism in which one object aquires all the properties and behaviours from a parent object.
	
				Advantages : Code Reusability, Less time consumption , To avoid data Redundancy, Code sharing  etc  */

// Parent class / Super class/ base class

class Parent
{
	// parent class variable 

	String str="HII FROM PARENT CLASS";

	// non static method m1()

	void m1()
	{
		System.out.println("HELLO FROM PARENT m1()");
	}

	// static method m3()

	static void m3()
	{
		System.out.println("HELLO FROM PARENT STATIC m3()");
	}
}

// child class / extended class / sub class / derived class 

class Child extends Parent
{
	// child class variable

	String str="HII FROM CHILD CLASS";

	// non static method m2()

	void m2()
		{
			System.out.println( " HELLO FROM CHILD CLASS m2()");

			// calling non static method of child class directly

			m1();

			// printing child class variable

			System.out.println(str);

			// printing parent class variable using super keyword

			System.out.println(super.str);
		}

		// static method m4()

		 static void m4()
		 {
		 	System.out.println("HELLO FROM CHILD STATIC m4()");
		 }
}

// Driver class

class InheritanceDriver
{
	// main method

	public static void main(String[] args) {

		// creating object of child class

		Child obj=new Child ();

		// calling m2() using object reference of child class

		obj.m2();

		// calling m2() using object reference of child class

		obj.m3();
	}
}

/*  Output : 

HELLO FROM CHILD CLASS m2()
HELLO FROM PARENT m1()
HII FROM CHILD CLASS
HII FROM PARENT CLASS
HELLO FROM PARENT STATIC m3()   */