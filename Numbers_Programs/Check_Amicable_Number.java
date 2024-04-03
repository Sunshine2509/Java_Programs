// Amicable Number - Amicable numbers are pairs of distinct positive integers where the sum of the proper divisors of each number equals the other number. 

class Check_Amicable_Number
{
	// Main method

	public static void main(String args[])
	{
		// Declaration and initialization of the variable

		int num1=220;
		int num2=284;
		int sum1=0;
		int sum2=0;
		int i=1;
		int j=1;
		
		// While loop for first number

		while(num1>i)
		{
			if(num1%i==0)
			{
			sum1=sum1+i;
			}
			i++;
		}

		// While loop for second number

		while(num2>j)
		{
			if(num2%j==0)
			{
			sum2=sum2+j;
			}
			j++;
		}
		
		// condition for checking amicable number

		if(sum1==num2 && sum2==num1)
		{
			System.out.println("Amicable number");
		}
		else
		{
			System.out.println("Not an amicable number");
		}
	}
}

			