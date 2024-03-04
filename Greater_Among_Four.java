// Java program to find the greater number among four numbers using else if ladder.

class Greater_Among_Four
{
	// Main method
	public static void main(String args[])
	{
		// Declaration and initialization of variable.

		int a=1, b=2, c=3, d=4;

		// check the conditions using else if ladder.

		if(a>b&& a>c&& a>d)
		{
			System.out.println(" a is greater.");
		}
		else if ( b>c&&b>d)
		{
			System.out.println(" b is greater.");
		}
		else if ( c>d)
		{
			System.out.println("c is greater.");
		}
		else
		{
			System.out.println(" d is greater.");
		}
	}
}

	/* Output: 

	Compile time: Success 

	Runtime : Success and d is greater. */