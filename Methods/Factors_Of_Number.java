// Java program to print the factors of a number using user-defined method (Recursion).

class Factors_Of_Number
{	
	// static variables

	static int num=10;
	static int i=1;

	// main method (calling method)

	public static void main(String [] args)
	{
		printFactors();
	}
	// user-defined method (called method)

	public static void printFactors()
	{	
		if(num%i==0)
		{
			System.out.println(i);
		}
		i++;

		// condition for control stack overflow (base condition)
	if(i>num)
	return;
	printFactors();
	}
}

/*  Output : 

		Compile time : Success 

		Runtime : Success and 

					1
					2
					5
					10  */