// Happy Number : A Happy Number is a positive integer that, which is replaced by the sum of the squares of its digits, eventually reaching 1. 


class Check_Happy_Number
{

	// Main method

	public static void main(String args[])
	{
		// Declaration and initialization of the variable

		int num=13;
		int sum=0;

		// outer while loop

		outer: while(num>9 || sum>9)
		{
			if(num==0)
			{
				num=sum;
				sum=0;
			}

			// inner while loop

			while(num>0)
			{
				int rem=num%10;
				sum=(rem*rem)+sum;
				num=num/10;
			}
		}

			// condition for checking happy number

			if(sum==1 || num==1)
			{
				System.out.println("Happy Number");
			}
			else
			{
				System.out.println("Not Happy Number");
			}
	}
}

	/* Output : 

		Compile time : Success 

		Runtime : Success and Happy Number. */