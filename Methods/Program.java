// Java program to print 1 to 100 even numbers using user-defined method(Recursion).

class Program
{
	// static variable

	static int number=1;

	// main method (calling method)

	public static void main(String args[])
	{
		evenNumbers();

	}

	// user-defined method(called method)
	
	public static void evenNumbers()

	{
		if(number%2==0)
		{
			System.out.print(number+" ");
		}
		number++;
		
		// condition for avoid stack overflow (base condition)

		if(number>100)
		return;
		evenNumbers();
	}
}