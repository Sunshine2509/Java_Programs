// Java program to Print first happy numbers.

class First_Ten_Happy_Number
{

	// Main method

	public static void main(String args[])
	{
		// Declaration and initialization of the variable

		int num=1;
		int count=0;
		// Outer while loop
		while(true)
		{
			int b=num;
			int sqr=1;
			int sum=0;

			// inner while loop to check number or sum is one digit or not

			while(num>9 || sum>9)
			{
				if(num==0)
				{
					num=sum;
					sum=0;
				}
				while(num>0)
				{
					int rem=num%10;
					sqr=rem*rem;
					sum=sum+sqr;
					num=num/10;
				}
			}

			// condition for happy number

			if(sum==1|| num==1)
			{
				System.out.println(b);
				count++;
			}
				b++;
				num=b;
			
			if(count==10)
			{
				break;
			}
		}
	}
}

	/* Output : 

		Compile time : Success 
		
		Runtime : Success and 
		1
		10
		13
		19
		23
		28
		31
		32
		44
		49 */