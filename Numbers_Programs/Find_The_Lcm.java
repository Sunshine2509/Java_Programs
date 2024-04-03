// Java program , to find the LCM of two numbers . 

class Find_The_Lcm
{
	public static void main (String args[])
	{
		int num1=2;
		int num2=5;

		// find largest number among given numbers

		int largest=(num1>num2)?(num1):(num2);
		int i=1;
		int copy_largest=largest;

		// while loop 

		while(true)
		{
			if(largest%num1==0 && largest%num2==0)
			{
				System.out.println("LCM of the given numbers is "+largest);
				break;
			}

			// Updation 

			largest=copy_largest*i;
			i++;
		}
	}
} 


	/* Output : 

		Compile time : Success
		Runtime : LCM of the give numbers is 10  */