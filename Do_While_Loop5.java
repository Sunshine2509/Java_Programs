// Java Program, to print only indivisual even numbers from the given number using do while loop.

class Do_While_Loop5
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
			if(r%2==0)
			{
			System.out.println(r);
			}
			
			
		}while(n>0);	//Condition
	}
}

	/* Output: 

	Compile Time: Success
	Runtime : Success and

		4
		
		2
		 */