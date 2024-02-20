// Java program to check the given character is an alphabate or not.

class Check_Alphabet
{
	//This is the main method.

	public static void main(String args[])

	{
		//Declaration and initialization of variable.
		char ch = 'P';

		// Checking alphabet or not using the conditon through Ternary operator.

		String Result= ((ch>='A'&& ch<='Z')||(ch>='a'&& ch<='z'))?("The given character is an alphabet."):("The given character is an alphabet.");

		//Printing the result.

		System.out.println(Result);

	}

}


	/* Output : 

	Compile Time: Success

	Runtime: Success and The given character is an alphabet. */