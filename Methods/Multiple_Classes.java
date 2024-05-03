
// 1) Example of multiple classe in a single file

 /* class Multiple_Classes
{

}
class Class1
{
	public static void main(String[] args) {
		
		// for accessing the variable from another class there should be gives a class name as a reference.
		Class2.myMethod();
		
	}

	// nested class (class within class)

	class Class2
	{
		public static void myMethod()
		{
			System.out.println("Hello from myMethod ()");
		}
	}
}
*/

/*  Output : 

Compile  time : Success (We have to compile file name.java (javac Multiple_Classes.java))

Runtime : Hello from myMethod ()  ( We have to run the class which contain the main method()  // java Class1)   */

/*  2) Example of public class 

	1) Whenever we declare a class as public , a file name and class name should be same mandatorily 
	else we get compile time error. 
	
	2) We cannot have more than one public class in a single java file */

	/* public class Multiple_Classes
	{
		public static void main(String[] args) {

			Pratiksha.M1();
			
		}
	}

	class Pratiksha
	{
		public static void M1()
		{
			System.out.println("Hello from Pratiksha class ");
		}
	}  */

	/* Output : 

	compile time : Success 

	Runtime : Hello from Pratiksha class   */


	/* 3) Example of compile time error 

	This program generates a compile time error because file name and public class name is different . */

	/*  class Multiple_Classes
	{

	}
	public class Pratiksha
	{
		public static void main(String[] args) {
			
		
		System.out.println(" Hello from Pratiksha class ");
	}
	} */


	/* Output : 

	Compile time :  Multiple_Classes.java:73: error: class Pratiksha is public, should be declared in a file named
					Pratiksha.java  public class Pratiksha
               		^
					1 error  */


	/* 4) Example of compile time error 

	This program generates a compile time error because we cannot have multiple public classes within a single java file */

	/* public class  Multiple_Classes
	{

	}
	public class Pratiksha
	{
		public static void main(String[] args) {
			
		
		System.out.println(" Hello from Pratiksha class ");
	}
	} 
		*/

	/* Output : 

	Compile time :  Multiple_Classes.java:99: error: class Pratiksha is public, should be declared in a file named Pratiksha.java
        			public class Pratiksha
              				 ^
					1 error */

// 5) Example for accessing the method from different java file 

	class Multiple_Classes
	{
		public static void m1()
		{
			System.out.println("Hii from Multiple_Classess m1()");
			Multiple_Classes1.m2();

		}
	}

	class Multiple_Classes1
	{
		public static void m2()
		{
			System.out.println("Hii from Multiple_Classess m2()");
		}
	}



