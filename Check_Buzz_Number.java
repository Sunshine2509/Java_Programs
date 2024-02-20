// Buzz Numbers: Buzz numbers are those numbers that are divisible by seven or end with seven.

class Check_Buzz_Number
{
	// This is the main method.

	public static void main(String args[])
	{
		//Declaration and initialization of variable.

		int num=70;
		
		//Checking Buzz number using conditions through Ternary (Conditional) Operater.

		String Result=((num%7==0)||(num%10==0))?("The given number is Buzz number"):("The given number is not a buzz number");

		//Printing the Result

		System.out.println(Result);
	}
}


		/* Output: 

		Compile Time: Success

		Runtime: Success and The given number is Buzz number. */