// Java program to check the given number(less than three digit) is buzz or not.

class Example_If_Else
{
	// Main method

	public static void main(String args[])
	{
		//Declaration and initialization of variable

		int num=89;
		
		// Condition for number which is less than three digit

		if(num/100==0)
		{
			// nested if 

			if(num/7==0||num%10==7)
			{
				System.out.println("Buzz number");
			}
			else
			{
				System.out.println("Not a buzz number");
			}
		}
		else
		{ 
			System.out.println(" Number is not in range");
		}
	}
}

	/* Output:
		Compile time: Success

		Runtime: Success and Not a buzz number */
