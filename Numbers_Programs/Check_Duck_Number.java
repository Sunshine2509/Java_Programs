 
/* Duck Number : Duck numbers are special numbers that do not have their number beginning with 0 digits but do have zero digits in their number.

 The duck numbers can have zero in the middle, in the end, but not at the beginning of the number. */


class Check_Duck_Number
{
	// Main method

	public static void main(String args[])
	{
		// Declaration and initialization of the variable

		int num=103456;

		int count =0;

		// While loop 

		while(num>0)
		{
			 int rem=num%10;

			if(rem==0)
			{
				count++;			

				break;
			}

			num=num/10;
			
		}

		// Condition for Duck number

		if(count==1)
		{
			System.out.println("Duck number");
		}
		else
		{
			System.out.println("Not duck number");
		}


					
	}
	
}

	/* Output : 

		Compile time: Success 

		Runtime : Success and Duck number */

			