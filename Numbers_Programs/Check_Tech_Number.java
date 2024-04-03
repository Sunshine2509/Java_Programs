/*       A number is said to be a tech number, when an even digit number is divided into exactly two parts and the square value of the sum of those two 

	 numbers is equal to the original number. */

class Check_Tech_Number
{
	// Main method 

	public static void main(String args[])
	{
		// Declaration and initialization of the variable.

		int num=2025;
		int copy_num=num;
		int count=0;
		
		// counting the digit are even or not.

		while(num>0)
		{
			count++;
			num=num/10;
		}

		if(count%2==0)
		{
			// Finding divisor

			int div=1;

			for(int i=1;i<=count/2;i++)
			{
				div=div*10;
			}

			// finding first half

			int first_Half=copy_num/div;
			
			// finding second half

			int second_Half=copy_num%div;

			// sum of two parts of the number

			int sum=first_Half+second_Half;

			// squaring the sum

			int square=sum*sum;

			// check the condition for the tech number

			if(copy_num==square)
			{
				System.out.println("Tech number");
			}
			else
			{
				System.out.println("Not a tech number");
			}
		}

		else
		{
			System.out.println("Not even digits");
		}
	}
}

	/* Output : 

		Compile time: Success 

		Runtime : Success and Tech number */