// Java program to finding greater number among three numbers.

class ElseIfLadder
{
	//Main method

	public static void main(String args[])
	{
		// Declaration and initialization of variable
		int a=99,b=78,c=34;

		// Checking condition using else if ladder

		if(a>b&&a>c)
		{
			System.out.println("a is greater");
		}
		else if (b>a&&b>c)
		{
			System.out.println("b is greater");
		}
		else
		{
			System.out.println("c is greater");
		}
	}
}

	/* Output:

	Compile Time: Success

	Runtime : Success and a is greater. */