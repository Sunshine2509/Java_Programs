
// Java program to print first 10 fibonacii numbers.

class Print_Fibonacci_Series 
{
	// static variables

	static int num1=0;
	static int num2=1;
	static int range=10;

	// main method(calling method)

	public static void main(String[] args) 
	{
		fibonaciiNumbers();
	}

	// user-defined method (called method)

	public static void fibonaciiNumbers()
	{
		int sum=num1+num2;
		System.out.print(sum+" ");
		num1=num2;
		num2=sum;
		range--;
		if(range==0)
			return;
		fibonaciiNumbers();

	}
}

	/* Output : 

		Compile time : Success 

		Runtime  : Success and 1 2 3 5 8 13 21 34 55 89  */
	
