/*write a java programme to print the  count of digits in the given number.*/

class Count_Digit_Of_Number
{

	//Main method

	public static void main(String args[])
	{

		// Declaration and initialization of variable

		int N=12345678;
		int rem=0;
		int count=0;

		// do while loop
		
		do
		{
			rem=N%10;
			count++;			
			N=N/10;
		}while(N>0);
		System.out.println(count);	
	}
}


		/* Output: 
		
		Compile Time: Success 
		Runtime : Success and 8 */
