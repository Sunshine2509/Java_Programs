/* Sunny Number : A number is called Sunny number if the number next to the given number is a perfect square. 
	
	Example: If num=8, then next number of the given number is 9. 
		 And 9 is the perfect square of 3. 
		 Hence 8 is called Sunny Number. */


class Check_Sunny_Number
{
	// Main method 

	public static void main(String args[])
	{
		// Declaration and initialization of the variable.

		int num=3;
		int next_num=num+1;
		int product=0;

		// for loop 

		for(int i=1;i<next_num;i++)
		{
			 product=i*i;

			// condition for sunny number 

			if(product==next_num)
			{
			break;
			}
					
		}
		// check the condition for sunny number

		if(product==next_num)
		{
			System.out.println("Sunny Number");
		}
		else
		{
			System.out.println("Not a sunny number");
		}
	}
}


	/*Output: 

		Compile time :  Success 
		Runtime Success and Sunny Number*/
		
