/*Lychrel Number : Lychrel Number is a natural number that cannot form a palindrome through the iterative process of repeatedly reversing its digits and 		   adding the resulting numbers.*/ 

class Check_Lycrel_Number
{
	// Main method

	public static void main(String args[])
	{
		// Declaration and initialization of variable

		int num =217;
		int copyNum=num;
		int revNum=0;

		// Finding reverse of the given number using while loop

		while(num>0)
		{
			int rem=num%10;
			revNum=(revNum*10)+rem;
			num=num/10;
		}

		// Adding the number and reverse of it

		int sum=copyNum+revNum;
		int copySum=sum;
		int revSum=0;

		// To check the sum is palindrome or not

		while(sum>0)
		{
			int rem=sum%10;
			revSum=(revSum*10)+rem;
			sum=sum/10;
		}
		if(copySum==revSum)
		{
			System.out.println("Not lychrel number");
		}
		else
		{
			System.out.println("Lychrel number");
		}
	}
}

	/* Output : 
	
		Compile time : Success 

		Runtime : Success and lychrel number */