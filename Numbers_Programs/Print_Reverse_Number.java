/* Reverse Number: The reverse of a number is a mathematical method to obtain from a number another written in the opposite way to the first. 


class Print_Reverse_Number
{
	// Main method

	public static void main(String args[])
	{
		// Declaration and initialization of variable
		int num=1234;
		int copy_num=num;
		int rev_num=0;

		// while loop

		while(num>0)
		{
			int rem=num%10;

			// Logic for finding the reverse number

			rev_num=(rev_num*10)+rem;
			num=num/10;
		}
		System.out.println(rev_num);
	}
}


	/* Output : 

		Compile time : Success 

		Runtime : Success and 4321 */