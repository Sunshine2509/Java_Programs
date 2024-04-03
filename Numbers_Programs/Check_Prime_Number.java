// Java program to check a number is prime or not.

class Check_Prime_Number
{
	public static void main(String args[])
	{
		int num=5;
		int count=0;
		int i=2;
		while(i<=num/2)
		{
			if(num%i==0)
			{
				count++;
				break;
			}
			i++;
		}
		if(count==0)
		{
			System.out.println("Prime number");
		}
		else
		{
			System.out.println("Not Prime number");
		}
	}
}


	/* Output : 
		
		Compile time : Success 
		
		Runtime :  Prime number */