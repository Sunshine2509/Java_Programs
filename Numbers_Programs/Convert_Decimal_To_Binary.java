class Convert_Decimal_To_Binary
{

	// Main method

	public static void main(String args[])
	{
		// Declaration and initialization of the variable

		int num=36;
		int binary=0;
		int b=1;

		 while(num>0)
		{
			// logic for converting decimal to binary

			int rem=num%2;
			binary=binary+rem*b;
			num=num/2;
			b=b*10;
		}
			System.out.println(binary);
	}
}
	

	/* Output: 

		Compile time : Success

		Runtime : Success and 100100	*/ 					