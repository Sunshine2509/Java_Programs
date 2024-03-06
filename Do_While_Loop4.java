// Java Program, to print all indivisual numbers from the given number using do while loop.

class Do_While_Loop4
{
	// Main method
	public static void main(String args[])
	{
		// Declaration and initialization of variable

		int n=1234;
		int r=0;
		// do while loop
		do
		{
			r=n%10;
			n=n/10;	// Updatation
			System.out.println(r);
			
			
			
		}while(n>0);	//Condition
	}
}

	/* Output: 

	Compile Time: Success
	Runtime : Success and

		4
		3
		2
		1 */