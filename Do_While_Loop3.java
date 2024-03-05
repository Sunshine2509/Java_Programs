// Java Program, to print only even numbers among the table of 3 using do while loop.

class Do_While_Loop3
{
	// Main method
	public static void main(String args[])
	{
		// Declaration and initialization of variable

		int n=1;
		int Product=0;
		// do while loop
		do
		{
			
			Product=3*n;

			// condition for even number

			if(Product%2==0){
			System.out.println(Product);
			}
			n++;
		}while(n<=10);
	}
}

	/* Output: 

	Compile Time: Success
	Runtime : Success and

		6
		12
		18
		24
		30
		*/