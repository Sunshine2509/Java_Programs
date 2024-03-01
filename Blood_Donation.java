// Java program to check the person is eligible for blood donating or not.

class Blood_Donation
{
	// Main method
	public static void main(String[]args)
	{
		// Declaration and initialization of variable

		int hemoglobin=11;
		int age=25;
		char disease='N';
		char drugAddict='N';

		// checking the criteria for blood donation using nested if block

		if(age>=20&&age<=60)
		{
			if(hemoglobin>=13)
			{
				if(disease=='N')
				{
					if(drugAddict=='N')
					{
						System.out.println("You can donate blood");
					}
					else
					{
						System.out.println("Not allowed");
					}
				}
				else
				{
					System.out.println("Not allowed");
				}
			}
			else
			{
				System.out.println("Not allowed");
			}
		}
		else
		{
			System.out.println("Not allowed");
		}
		

	}
}

	/* Output: 

	Compile Time: Success 

	Runtime: Success and Not allowed */